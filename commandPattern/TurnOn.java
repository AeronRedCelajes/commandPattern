package commandPattern;

public class TurnOn {
    private Device device;

    public TurnOn(Device device){
        this.device = device;
    }

    public String execute(){
        return device.switchOn();
    }
}
