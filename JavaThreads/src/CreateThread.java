// There are two ways to create a thread
//1. Declare a new class as a subclass of the Thread class
//2. Must override the run() method
//3. An instance of this subclass can be allocated and started



public class CreateThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <=5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
