package Week02.Threads;

import java.util.ArrayList;

public class TwoThread {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    System.out.println(" Thread t = new Runnable() ");
            }
        });
        t.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    System.out.println("new Runnable()");
            }
        }).start();


        Server p = new Server();
        p.start();

        Thread t1 = new Thread(new printThread());
        t1.start();

        while (true)
            System.out.println("Hello");


    }
}

class printThread implements Runnable {

    @Override
    public void run() {
        while (true)
            System.out.println("run from print-Thread");
    }
}


class Server extends Thread {

    @Override
    public void run() {
        while (true)
            System.out.println("run from Server");
    }
}