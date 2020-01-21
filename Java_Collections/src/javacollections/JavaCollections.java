package javacollections;

/**

 * Moscosoh Java collections framework

 * Jan 20th, 2020 

 */

import java.util.*;

public class JavaCollections {

    public static void main(String[] args) {
    	
        /** ArrayList 
    	*Five of the church's top milestones 
		*/
    	
        ArrayList<String> Milestones = new ArrayList<String>();

        Milestones.add("Emphasized the importance of referring to the church by its correct name (Agugust 2019)");

        Milestones.add("Announced 35 new temples (October 2019)");

        Milestones.add("President Nelson celebrated his 95th birthday (September 2019)");

        Milestones.add("New children and youth program is implemented (January 2020)");

        Milestones.add("Church services from three hours to two (October 2018)");

        System.out.println("\n\nLists Example: \n");

        System.out.println("Five of the church's top milestones since President Russell M. Nelson became a Latter-day Saint prophet:");

        

        Iterator<String> Mi = Milestones.iterator();

        while(Mi.hasNext()) {

        Object element = Mi.next();

        System.out.print(element + "\n");

        }

        System.out.print("\n");        

        

        /** Set
         * Use to removed duplicates because only store unique values

         */

        System.out.println("Set Collections Example\n");

        Set<String> MilestonesSet = new TreeSet<String>();

        MilestonesSet.add("Emphasized the importance of referring to the church by its correct name (Agugust 2019)");

        MilestonesSet.add("Announced 35 new temples (October 2019)");

        MilestonesSet.add("President Nelson celebrated his 95th birthday (September 2019)");

        MilestonesSet.add("Church services from three hours to two (October 2018)");

        MilestonesSet.add("Church services from three hours to two (October 2018)");


        System.out.println("Five of the church's top milestones since President Russell M. Nelson became a Latter-day Saint prophet:");

        

        Iterator<String> Mis = MilestonesSet.iterator();

        while(Mis.hasNext()) {

        Object element = Mis.next();

        System.out.print(element + "\n");

        }

        //System.out.println(set + "\n");



        /** Map
         * Use to retrieve key value pairs - Last five president of the Church
         */

        System.out.println("\nHashMap Example\n");
        
 
        Map<String, String> hmap = new HashMap<String, String>();

        hmap.put("Ezra Taft Benson", "1985");

        hmap.put("Howard W. Hunter", "1994");

        hmap.put("Gordon B. Hinckley", "1995");

        hmap.put("Thomas S. Monson", "2008");

        hmap.put("Russell M. Nelson", "2018");


        System.out.println("The Last five president of the Church: \n");


        hmap.forEach((k,v) -> System.out.println("President " + k 

                + ", Presided from " + v + "\n"));




        /** Tree Example
         * ordering in natural ordering - Utah native trees
         */

        System.out.println("TreeSet Example \n");

        TreeSet<String> baum = new TreeSet<String>();

        baum.add("Juniper");

        baum.add("Cottonwood");

        baum.add("Pinyon Pine");

        baum.add("Douglas Fir");

        baum.add("Bigtooth Maple");

        baum.add("Wysteria");

        baum.add("Quaking Aspen");

        

        Iterator<String> list = baum.iterator();

        while(list.hasNext()) {

        Object element = list.next();

        System.out.print(element + "\n");

        }




        /** Queue example
         * October 2007 General conference, Elder Dallin H. Oaks Of the Quorum of the Twelve Apostles
         * Choosing how to spend time 
         */

        System.out.println("\nQueue Example\n");

        Queue<String> choice = new LinkedList<>();


        choice.add("Good");

        choice.add("Better");

        choice.add("Best");



        choice.forEach(name -> {

           System.out.println(name);

        });




    }

}
