public abstract class Mammal extends Animal {
    private int temperature;
    public Mammal() {}

    public Mammal(int weight) {
        super(weight);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public abstract void giveBirth();
}
