import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testInitialization() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty(), "Ein neu erstellter Stack sollte leer sein");
        assertEquals(0, stack.size(), "Ein neu erstellter Stack sollte die Größe 0 haben");
    }

    @Test
    public void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(42);
        assertFalse(stack.isEmpty(), "Stack sollte nach push nicht leer sein");
        assertEquals(1, stack.size(), "Stack sollte nach einem push die Größe 1 haben");
        assertEquals(42, stack.pop(), "pop sollte das zuletzt hinzugefügte Element zurückgeben");
        assertTrue(stack.isEmpty(), "Stack sollte nach pop wieder leer sein");
    }

    @Test
    public void testMultiplePushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size(), "Stack sollte nach 3 push-Operationen die Größe 3 haben");
        assertEquals(3, stack.pop(), "pop sollte das zuletzt hinzugefügte Element zurückgeben");
        assertEquals(2, stack.pop(), "pop sollte das zuletzt hinzugefügte Element zurückgeben");
        assertEquals(1, stack.pop(), "pop sollte das zuletzt hinzugefügte Element zurückgeben");
        assertTrue(stack.isEmpty(), "Stack sollte nach allen pop-Operationen leer sein");
    }

    @Test
    public void testPopEmpty() {
        Stack stack = new Stack();
        Assertions.assertThrows(IllegalStateException.class, () -> stack.pop(),
            "pop auf einem leeren Stack sollte eine IllegalStateException werfen");
    }

    @Test
    public void testCapacityIncrease() {
        Stack stack = new Stack();
        // Fülle den Stack mit mehr als 10 Elementen
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(15, stack.size(), "Stack sollte 15 Elemente enthalten");
        // Überprüfe, ob die Elemente in der richtigen Reihenfolge herauskommen
        assertEquals(14, stack.pop(), "Das oberste Element sollte 14 sein");
        assertEquals(13, stack.pop(), "Das nächste Element sollte 13 sein");
    }
}