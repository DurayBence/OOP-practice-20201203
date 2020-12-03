public class Stopwatch {

    private long timeStarted = -1;
    private long timeStopped = -1;
    //private boolean isStarted = false;

    public void start() {
        //if (!isStarted) {
        if (this.isStarted()) {
            timeStopped = 0;
            timeStarted = System.currentTimeMillis();
            System.out.println("Stopwatch started...");
            //isStarted = true;
        } else {
            System.out.println("Stopwatch is already running!");
        }
    }
    public void stop() {
        //if (isStarted) {
        if (this.isStarted()) {
            timeStopped = System.currentTimeMillis();
            System.out.println("Stopwatch stopped...");
            //isStarted = false;
        } else {
            System.out.println("Stopwatch is already stopped!");
        }
    }

    public boolean isStarted() {
        // return isStarted;
        return timeStarted > -1;
    }

    public long getCurrentTime() {
        if (isStarted()) {
            return System.currentTimeMillis() - timeStarted;
        } else {
            return timeStopped - timeStarted;
        }
    }
}
