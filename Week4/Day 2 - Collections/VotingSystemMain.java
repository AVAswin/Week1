import java.util.*;

class VotingSystem {
    private HashMap<String, Integer> voteCount;
    private LinkedHashMap<Integer, String> voteOrder;
    private TreeMap<String, Integer> sortedVotes;
    private int voteIdCounter;

    public VotingSystem() {
        voteCount = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
        sortedVotes = new TreeMap<>();
        voteIdCounter = 1;
    }

    // Cast a vote for a candidate
    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(voteIdCounter++, candidate);
    }

    // Display votes in the order they were cast
    public void displayVotesInOrder() {
        System.out.println("🗳️ Votes in order:");
        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
            System.out.println("Vote #" + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display candidates sorted by their names
    public void displaySortedCandidates() {
        sortedVotes.clear();
        sortedVotes.putAll(voteCount);

        System.out.println("📋 Candidates (Sorted by Name):");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Display current vote counts (unordered)
    public void displayVoteCount() {
        System.out.println("📊 Current Vote Counts:");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }
}

class VotingSystemMain {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");

        system.displayVotesInOrder();
        System.out.println();
        system.displayVoteCount();
        System.out.println();
        system.displaySortedCandidates();
    }
}
