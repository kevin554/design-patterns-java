package command;

public class TurnVolumeDown implements Command {

    private ElectronicDevice theDevice;

    public TurnVolumeDown(ElectronicDevice newDevice) {
        this.theDevice = newDevice;
    }
    
    @Override
    public void execute() {
        theDevice.volumeDown();
    }

    @Override
    public void undo() {
        theDevice.volumeUp();
    }
}