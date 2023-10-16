package commandPattern;

public class Play implements Command{
    private Device device;

    public Play(Device device){
        this.device = device;
    }

    @Override
    public String execute(){
        return device.play();
    }
}
