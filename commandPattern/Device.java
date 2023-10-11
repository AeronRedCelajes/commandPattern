package commandPattern;

public class Device {
    private String device;
    public Device(String deviceName) {
        this.device = deviceName;
    }
    int brightness = 0;

    public String switchOn(){
        if(device.equals("Light")) {
            brightness++;
            return device + " is/are switched on!\nBrightness level is now " + brightness;
        }else if (device.equals("Music player"))
            return device + " is/are switched on!\nNow playing: Despacito";

        return device + " is/are switched on!";
    }

    public String switchOff(){
        if(device.equals("Light")) {
            brightness--;
            return device + " is/are switched off!\nBrightness level is now " + brightness;
        }
        return device + " is/are switched off!";
    }

    public String colorChangeRed(){
        if(device.equals("Light"))
            return "The color of the " + device + " is now red!";
        else
            return "This command is not available for this device.";
    }

    public String colorChangeWhite(){
        if(device.equals("Light"))
            return "The color of the " + device + " is now white!";
        else
            return "This command is not available for this device.";
    }

    public String increaseVol(){
        if(device.equals("Music player") || device.equals("TV") || device.equals("Tv"))
            return "The "+ device + " volume is increasing!";
        else
            return "This command is not available for this device.";
    }

    public String decreaseVol(){
        if(device.equals("Music player") || device.equals("TV") || device.equals("Tv"))
            return "The "+ device + " volume is decreasing!";
        else
            return "This command is not available for this device.";
    }

    public String increaseTemp(){
        if(device.equals("Thermostat"))
            return "The temperature is increasing using the " + device + "!";
        else
            return "This command is not available for this device.";
    }

    public String decreaseTemp(){
        if(device.equals("Thermostat"))
            return "The temperature is decreasing using the " + device + "!";
        else
            return "This command is not available for this device.";
    }
}
