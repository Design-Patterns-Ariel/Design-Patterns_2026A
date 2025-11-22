package Week02.Iterator;

import java.util.Iterator;

public class Store {


    private Object[] object;


    public Store() {
        this.object = new Object[100];
        for (int i = 0; i < 100; i++) {
            object[i] = i;
        }
    }

    public Iterator iterator() {
        return new Iterator() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return object.length > index;
            }

            @Override
            public Object next() {
                Object o = object[index];
                index += 2;
                return o;
            }
        };
    }

}
