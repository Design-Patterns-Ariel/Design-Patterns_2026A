package Week02.Iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Store s = new Store();
        Iterator t = s.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }

    }

}



