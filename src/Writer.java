import java.util.concurrent.CopyOnWriteArrayList;

class Writer implements Runnable {
    private CopyOnWriteArrayList<Integer> listOfNumbers;

    public Writer(CopyOnWriteArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run() {
        int number = 0;
        while (true) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            listOfNumbers.add(number);
            System.out.println("Записанных номеров: " + number);
            number++;
        }
    }
}