public class ServeCustomer implements Runnable{
    public int window;
    public String category;
    public ServeCustomer(int window, String category) {
        this.window = window;
        this.category = category;
    }
    @Override
    public void run(){
        boolean busy;
        switch (window) {
            case 1:
                busy = Task3.window1Busy;
                Task3.window1Busy = true;
                break;
            case 2:
                busy = Task3.window2Busy;
                if (!category.equals("old") && !category.equals("business")) {
                    Task3.window2Busy = true;
                } else {
                    return;
                }
                break;
            case 3:
                busy = Task3.window3Busy;
                if (!category.equals("young")) {
                    Task3.window3Busy = true;
                } else {
                    return;
                }
                break;
            default:
                busy = false;
                break;
        }

        if (busy) {
            switch (category) {
                case "young":
                    Task3.angryYoungClients++;
                    break;
                case "old":
                    Task3.angryOldClients++;
                    break;
                case "business":
                    Task3.angryBusinessClients++;
                    break;
                default:
                    break;
            }
        }


}
}
