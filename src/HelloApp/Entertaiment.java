package HelloApp;

public class Entertaiment {
    private boolean on;
    private int     volume;

    public Entertaiment(boolean on, int volume) {
        this.on = on;
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        if(this.isOn() == true){
            return "ON" + ", volume = " + this.getVolume();
        }else{
            return "OFF" + ", volume = " + this.getVolume();
        }
    }
}
