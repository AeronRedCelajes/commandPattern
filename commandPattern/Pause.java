package commandPattern;

public class Pause {
    private Device device;

    public Pause(Device device){
        this.device = device;
    }

    public String execute(){
        return device.pause();
    }
}
