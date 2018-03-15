package main.java.ua.training;

public class Notebook extends Computer {
    private double screen;
    private double weight;
    private double battery;

    public Notebook() {
    }

    public Notebook(String name, double coreSpeed, Cores cores, double memoryOp, double memory) {
        super(name, coreSpeed, cores, memoryOp, memory);
    }

    public Notebook(String name, double coreSpeed, Cores cores, double memoryOp, double memory, double screen, double weight, double battary) {
        super(name, coreSpeed, cores, memoryOp, memory);
        this.screen = screen;
        this.weight = weight;
        this.battery = battary;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + this.getName() +
                ", coreSpeed=" + this.getCoreSpeed() +
                ", cores=" + this.getCores() +
                ", memoryOp=" + this.getMemoryOp() +
                ", memory=" + this.getMemory() +
                "screen=" + screen +
                ", weight=" + weight +
                ", battery=" + battery +
                '}';
    }
}