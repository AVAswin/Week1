import java.time.LocalDate;
import java.util.*;

class Policy {
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;

    public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}

class PolicyManager {
    private HashMap<String, Policy> policyMap = new HashMap<>();
    private LinkedHashMap<String, Policy> insertionOrderMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> expiryMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderMap.put(policy.getPolicyNumber(), policy);

        expiryMap.putIfAbsent(policy.getExpiryDate(), new ArrayList<>());
        expiryMap.get(policy.getExpiryDate()).add(policy);
    }

    public Policy getPolicyByNumber(String number) {
        return policyMap.get(number);
    }

    public List<Policy> getPoliciesExpiringInNext30Days() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        List<Policy> result = new ArrayList<>();

        for (Map.Entry<LocalDate, List<Policy>> entry : expiryMap.subMap(today, true, threshold, true).entrySet()) {
            result.addAll(entry.getValue());
        }

        return result;
    }

    public List<Policy> getPoliciesByHolder(String name) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policyMap.values()) {
            if (p.getPolicyHolderName().equalsIgnoreCase(name)) {
                result.add(p);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        NavigableMap<LocalDate, List<Policy>> expired = expiryMap.headMap(today, false);

        for (LocalDate date : new ArrayList<>(expired.keySet())) {
            for (Policy p : expiryMap.get(date)) {
                policyMap.remove(p.getPolicyNumber());
                insertionOrderMap.remove(p.getPolicyNumber());
            }
            expiryMap.remove(date);
        }
    }

    public void printAllPoliciesInInsertionOrder() {
        for (Policy p : insertionOrderMap.values()) {
            System.out.println(p);
        }
    }
}

class PolicyManagerMain {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(5)));
        manager.addPolicy(new Policy("P003", "Alice", LocalDate.now().minusDays(1))); // expired
        manager.addPolicy(new Policy("P004", "Charlie", LocalDate.now().plusDays(40)));

        System.out.println("📄 Policies for Alice:");
        manager.getPoliciesByHolder("Alice").forEach(System.out::println);

        System.out.println("\n⏰ Policies expiring in next 30 days:");
        manager.getPoliciesExpiringInNext30Days().forEach(System.out::println);

        System.out.println("\n🧹 Removing expired policies...");
        manager.removeExpiredPolicies();

        System.out.println("\n📜 All Policies (Insertion Order):");
        manager.printAllPoliciesInInsertionOrder();
    }
}
