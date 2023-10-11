package commandPattern;

public class TurnOff {
    private Device device;

    public TurnOff(Device device){
        this.device = device;
    }

    public String execute(){
        return device.switchOff();
    }
}
