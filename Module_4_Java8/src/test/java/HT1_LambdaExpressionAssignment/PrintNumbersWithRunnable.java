package HT1_LambdaExpressionAssignment;

public class PrintNumbersWithRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("number without lambda " + i);
        }
    }

    public static void main(String args[]) {
        //withhout lambda
        Thread t1 = new Thread(new PrintNumbersWithRunnable());
        t1.start();

        //with lambda
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("numbers with lambda " + i);
            }
        };

        runnable.run();


    }

}
