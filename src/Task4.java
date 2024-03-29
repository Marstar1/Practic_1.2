public class Task4 {
    private static final int NUM_PATIENTS = 100;
    public static void main(String[] args) {
        Thread[] patients = new Thread[NUM_PATIENTS];

        for (int i = 0; i < NUM_PATIENTS; i++) {
            patients[i] = new Thread(new Task4a());
        }

        for (int i = 0; i < NUM_PATIENTS; i++) {
            patients[i].start();
        }

        for (int i = 0; i < NUM_PATIENTS; i++) {
            try {
                patients[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Максимальная длина очереди: " + Task4a.maxQueueSize);
    }
}