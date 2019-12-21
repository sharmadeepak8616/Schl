package ZZZ;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMap_Prac {




    public static void main(String[] args) {

        HashMap<Integer, String> names = new HashMap<Integer, String>();

        names.put(1, "ABCD");
        names.put(43, "EFGH");
        names.put(2, "kloi");
        names.put(3, "vfdc");

        System.out.println(names.size());

        System.out.println(names.get(43));

        System.out.println(names.keySet());

        System.out.println(names.values());

        Collection<String> v = names.values();
        for (String v1 : v) {
            System.out.println("Value : " + v1);
        }

        names.put(43, "Happy");

        System.out.println(names);

        String changevfdcToPeace = "Peace";

        String findKeyFor = "vfdc";

        for (int key : names.keySet()) {
            //System.out.println(key + " -> " + names.get(key));
            if (names.get(key).equals(findKeyFor)) {
                System.out.println(findKeyFor + " is present at key #" + key);
            }
        }

        System.out.println(Levels.SUPER);

    }
}
