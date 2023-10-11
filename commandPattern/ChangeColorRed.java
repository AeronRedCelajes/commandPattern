package commandPattern;

public class ChangeColorRed implements Command{
    private Device device;

    public ChangeColorRed(Device device){
        this.device = device;
    }

    public String execute(){
        return device.colorChangeRed();
    }
}