import java.util.Random;

public class Task3 {

    private static final int TOTAL_CUSTOMERS = 1000;

    public static boolean window1Busy = false;
    public static boolean window2Busy = false;
    public static boolean window3Busy = false;

    public static int angryYoungClients = 0;
    public static int angryOldClients = 0;
    public static int angryBusinessClients = 0;

    public static void main(String[] args) {
        for (int i = 0; i < TOTAL_CUSTOMERS; i++) {
            int category = new Random().nextInt(3); // 0 - young, 1 - old, 2 - business

            switch (category) {
                case 0:
                    new ServeCustomer(1, "young");
                    new ServeCustomer(2, "young");
                    new ServeCustomer(3, "young");
                    angryYoungClients++;
                    break;
                case 1:
                    new ServeCustomer(1, "old");
                    new ServeCustomer(2, "old");
                    new ServeCustomer(3, "old");
                    angryOldClients++;
                    break;
                case 2:
                    new ServeCustomer(1, "business");
                    new ServeCustomer(2, "business");
                    new ServeCustomer(3, "business");
                    angryBusinessClients++;
                    break;
                default:
                    break;
            }
        }

        double percentAngryYoungClients = (double) angryYoungClients / TOTAL_CUSTOMERS  * 100;
        double percentAngryOldClients = (double) angryOldClients / TOTAL_CUSTOMERS  * 100;
        double percentAngryBusinessClients = (double) angryBusinessClients / TOTAL_CUSTOMERS * 100;

        System.out.println("Процент злой молодёжи: " + percentAngryYoungClients + "%");
        System.out.println("Процент злых стариков: " + percentAngryOldClients + "%");
        System.out.println("Процент злых бизнесменов: " + percentAngryBusinessClients + "%");
    }
}