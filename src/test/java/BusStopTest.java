import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop1;
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void before() {
        busStop1 = new BusStop("Comiston Road");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
    }

    @Test
    public void busStopHasName(){
        assertEquals("Comiston Road", busStop1.getName());
    }

    @Test
    public void busStopQueueStartsEmpty(){
        assertEquals(0, busStop1.getQueueLength());
    }

    @Test
    public void busStopAddsPersonToQueue(){
        busStop1.addPerson(person1);
        assertEquals(1, busStop1.getQueueLength());
    }

    @Test
    public void busStopRemovesPersonFromQueue(){
        busStop1.addPerson(person1);
        busStop1.removePerson();
        assertEquals(0, busStop1.getQueueLength());
    }

}
