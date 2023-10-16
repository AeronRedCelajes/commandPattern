package commandPattern;

public class IncreaseTemperature implements Command {
    private Device device;

    public IncreaseTemperature(Device device){
        this.device = device;
    }

    @Override
    public String execute(){
        return device.increaseTemp();
    }
}