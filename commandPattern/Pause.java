package commandPattern;

public class Pause implements Command{
    private Device device;

    public Pause(Device device){
        this.device = device;
    }

    @Override
    public String execute(){
        return device.pause();
    }
}
