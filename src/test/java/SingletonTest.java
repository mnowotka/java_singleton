import junit.framework.TestCase;

public class SingletonTest extends TestCase {

    public void testSingleton(){
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        assertEquals(a,b);
        a.setValue(10);
        assertEquals(10, b.getValue());
        b.setValue(153);
        assertEquals(153, a.getValue());
    }

}
