import jdk.jfr.internal.consumer.RecordingInput;

import java.util.ArrayList;

public class Bus{

    //declared destination variable as string
    private String destination;
    // declared capacity variable as int
    private int capacity;
    // declared passengers variable as an ArrayList which allows Person objects only
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){ //established constructor, a new Bus needs a destination & capacity
        this.destination = destination; //the new bus destination is set to the destination string argument given
        this.capacity = capacity; //the new bus capacity is set to the capacity int argument given
        this.passengers = new ArrayList<>(); //the new bus passengers is set to a New ArrayList
    }
    // established a method that when called returns the destination string of the bus
    public String getDestination() {
        return this.destination;
    }

    // established a method that when called returns the capacity int of the bus
    public int getCapacity() {
        return this.capacity;
    }

    // established a method that when called returns the size of (number of items in) the passengers variable
    public int passengersCount() {
        return passengers.size();
    }

    // established a method that when called, adds the person object given to the passengers ArrayList variable
    public void addPerson(Person person) {
        this.passengers.add(person);
    }

    public Person removePerson(Person person) {
         return passengers.remove(0);
    }
}
