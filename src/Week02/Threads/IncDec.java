package Week02.Threads;

public class IncDec {

    static int cnt = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start Thread t");
                for (int i = 0; i < 10000000; i++) {
                    count(1);
                }
                System.out.println("End Thread t");
            }
        });

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start Thread t1");
                for (int i = 0; i < 10000000; i++) {
                    count(-1);
                }
                System.out.println("End Thread t1");
            }
        });

        t.start();
        t1.start();

        t1.join(3);
        t.join();
        System.out.println(Thread.currentThread().getName());
        System.out.println("output -> " + cnt);
    }


    static synchronized void count(int c) {
        cnt += c;
    }


}
