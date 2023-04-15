package _2_abstract_classes;

public class Guitar extends Instrument{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("The guitar is playing");
    }
}
