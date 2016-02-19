package dcll.yelg;


import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty();
    /**
     * Returns the number of items in this stack.
     */
    public int getSize();

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public void push(Item item);

    public Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    Item pop() throws EmptyStackException;
}