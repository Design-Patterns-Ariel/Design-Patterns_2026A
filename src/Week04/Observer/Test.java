package Week04.Observer;

import java.util.Random;

public class Test {

    static Random rd = new Random();

    public static void main(String[] args) {
        Person[] people = new Person[10];
//        for (int i = 0; i < 10; i++) {
//            people[i] = new Student(i + "",
//                    "last" + i,
//                    rd.nextInt(50) + 18,
//                    "12345678" + i,
//                    rd.nextBoolean() ? 'F' : 'M', "050123456" + i,
//                    i + "@msmail.ariel.ac.il");
//
//        }
//
//
//        for (int i = 0; i < people.length; i++) {
//            if (people[i] instanceof Student)
//                ((Student) people[i]).update("Hello");
//        }


        NotificationSystem notificationSystem = new NotificationSystem();
        for (int i = 0; i < 10; i++) {
            people[i] = new Student(i + "",
                    "last" + i,
                    rd.nextInt(50) + 18,
                    "12345678" + i,
                    rd.nextBoolean() ? 'F' : 'M', "050123456" + i,
                    i + "@msmail.ariel.ac.il");
            if (people[i] instanceof NotificationObserver && i % 2 == 0)
                notificationSystem.registerObserver((NotificationObserver) people[i]);
        }
        notificationSystem.setMsg("Hello!");
        notificationSystem.notifyObserver();


        ObserverSystem system = new ObserverSystem();
        for (int i = 0; i < 10; i++) {
            people[i] = new Student(i + "",
                    "last" + i,
                    rd.nextInt(50) + 18,
                    "12345678" + i,
                    rd.nextBoolean() ? 'F' : 'M', "050123456" + i,
                    i + "@msmail.ariel.ac.il");
            if (people[i] instanceof IObserver )
                system.attach((IObserver) people[i]);
        }
       system.notifyMsg(0,"Hello");
       system.notifyMsg(1,"Hello");
       system.notifyMsg(2,"Hello");
    }
}
