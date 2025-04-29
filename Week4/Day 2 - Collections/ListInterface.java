import java.util.*;

public class ListInterface {
    // Q1 Methods
    // Method to reverse an ArrayList
    public static List<Integer> reverseArrayList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        return list;
    }

    // Method to reverse a LinkedList
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        return list;
    }

    // Q2 Methods
    public static void findFrequencyOfElements(List<String> strs) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : strs) {
            if(map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            }
            else {
                map.put(str, 1);
            }
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Q3 Methods
    public static List<Integer> rotateElements(int k, List<Integer> nums) {
        int n = nums.size();
        k = k % n;

        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();
        for(int i=0;i<k;i++) {
            secondHalf.add(nums.get(i));
        }
        for(int i=k;i<n;i++) {
            firstHalf.add(nums.get(i));
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<firstHalf.size();i++) {
            ans.add(firstHalf.get(i));
        }
        for(int i=0;i<secondHalf.size();i++) { 
            ans.add(secondHalf.get(i)); 
        } 

        return ans;
    }
    // Q4 Methods
    public static List<Integer> remove(List<Integer> nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for(Integer num : nums) {
            if(!seen.contains(num)) {
                seen.add(num);
                ans.add(num);
            }
        }

        return ans;
    }
    // Q5 Methods
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        // Two iterators for the two-pointer technique
        ListIterator<T> first = list.listIterator();
        ListIterator<T> second = list.listIterator();

        // Move the first pointer 'n' steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("List is shorter than N");
            }
            first.next();
        }

        // Move both pointers until 'first' reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        // 'second' now points to the Nth element from the end
        return second.next();
    }

    public static void main(String[] args) {
        // Q1) Reverse ArrayList and LinkedList

        // Example using ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); arrayList.add(2); arrayList.add(3);
        arrayList.add(4); arrayList.add(5);
        System.out.println("Original ArrayList: " + arrayList);
        List<Integer> reversedArrayList = reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + reversedArrayList);

        // Example using LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1); linkedList.add(2); linkedList.add(3);
        linkedList.add(4); linkedList.add(5);
        System.out.println("\nOriginal LinkedList: " + linkedList);
        LinkedList<Integer> reversedLinkedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);
        System.out.println();

        // Q2) Frequency of Elements
        List<String> strs = Arrays.asList("apple", "banana", "orange", "apple");
        ListInterface.findFrequencyOfElements(strs);
        System.out.println();

        // Q3) Rotate Elements in List
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> ans = ListInterface.rotateElements(42, nums);
        for(int i=0; i<ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        System.out.println();

        // Q4) Remove Duplicates Preserve Order
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 7, 7);
        List<Integer> ans1 = ListInterface.remove(nums1);
        for(Integer i : ans1) {
            System.out.println(i);
        }
        System.out.println();

        // Q5) Nth From End
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int N = 2;
        String result = findNthFromEnd(list, N);
        System.out.println(result);  // Output: D
        System.out.println();

    }
}
