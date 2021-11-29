public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(3000);
                System.out.printf("%s работаю\n", getName());
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
