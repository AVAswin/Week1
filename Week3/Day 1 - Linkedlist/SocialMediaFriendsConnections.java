import java.util.*;

class User {
    int userID;
    String name;
    int age;
    List<Integer> friendIDs;
    User next;

    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendIDs = new ArrayList<>();
        this.next = null;
    }
}

class SocialNetwork {
    private User head;

    // Add a new user
    public void addUser(int userID, String name, int age) {
        if (findUserByID(userID) != null) {
            System.out.println("User ID already exists.");
            return;
        }
        User newUser = new User(userID, name, age);
        newUser.next = head;
        head = newUser;
        System.out.println("User added: " + name);
    }

    // Add a friend connection (bi-directional)
    public void addFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIDs.contains(userID2)) user1.friendIDs.add(userID2);
        if (!user2.friendIDs.contains(userID1)) user2.friendIDs.add(userID1);
        System.out.println("Friend connection added between " + userID1 + " and " + userID2);
    }

    // Remove a friend connection
    public void removeFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIDs.remove(Integer.valueOf(userID2));
        user2.friendIDs.remove(Integer.valueOf(userID1));
        System.out.println("Friend connection removed between " + userID1 + " and " + userID2);
    }

    // Display all friends of a user
    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        for (int friendID : user.friendIDs) {
            User friend = findUserByID(friendID);
            if (friend != null) {
                System.out.print(friend.name + " (" + friendID + ") ");
            }
        }
        System.out.println();
    }

    // Find mutual friends between two users
    public void mutualFriends(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        Set<Integer> set = new HashSet<>(user1.friendIDs);
        System.out.print("Mutual friends: ");
        boolean found = false;
        for (int id : user2.friendIDs) {
            if (set.contains(id)) {
                User mutual = findUserByID(id);
                if (mutual != null) {
                    System.out.print(mutual.name + " (" + mutual.userID + ") ");
                    found = true;
                }
            }
        }

        if (!found) System.out.print("None");
        System.out.println();
    }

    // Search user by ID
    public void searchByID(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.println("User found: " + user.name + ", Age: " + user.age);
        } else {
            System.out.println("User not found.");
        }
    }

    // Search user by name
    public void searchByName(String name) {
        User temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + temp.name + " (ID: " + temp.userID + ", Age: " + temp.age + ")");
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No user found with name: " + name);
        }
    }

    // Count number of friends for each user
    public void countAllFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIDs.size() + " friend(s).");
            temp = temp.next;
        }
    }

    // Helper method to find a user by ID
    private User findUserByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) return temp;
            temp = temp.next;
        }
        return null;
    }
}

public class SocialMediaFriendsConnections {
    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addUser(1, "Alice", 22);
        sn.addUser(2, "Bob", 24);
        sn.addUser(3, "Charlie", 23);
        sn.addUser(4, "David", 25);

        sn.addFriend(1, 2);
        sn.addFriend(1, 3);
        sn.addFriend(2, 3);

        sn.displayFriends(1);
        sn.displayFriends(2);

        sn.mutualFriends(1, 2);

        sn.removeFriend(1, 2);
        sn.displayFriends(1);

        sn.searchByName("Charlie");
        sn.searchByID(4);

        sn.countAllFriends();
    }
}
