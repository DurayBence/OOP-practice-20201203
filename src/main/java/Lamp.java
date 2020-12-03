public class Lamp {

    private static final int MAX_INTENSITY = 10;

    private boolean isTurnedOn = false;
    private int intensity = 0;

    public void turnOn() {
        //if (!isTurnedOn) {
        //    this.isTurnedOn = true;
        //}
        this.setIntensity(MAX_INTENSITY);
    }
    public void turnOff() {
        //if (isTurnedOn) {
        //    this.isTurnedOn = false;
        //}
        this.setIntensity(0);
    }
    public boolean isTurnedOn(){
        //return this.isTurnedOn;
        return this.intensity > 0;
    }

    public int getIntensity() {
        return this.intensity;
    }
    public void setIntensity (int newIntensity){
        this.intensity = newIntensity;

        if (this.intensity < 0) {
            this.intensity = 0;
        }
        if (this.intensity > MAX_INTENSITY) {
            this.intensity = MAX_INTENSITY;
        }
    }

}