package our_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {
    OurArrayList <Integer> list;

   @BeforeEach
   public void setUp(){
      list = new OurArrayList<>();
   }

    @Test
    @DisplayName("Append 1 El")
    public void testAppendGet_emptyList_addOneElement (){
        list.append(5);
        assertEquals(5, list.get(0));
    }

    @Test
    @DisplayName("Append Several El")
    public void testAppendGet_emptyList_addSeveralElement (){
       Integer[]expected = {1,3,10,4,7,20};
        for (Integer integer : expected) {
            list.append(integer);
        }
       for (int i = 0; i<expected.length; i++){
           assertEquals(expected[i], list.get(i));
       }
    }

    @Test
    @DisplayName("Size")
    public void testSize_emptyList_appendsOneEl(){
       list.append(12);
       assertEquals(1, list.size());
    }

    @Test
    @DisplayName("Size Several")
    public void testSize_emptyList_appendsSeveralEl(){
        Integer[]expected = {1,3,10,4,7,20};
        for (Integer integer : expected) {
            list.append(integer);
        }
        for (int i = 0; i<expected.length; i++){
            assertEquals(expected.length, list.size());
        }
    }

    @Test
    public void testSet (){
       list.append(1);
       list.set(10,0);
    }

    @Test
    public void testSet_severalEl (){
        Integer[]source = {1,3,10,4,7,20};
        for (Integer integer : source) {
            list.append(integer);
        }
        list.set(100,0);
        list.set(200,3);
        list.set(300,5);

        Integer[]expected = {100, 3, 10, 200, 7, 300};
        for (int i = 0; i<expected.length; i++) {
            list.set(expected[i], list.get(i));
        }
        assertEquals(6, list.size());
    }

    @Test
    public  void  testGet_N0nEmptyList_getWrongIndex(){
       list.append(2);
       list.append(23);
       list.append(21);

        assertNull(list.get(5));
    }

    @Test
    public  void  testRemoveById_N0nEmptyList_removes_byWrongIndex(){
        list.append(2);
        list.append(23);
        list.append(21);

        assertNull(list.removeByID(5));
    }

    @Test
    public  void  testRemoveById_N0nEmptyList_removes_byFirstElement(){
        list.append(2);
        list.append(23);
        list.append(21);

        int removed = list.removeByID(0);

        assertEquals(2, removed);
    }

    @Test
    public  void  testRemove_N0nEmptyList_removes_FirstElement(){
        list.append(2);
        list.append(23);
        list.append(21);

        assertTrue(list.remove(2));
        assertFalse(list.remove(245));
    }

    @Test
    public  void  testRemove_N0nEmptyList_removes_MiddleElement(){
        list.append(2);
        list.append(23);
        list.append(21);

        int removed = list.removeByID(1);

        assertEquals(23, removed);

        OurList<String>nanes = new OurArrayList<>();
        nanes.append("Jack");
        nanes.append("John");
        nanes.append("Jackkkk");

        assertTrue(nanes.remove("Jack"));
        assertFalse(nanes.remove("Peter"));
    }





}