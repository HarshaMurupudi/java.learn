package Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }
}

public class JArrayList {

    public static void main(String[] args) {
        String[] vowels = {"a", "b", "c"};

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Butter"));


        List<String> items = List.of(vowels);
        ArrayList<String> aList = new ArrayList<>(items);
        aList.add("D");
        ArrayList<String> aCompactList = new ArrayList<>(List.of("pickels", "mustard"));
        aCompactList.add("D");
        aList.addAll(aCompactList);
        System.out.println(aList);
        aList.set(0, "Z");

        aList.get(2);
        aList.contains("D");
        aList.indexOf("D");
        aList.lastIndexOf("D");
        aList.size();

        groceryItems.remove(0);
        aList.remove(1);
        aList.remove("D");
        aList.removeAll(List.of("D", "a"));
        aList.retainAll(List.of("a", "b")); //only saves these
        aList.clear();

        aList.isEmpty();
        aList.contains("D");
        aList.containsAll(List.of("a"));

        aList.sort(Comparator.naturalOrder());
        aList.sort(Comparator.reverseOrder());
    }
}
