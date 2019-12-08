package command;

import java.util.List;

public class TurnItAllOff implements Command {

    private List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : theDevices) 
            device.off();
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : theDevices) 
            device.on();
    }
}
