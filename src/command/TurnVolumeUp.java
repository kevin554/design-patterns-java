package command;

public class TurnVolumeUp implements Command {

    private ElectronicDevice theDevice;

    public TurnVolumeUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
