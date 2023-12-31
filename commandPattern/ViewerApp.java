package commandPattern;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewerApp {
    public static ArrayList<String> devices = new ArrayList<>(); //devices

    public static void main(String[] args){

        /*  Aeron Red R. Celajes
            3BSCS-1
            Lab Assignment 5 Command Pattern
        */

        //default devices
        devices.add("Light");
        devices.add("Thermostat");
        devices.add("Music player");

        while(true){

            Scanner userInput = new Scanner(System.in);

            //prints out the current available devices
            System.out.println("Devices available: ");
            for (String s : devices)
                System.out.println(s);

            //validation of device input
            String device = "";
            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("\nWhich device do you wish to use?: ");
                device = userInput.nextLine();

                if (devices.contains(device))
                    validChoice = true;
                else
                    System.out.println("Invalid device choice. Please choose from the available devices.");
            }

            //calls out all the commands
            System.out.println("\nThese are the only available commands: ");
            System.out.println("""
                     1 = Turn On
                     2 = Turn Off
                     3 = Increase Volume
                     4 = Decrease Volume
                     5 = Increase Temperature
                     6 = Decrease Temperature
                     7 = Play
                     8 = Pause""");

            String commandChoice = "";
            boolean validChoice2 = false;
            while (!validChoice2) {
                System.out.print("\nWhich command do you wish to apply on " + device + "? Please choose a number: ");
                commandChoice = userInput.nextLine();

                if (commandChoice.equals("1") || commandChoice.equals("2") || commandChoice.equals("3") || commandChoice.equals("4")
                || commandChoice.equals("5") || commandChoice.equals("6") || commandChoice.equals("7") || commandChoice.equals("8"))
                    validChoice2 = true;
                else
                    System.out.println("Invalid input choice. Please choose between 1-6.");
            }

            Device myDevice = new Device(device);
            CentralHub ch = new CentralHub();

            switch (commandChoice) {
                case "1":
                    TurnOn turnOn = new TurnOn(myDevice);
                    System.out.println(turnOn.execute());
                break;
                case "2":
                    TurnOff turnOff = new TurnOff(myDevice);
                    System.out.println(turnOff.execute());
                break;
                case "3":
                    IncreaseVolume increaseVolume = new IncreaseVolume(myDevice);
                    System.out.println(increaseVolume.execute());
                break;
                case "4":
                    DecreaseVolume decreaseVolume = new DecreaseVolume(myDevice);
                    System.out.println(decreaseVolume.execute());
                break;
                case "5":
                    IncreaseTemperature increaseTemperature = new IncreaseTemperature(myDevice);
                    System.out.println(increaseTemperature.execute());
                break;
                case "6":
                    DecreaseTemperature decreaseTemperature = new DecreaseTemperature(myDevice);
                    System.out.println(decreaseTemperature.execute());
                    break;
                case "7":
                    Play play = new Play(myDevice);
                    System.out.println(play.execute());
                    break;
                default:
                    Pause pause = new Pause(myDevice);
                    System.out.println(pause.execute());
            }

            //questions the user to exit the program or not
            String exit = "";
            boolean validChoice3 = false;
            while (!validChoice3) {
                System.out.print("\nDo you still wish to use the program? 1 = yes, 2 = no: ");
                exit = userInput.nextLine();

                if (exit.equals("1") || exit.equals("2"))
                    validChoice3 = true;
                else
                    System.out.println("Invalid input choice. Please choose between \"1\" or \"2\".");
            }
            if(exit.equals("2")) {
                System.out.println("Thank you for using the program!");
                System.out.println("Exiting the program...");
                System.exit(0);
            }

            String addDevice = "";
            boolean validChoice4 = false;
            while (!validChoice4) {
                System.out.print("\nDo you want to add another device?: 1 = yes, 2 = no: ");
                addDevice = userInput.nextLine();

                if (addDevice.equals("1") || addDevice.equals("2"))
                    validChoice4 = true;
                else
                    System.out.println("Invalid input choice. Please choose between \"1\" or \"2\".");
            }
            //if user wants to add another device
            if(addDevice.equals("1")){
                System.out.print("\nPlease enter the name of the device you desire: ");
                String newDevice = userInput.nextLine();
                devices.add(newDevice);
            }
            System.out.println();
        }
    }
}
