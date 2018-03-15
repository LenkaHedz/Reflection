package main.java.ua.training;

public class Computer {
    private String name;
    private double coreSpeed;
    private Cores cores;
    private double memoryOp;
    private double memory;

    public Computer() {
    }

    public Computer(String name, double coreSpeed, Cores cores, double memoryOp, double memory) {
        this.name = name;
        this.coreSpeed = coreSpeed;
        this.cores = cores;
        this.memoryOp = memoryOp;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoreSpeed() {
        return coreSpeed;
    }

    public void setCoreSpeed(double coreSpeed) {
        this.coreSpeed = coreSpeed;
    }

    public Cores getCores() {
        return cores;
    }

    public void setCores(Cores cores) {
        this.cores = cores;
    }

    public double getMemoryOp() {
        return memoryOp;
    }

    public void setMemoryOp(double memoryOp) {
        this.memoryOp = memoryOp;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Computer)) return false;

        Computer computer = (Computer) obj;

        if (Double.compare(computer.getCoreSpeed(), getCoreSpeed()) != 0) return false;
        if (getCores() != computer.getCores()) return false;
        if (Double.compare(computer.getMemoryOp(), getMemoryOp()) != 0) return false;
        return getName().equals(computer.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        temp = Double.doubleToLongBits(getCoreSpeed());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getMemoryOp());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name +
                ", coreSpeed=" + coreSpeed +
                ", cores=" + cores +
                ", memoryOp=" + memoryOp +
                ", memory=" + memory +
                '}';
    }
}
