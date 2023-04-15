package _2_abstract_classes;

public class Piano extends Instrument{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("The piano is playing");
    }
}
