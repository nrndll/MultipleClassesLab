import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus; // we declared a bus variable, its type is bus class, this is to be used later

    @Before // we set up the @Before which will run before each test
    public void before(){
        bus = new Bus("Edinburgh", 50); 
        //For each test a bus will be created
        //It will have destination "Edinburgh" and capacity 50
        
    }

    @Test
    //Test purpose is to be sure bus.destination has been set correctly
    public void busHasDestination(){ 
        //To pass, the method .getDestination - when called on bus - should return the string "Edinburgh"
        assertEquals("Edinburgh", bus.getDestination());
    }

    @Test
    //Test purpose is to be sure bus.capacity has been set correctly
    public void busHasCapacity(){
        //To pass, the method .getCapacity - when called on bus - should return the int 50
        assertEquals(50, bus.getCapacity());
    }

    @Test
    // Test purpose is to confirm bus.passengers starts as an empty array
    public void busPassengersStartsEmpty(){
        // To pass, the size() of bus.passengers should be 0, i.e the array is empty
        assertEquals(0, bus.passengersCount());
    }

}
