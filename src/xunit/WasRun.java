package xunit;

public class WasRun extends TestCase {

    public String log;

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        log += " testMethod";
    }

    @Override
    public void setUp() {
        log = "setUp";
    }

    public void testBrokenMethod() {
        throw new AssertionError();
    }

    @Override
    public void tearDown() {
        log += " tearDown";
    }
}
