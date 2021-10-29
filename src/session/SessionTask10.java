package session;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SessionTask10 {
	private static void insertionOrder()
    {
        LinkedHashSet<String> linkSet
            = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<String>();
 
        // Add three object in
        // LinkedHashSet and TreeSet
        for (String str : Arrays.asList("kbch", "ddfsk",
                                        "ffds", "jhg")) {
 
            linkSet.add(str);
            treeSet.add(str);
            hashSet.add(str);
        }
 
      
        // stores element in sorted order
        System.out.println("Insertion Order"
                           + " of objects in HashSet :"
                           + hashSet);
 
        
        // stores elements as insertion
        System.out.println("Insertion Order of "
                           + "objects in LinkedHashSet :"
                           + linkSet);
 
        // stores element in sorted order
        System.out.println("Insertion Order of"
                           + " objects in TreeSet :"
                           + treeSet);
    }
 
   
    private static void insertionTime()
    {
        // HashSet performance Test
        // inserting 1000 elements
        HashSet<Integer> numbersHS = new HashSet<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            numbersHS.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Total time to insert"
                           + " 1000 elements in"
                           + " HashSet in nanoseconds: "
                           + (endTime - startTime));
 
        // LinkedHashSet performance Test
        // inserting 1000 elements
        LinkedHashSet<Integer> numbersLLS
            = new LinkedHashSet<>();
 
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            numbersLLS.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total time to insert"
                           + " 1000 elements in"
                           + " LinkedHashSet nanoseconds: "
                           + (endTime - startTime));
 
        // TreeSet performance Test inserting 1000 objects
        TreeSet<Integer> numbersTS = new TreeSet<>();
 
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            numbersTS.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total time to insert"
                           + " 1000 elements in"
                           + " TreeSet in nanoseconds: "
                           + (endTime - startTime));
    }
 
    // Function calculate deletion time
    // of 1000 objects LinkedHashSet,
    // TreeSet and HashSet
    // Deletion time always vary
    private static void deletion()
    {
        // HashSet performance Test inserting
        // and deletion 1000 elements
        HashSet<Integer> deletionHS = new HashSet<>();
 
        for (int i = 0; i < 1000; i++) {
            deletionHS.add(i);
        }
 
        long startingTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            deletionHS.remove(i);
        }
 
        long endedTime = System.nanoTime();
        System.out.println(
            "Total time to Deletion "
            + "1000 elements in HashSet in nanoseconds: "
            + Math.abs(startingTime - endedTime));
 
        // LinkedHashSet  performance Test inserting
        // and deletion 1000 elements
        LinkedHashSet<Integer> deletionLLS
            = new LinkedHashSet<>();
 
        for (int i = 0; i < 1000; i++) {
            deletionLLS.add(i);
        }
        startingTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            deletionLLS.remove(i);
        }
 
        endedTime = System.nanoTime();
        System.out.println(
            "Total time to Deletion 1000"
            + " elements in LinkedHashSet in nanoseconds: "
            + Math.abs(startingTime - endedTime));
 
        // TreeSet performance Test inserting
        // and deletion 1000 elements
        TreeSet<Integer> deletionTS = new TreeSet<>();
 
        for (int i = 0; i < 1000; i++) {
            deletionTS.add(i);
        }
 
        startingTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            deletionTS.remove(i);
        }
 
        endedTime = System.nanoTime();
        System.out.println(
            "Total time to Deletion 1000"
            + " elements in TreeSet in nanoseconds: "
            + Math.abs(startingTime - endedTime));
    }

	public static void main(String[] args) {
		insertionOrder();
        insertionTime();
        deletion();
	}

}
