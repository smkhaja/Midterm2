package datastructure;
import java.util.*;

public class UseLISTHashMap {
    public static void main(String[] args) {
        List<String> stateListOfUSA = new ArrayList<>();
        stateListOfUSA.add("Nj");
        stateListOfUSA.add("Fl");
        stateListOfUSA.add("PA");

        List<String> proviceListOfCanada = new ArrayList<>();
        proviceListOfCanada.add("TO");
        proviceListOfCanada.add("MO");
        proviceListOfCanada.add("SA");

        List<String> proviceListOfAustralia = new ArrayList<>();
        proviceListOfAustralia.add("SY");
        proviceListOfAustralia.add("MA");
        proviceListOfAustralia.add("NW");

        Map<String,List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("USA", stateListOfUSA);
        map.put("Canada", proviceListOfCanada);
        map.put("Australia", proviceListOfAustralia);

        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }




    }
}
