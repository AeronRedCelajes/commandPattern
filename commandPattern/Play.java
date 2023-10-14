package commandPattern;

public class Play {
    private Device device;

    public Play(Device device){
        this.device = device;
    }

    public String execute(){
        return device.play();
    }
}
