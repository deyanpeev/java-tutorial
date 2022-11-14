public abstract class Animal {
    private int weigth;

    public Animal() {}

    public Animal(int weigth) {
        setWeigth(weigth);
    }

    public int getWeigth() {
        return weigth;
    }

    protected void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public abstract void move();

    public abstract void eat();
}
