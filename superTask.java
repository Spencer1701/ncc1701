//Spencer Paradis-Fichtner
//2/28/20




public class superTask {


    /**
     *Just a fun little experiment to see how a super task would be implemented
     * and also to see the stack overflow error.
     *
     * @param seconds initial delay
     * @param counter starting point of your counter and keeps track for subsequent calls
     */
    public static void task(int seconds, int counter){
        int count =counter;
        int time = seconds*1000; // converts seconds to appropriate milliseconds
        try {
            Thread.sleep(seconds/2); // waits half the time the first time
            System.out.println(count);
        } catch(InterruptedException e) {
            //
            //
            //
        }
        count++;
        task(time/2, count);
    }

    /**
     * just a basic counter thats counts up by 1 every second. Nothing special.
     * @param count desired starting point
     */
    public static void counter(int count) {
        int toPrint = count;
        try {
            Thread.sleep(1000); // waits 1 seconds
            System.out.println(count);
        } catch (InterruptedException e) {
//            System.out.println("hi");
        }
        count++;
        counter(count);
    }









    public static void main(String[] args){
        task(60, 0);
        //counter(0);
    }






}
