package commandPattern;

public class ChangeColorWhite implements Command {
    private Device device;

    public ChangeColorWhite(Device device){
        this.device = device;
    }

    public String execute(){
        return device.colorChangeWhite();
    }
}