package Java.MultithreadingPrograms;

public class ThreadExamples {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }, "worker");
        System.out.println("Before start: " + worker.getState());
        worker.start();
        System.out.println("After start: " + worker.getState());
        worker.join();
        System.out.println("After join: " + worker.getState());
        Thread daemon = new Thread(() -> System.out.println("Daemon thread running"), "daemon");
        daemon.setDaemon(true);
        daemon.start();
        System.out.println("Daemon: " + daemon.isDaemon());
        Thread.yield();
    }
}