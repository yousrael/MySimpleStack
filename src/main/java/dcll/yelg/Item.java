package dcll.yelg;

import java.util.EmptyStackException;

/**
 * Created by HP on 19/02/2016.
 */
public class Item implements SimpleStack {
    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }
}