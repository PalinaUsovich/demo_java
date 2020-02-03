public class Elephant extends Animal {
    private int tusks;
    private int ears;

    public Elephant(String name, int size, int weight, int tusks, int ears) {
        super(name, size, weight);
        this.tusks = tusks;
        this.ears = ears;

    }

    public void drink() {
        System.out.println("Elephant is drinking from the river");
    }

    @Override
    public void eat() {
        System.out.println("Eat from child class is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Child class move is called");
        moveEars();
        super.move(speed);
    }

    private void moveEars() {
        System.out.println("local method move ears is called");
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant ("Lola",10,100,2,2);
        System.out.println(elephant.getName());
        elephant.drink();
        elephant.moveEars();
        elephant.move(10);
        }

    }
