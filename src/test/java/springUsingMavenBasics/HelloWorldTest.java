package springUsingMavenBasics;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void javaHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.JavaHelloWorld());
    }
}