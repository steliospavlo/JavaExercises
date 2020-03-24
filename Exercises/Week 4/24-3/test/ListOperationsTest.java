package mypackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ListOperationsTest {

    private ListOperations listOperations;

    public ListOperationsTest() {
    }

    @Before
    public void setUp() {
        listOperations = new ListOperations();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddNameToList() {
        boolean changed = listOperations.addNameToList("Andy");
        assertTrue(changed);
    }

    @Test
    public void testAddNameToListChecksize() {
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(1, sizeOfList);

    }

    @Test
    public void testAddNameToListCheckName() {
        String name = "Andy";
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeOfList();
        String actualName = listOperations.getNames().get(sizeOfList - 1);
        assertTrue(actualName.equals(name));
        assertEquals(1, sizeOfList);

    }

    @Test
    public void testAddNameToListManyNames() {
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("Jacko");
        listOperations.addNameToList("Kaido");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(3, sizeOfList);
    }

    @Test
    public void testAddNameToListNull() {
        listOperations.addNameToList(null);
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(0, sizeOfList);
    }

    
    @Test
    public void testRemoveNameToList() {
        boolean name1 = listOperations.addNameToList("Nick");
        assertTrue(name1);
//        int size = listOperations.getSizeOfList();
//        //assertEquals(1, size);
        listOperations.removeNameToList("Nick");
        int size2 = listOperations.getSizeOfList();
        assertEquals(0, size2);

        
        
    }

    
    @Test
    public void testGetSizeOfList() {
        listOperations.addNameToList("Jack");
        listOperations.addNameToList("Luffy");
        int size = listOperations.getSizeOfList();
        assertEquals(2, size);
    }

}
