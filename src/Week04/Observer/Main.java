package Week04.Observer;

import java.util.Random;

public class Main {

    static Random rd = new Random();

    public static void main(String[] args) {
//        Subject subject = new Subject();
//
//        BinaryObserver b = new BinaryObserver(subject);
//        OctalObserver o = new OctalObserver(subject);
//        HexObserver h = new HexObserver(subject);
//
//        System.out.println("First state 10");
//        subject.setState(10);
//
//        for (int i = 0; i < 10; i++) {
//            int state = new Random().nextInt(80);
//            System.out.println("State " + state);
//            subject.setState(state);
//        }

//        IObserverSystem system = new ObserverSystem();
//
//        Person[] people = new Person[10];
//        for (int i = 0; i < 10; i++) {
//            people[i] = new Student(i + "",
//                    "last" + i,
//                    rd.nextInt(50) + 18,
//                    "12345678" + i,
//                    rd.nextBoolean() ? 'F' : 'M', "050123456" + i,
//                    i+"@msmail.ariel.ac.il");
//            system.attach(people[i]);
//        }
//        system.notifyMsg(1,"Hello");
//
//        system.notifyMsg(0,"Hello");

        NotificationSystem notificationSystem = new NotificationSystem();
        Person[] people = new Person[10];
        for (int i = 0; i < 10; i++) {
            people[i] = new Student(i + "",
                    "last" + i,
                    rd.nextInt(50) + 18,
                    "12345678" + i,
                    rd.nextBoolean() ? 'F' : 'M', "050123456" + i,
                    i + "@msmail.ariel.ac.il");
            if (people[i] instanceof Student)
                notificationSystem.registerObserver(((Student) people[i]));
        }
        notificationSystem.setMsg("Hello!");
        notificationSystem.notifyObserver();
    }
}
