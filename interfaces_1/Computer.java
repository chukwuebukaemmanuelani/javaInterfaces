package interface_1;

public class Computer implements Electronics {

    @Override
    public String toString() {
        return "Computer [ram=" + ram + ", cpu=" + cpu + ", storage=" + storage + "]";
    }

    RAM ram;
    Processor cpu;
    Storage storage;
    // Constructor
    public Computer(RAM ram, Processor cpu, Storage storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    @Override
    public boolean on() {
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }

}
