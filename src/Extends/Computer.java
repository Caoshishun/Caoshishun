package Extends;

public class Computer {
    private String CPU;
    private int Memory;
    private int disk;

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        Memory = memory;
        this.disk = disk;
    }

    public String getDetails() {
        return  "CPU=" + CPU + " Memory=" + Memory + " disk=" + disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
