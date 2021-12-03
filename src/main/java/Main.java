public class Main {
    public static void main(String[] args){
        final int TIME_TO_WAIT = 15000;
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
            Thread.sleep(TIME_TO_WAIT);
        } catch (InterruptedException err) {

        }
        group.interrupt();
        System.out.println("Завершаю все потоки");
    }
}
