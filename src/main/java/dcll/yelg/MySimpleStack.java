package dcll.yelg;

import java.util.EmptyStackException;

/**
 * Created by HP on 19/02/2016.
 */
public class MySimpleStack implements SimpleStack {
        @Override
        public Item pop() throws EmptyStackException {
            return null;
           /* Item i=new Item();
            return i;*/
        }

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public int getSize() {
            return 0;
        }

        @Override
        //répondre à l'exigence #2
        public void push(Item item) {
            MySimpleStack Ms=new MySimpleStack();

        }

        @Override
        public Item peek() throws EmptyStackException {
            return null;
            /*Item i=new Item();
            return i;*/
        }
    }


