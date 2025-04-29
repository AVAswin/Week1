import java.util.*;

class SetInterface {
    // Q1 Methods
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }

    // Q2 Methods
    public static List<Integer> findIntersection(Set<Integer> s1, Set<Integer> s2) {
        List<Integer> ans = new ArrayList<>();
        for(Integer item : s1) {
            if(s2.contains(item)) {
                ans.add(item);
            }
        }
        return ans;
    }

    public static List<Integer> findUnion(Set<Integer> s1, Set<Integer> s2) {
        List<Integer> ans = new ArrayList<>();
        for(Integer item : s1) {
            if(!s2.contains(item)) {
                ans.add(item);
            }
        }
        for(Integer item : s2) {
            if(!s1.contains(item)) {
                ans.add(item);
            }
        }
        return ans;
    }

    // Q3 Methods
    public static List<Integer> findSymmetricDifference(Set<Integer> s1, Set<Integer> s2) {
        List<Integer> ans = new ArrayList<>();
        for(Integer num : s1) {
            if(!s2.contains(num)) {
                ans.add(num);
            }
        }
        for(Integer num : s2) {
            if(!s1.contains(num)) {
                ans.add(num);
            }
        }

        return ans;
    }

    // Q4 Methods
    public static List<Integer> convertSetToSortedList(Set<Integer> s1) {
        List<Integer> ans = new ArrayList<>();
        for(Integer item : s1) {
            ans.add(item);
        }
        return ans;
    }

    // Q5 Methods
    public static boolean isSubset(Set<Integer> s1, Set<Integer> s2) {
        for(Integer item : s2) {
            if(!s1.contains(item)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Q1) Set Equality
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println(areSetsEqual(set1, set2));  // Output: true

        // Q2) Union and Intersection
        Set<Integer> set3 = new HashSet(Arrays.asList(1, 2, 3, 6, 7));
        Set<Integer> set4 = new HashSet(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> intersection = findIntersection(set3, set4);
        for(Integer num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();
        List<Integer> union = findUnion(set3, set4);
        for(Integer num : union) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Q3) Find Symmetric Difference
        Set<Integer> s1 = new HashSet(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet(Arrays.asList(4, 2, 5));
        List<Integer> ans1 = findSymmetricDifference(s1, s2);
        for(Integer num : ans1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Q4) Set to a Sorted List
        List<Integer> ans2 = convertSetToSortedList(s2);
        for(Integer num : ans2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Q5) Find Subsets
        Set<Integer> set5 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set6 = new HashSet<>(Arrays.asList(3, 2));
        System.out.println(isSubset(set5, set6));  // Output: true
        System.out.println();
    }
}
