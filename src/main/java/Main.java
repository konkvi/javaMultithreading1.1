public class Main {
    public static void main(String[] args){
        ThreadGroup group = new ThreadGroup("Группа потоков");
        final MyThread thread1 = new MyThread(group, "Я поток 1");
        final MyThread thread2 = new MyThread(group, "Я поток 2");
        final MyThread thread3 = new MyThread(group, "Я поток 3");
        final MyThread thread4 = new MyThread(group, "Я поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException err) {

        }
        group.interrupt();
    }
}
