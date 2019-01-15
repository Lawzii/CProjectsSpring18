public class MyExtension extends Abstract implements Running{ //ToString and Constructors are always inherited even though they're not seen
    //Inherit from Object to Class to Subclass
    //In interfaces there is no hierarchy

    @Override // overrides the abstract method in the extended Abstract Class so it could extend properly
    public float sum(){
        return 87.3f;
    }

    @Override
    public int scoring() {
        return 0;
    }

    @Override
    public double total() {
        return 0;
    }

    @Override
    public String name() {
        return null;
    }
}
