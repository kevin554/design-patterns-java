package command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args) {
        // Gets the ElectronicDevice to use
        ElectronicDevice newDevice = TVRemote.getDevice();

        // TurnOn contains the command to turn on the tv
        // When execute() is called on this command object
        // it will execute the method on() in Television
        TurnOn onCommand = new TurnOn(newDevice);

        // Calling the execute() causes on() to execute in Television
        DeviceButton btnPressed = new DeviceButton(onCommand);

        // When press() is called theCommand.execute(); executes
        btnPressed.press();

        //----------------------------------------------------------
        // Now when execute() is called off() of Television executes
        TurnOff offCommand = new TurnOff(newDevice);

        // Calling the execute() causes off() to execute in Television
        btnPressed = new DeviceButton(offCommand);

        // When press() is called theCommand.execute(); executes
        btnPressed.press();

        //----------------------------------------------------------
        // Now when execute() is called volumeUp() of Television executes
        TurnVolumeUp volUpCommand = new TurnVolumeUp(newDevice);

        // Calling the execute() causes volumeUp() to execute in Television
        btnPressed = new DeviceButton(volUpCommand);

        // When press() is called theCommand.execute(); executes
        btnPressed.press();
        btnPressed.press();
        btnPressed.press();

        //----------------------------------------------------------
        // Creating a TV and Radio to turn off with 1 press
        Television theTV = new Television();

        Radio theRadio = new Radio();

        // Add the Electronic Devices to a List
        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(theTV);
        allDevices.add(theRadio);

        // Send the List of Electronic Devices to TurnItAllOff
        // where a call to run execute() on this function will
        // call off() for each device in the list 
        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

        // This calls for execute() to run which calls for off() to
        // run for every ElectronicDevice
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();

        //----------------------------------------------------------
        /*
		 * It is common to be able to undo a command in a command pattern
		 * To do so, DeviceButton will have a method called undo
		 * Undo() will perform the opposite action that the normal
		 * Command performs. undo() needs to be added to every class
		 * with an execute()
         */
        turnThemOff.pressUndo();

        // To undo more than one command add them to a LinkedList
        // using addFirst(). Then execute undo on each item until 
        // there are none left. (This is your Homework)
    }
}
