public class InterfaceTester extends junit.framework.TestCase
{
    private Dog rover;
    private Llama diego;
    private Droid r2d2;
    private RoboDog sparky;
    private Person johnny;

    protected void setUp()
    // Set up the objects before the tests are run
    {
        rover = new Dog();
        diego = new Llama();
        r2d2 = new Droid();
        sparky = new RoboDog();
        johnny = new Person();
    }

    public void testInterface1()
    {
        System.out.println("Johnny plays with the Dog!");
        johnny.playWith(rover);
    }

    public void testInterface2()
    {
        System.out.println("Johnny plays with the RoboDog!");
        johnny.playWith(sparky);
    }

}

