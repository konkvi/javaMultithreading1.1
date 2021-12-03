public class MyThread extends Thread {
    public static final int TIME_TO_SLEEP = 3000;
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(TIME_TO_SLEEP);
                System.out.printf("%s работаю\n", Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}
