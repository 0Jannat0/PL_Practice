import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice {
    public static void main(String[] args) {

        //1

        ArrayList<String> books1 = new ArrayList<>();
        books1.add("1984");
        books1.add("Dune");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Dune");
        books2.add("Hamlet");

        ArrayList<String> merged = new ArrayList<>();

        for (String b : books1) {
            if (!merged.contains(b)) {
                merged.add(b);
            }
        }

        for (String b : books2) {
            if (!merged.contains(b)) {
                merged.add(b);
            }
        }

        System.out.println(merged);

        //2

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Interstellar");
        movies.add("Titanic");
        String longest = movies.get(0);
        for(String s: movies){
            if(s.length() > longest.length()){
                longest = s;
            }
        }
        System.out.println("The longest string is "+ longest);

        //3

        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Burger");
        food.add("Fries");
        food.add("Pizza");

        int count = 0;

        for(String f: food){
            if(f.equalsIgnoreCase("Pizza")){
                count++;
            }
        }
        System.out.println("Pizza: "+count+" times.");

        //4

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");

        for(int i = 0; i < fruits.size(); i++){
            if(fruits.get(i).equalsIgnoreCase("Banana")){
                fruits.remove(i);
                i--;
            }
        }
        System.out.println(fruits);

        //5

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");

        for(int i = 0; i < colors.size(); i++){
            colors.set(i, "Black");
        }
        System.out.println(colors);

        //6

        ArrayList<String> sports = new ArrayList<>();
        sports.add("Volleyball");
        sports.add("Football");
        sports.add("Tennis");

        ArrayList<String> subSports = new ArrayList<>();
        subSports.add("Football");
        subSports.add("Tennis");

        boolean containsAll = true;

        for(int i = 0; i < subSports.size(); i++){
            if(!sports.contains(subSports.get(i))){
                containsAll = false;
                break;
            }
        }
        if (containsAll) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //7

        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Tulip");
        flowers.add("Rose");
        flowers.add("Poppy");
        flowers.add("Rose");

        System.out.println(flowers.indexOf("Rose"));
        System.out.println(flowers.lastIndexOf("Rose"));

        //8

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cat");

        ArrayList<String> unique = new ArrayList<>();

        for (String a : animals) {
            if (!unique.contains(a)) {
                unique.add(a);
            }
        }

        System.out.println(unique);

        //9

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bishkek");
        cities.add("Rome");

        String[] arr = new String[cities.size()];
        for (int i = 0; i < cities.size(); i++) {
            arr[i] = cities.get(i);
        }
        System.out.println(Arrays.toString(arr));

        //10

        int[] numbers = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();

        for(int n: numbers){
            list.add(n);
        }
        System.out.println(list);



    }
}
