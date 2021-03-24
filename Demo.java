import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Demo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 25; i++)
        {
            int randInt = ThreadLocalRandom.current().nextInt(0, 10);
            list.add(randInt);
        }
        System.out.print("List: ");
        System.out.println(list);

        HashSet<Integer> Set = new HashSet<>(list);
        System.out.print("Set: ");
        System.out.print(Set);
        System.out.println(" number of unique numbers: " + Set.size());

        HashMap<Integer, Integer> Map = new HashMap<>();
        for (int i = 0; i < Set.size(); i++)
        {
            Map.put(i, list.indexOf(list.get(i)));
        }
        System.out.print("Map: ");
        System.out.print(Map);
    }
}