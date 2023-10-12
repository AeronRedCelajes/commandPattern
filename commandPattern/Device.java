package commandPattern;

public class Device {
    private String device;
    private int brightness = 0;
    private static double temperature = 23.0;
    public Device(String deviceName) {
        this.device = deviceName;
    }

    public String switchOn(){
        if(device.equals("Light")) {
            brightness = 1;
            return device + " is/are switched on!\nBrightness level is now " + brightness;
        }else if (device.equals("Music player"))
            return device + " is/are switched on!\nNow playing: Payphone";

        return device + " is/are switched on!";
    }

    public String switchOff(){
        if(device.equals("Light")) {
            brightness = 0;
            return device + " is/are switched off!\nBrightness level is now " + brightness;
        }
        return device + " is/are switched off!";
    }

    public String increaseVol(){
        return "The "+ device + " volume is increasing!";
    }

    public String decreaseVol(){
        return "The "+ device + " volume is decreasing!";
    }

    public String increaseTemp(){
        if(device.equals("Thermostat")){
            temperature++;
            return "The temperature is increasing using the " + device + "!\nTemperature level is now " + temperature + " degrees Celsius.";
        }
        return "The temperature is increasing using the " + device;
    }

    public String decreaseTemp(){
        if(device.equals("Thermostat")){
            temperature--;
            return "The temperature is decreasing using the " + device + "!\nTemperature level is now " + temperature + " degrees Celsius.";
        }
        return "The temperature is decreasing using the " + device;
    }
}
