import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus; // we declared a bus variable, its type is bus class, this is to be used later
    Person person1;
    Person person2;

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

    @Test
    // Test purpose is to confirm that after the addPerson method is called on bus, gthe passengers array has 1 passenger added to it
    public void busCanAddPersonAsPassenger(){
        bus.addPerson(person1);
        assertEquals(1, bus.passengersCount());
    }

    @Test
    //Test purpose is to confirm that the removePerson method will remove a Person from the passengers ArrayList
    public void busCanRemovePersonAsPassenger(){
        bus.addPerson(person1); //Firstly we add person1 (we know this works)
        bus.removePerson(person1); // Then we remove person1 using our removePerson method
        assertEquals(0, bus.passengersCount());
    }

}
