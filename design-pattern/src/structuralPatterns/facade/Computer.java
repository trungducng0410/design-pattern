package structuralPatterns.facade;

// Facade
public class Computer {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();
    private OS os = new OS();

    public void startComputer() {
        String bootSector = hardDrive.readBootSector();
        String osData = os.loadKernel();
        memory.load(0, bootSector);
        memory.load(1024, osData);
        cpu.initialize();
    }
}
