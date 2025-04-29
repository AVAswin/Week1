class TextState {
    String content;
    TextState prev;
    TextState next;

    public TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    private TextState head = null;
    private TextState tail = null;
    private TextState current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add a new state (after typing or any change)
    public void addState(String newText) {
        TextState newState = new TextState(newText);

        // If current is not the tail, discard all redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newState;
        } else {
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
        }

        size++;
        if (size > MAX_HISTORY) {
            // Remove oldest (head)
            head = head.next;
            head.prev = null;
            size--;
        }
        System.out.println("State added.");
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Display current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }
}

public class UndoRedoFunction {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrentState();  // Hello World!

        editor.undo();
        editor.displayCurrentState();  // Hello World

        editor.undo();
        editor.displayCurrentState();  // Hello

        editor.redo();
        editor.displayCurrentState();  // Hello World

        editor.addState("Hello Java");  // Redo history is now lost
        editor.redo();                  // Nothing to redo
        editor.displayCurrentState();  // Hello Java
    }
}
