//Spencer Paradis-Fichtner
//2/28/20 updated 2/29/20




public class superTask {


    /**
     *Just a fun little experiment to see a super task in action and also to see the stack overflow error
     * @param seconds
     * @param counter
     */
    public static void task(int seconds, int counter){
        int count =counter;
        int milliseconds = seconds*1000;
        try {
            Thread.sleep(milliseconds/2); // waits half the time the first time
            System.out.println(count);
        } catch(InterruptedException e) {
            //
            //
            //
        }
        count++;
        task(seconds/2, count);
    }

    /**
     * just a basic counter thats counts up by 1 every second. Nothing special. Just shows how "Thread.sleep" works.
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

    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        task(60, 1);
        //counter(0);
    }


}
