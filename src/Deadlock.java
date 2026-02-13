public class Deadlock {

    private static final Object loock1 = new Object();
    private static final Object loock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (loock1) {
                System.out.println("t1 has lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //sout
                }

                System.out.println("waiting for t1 has lock");
                synchronized (loock2) {
                    System.out.println("t2 has lock");

                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (loock1) {
                System.out.println("t2 has lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //sout
                }
                System.out.println("t2 waiting for lock1");
                synchronized (loock2) {
                    System.out.println("t1 has lock");

                }
            }
        });

        t1.start();
        t2.start();
    }
}

