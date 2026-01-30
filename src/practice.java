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

        //11

        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("Italy");
        countries1.add("Kyrgyzstan");
        countries1.add("Germany");

        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("Kyrgyzstan");
        countries2.add("Netherlands");

        for(String c: countries1){
            if(countries2.contains(c)){
                System.out.println(c);
            }
        }

        //12

        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Mike");
        names.add("Bob");

        for(String n: names){
            if(n.length() % 2 == 0){
                names.remove(n);
            }
        }
        System.out.println(names);

        //13

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Beach");
        songs.add("Ultraviolence");
        songs.add("Blue");

        String shortest = songs.get(0);

        for(String s: songs){
            if(shortest.length() > s.length()){
                shortest = s;
            }
        }
        System.out.println(shortest);

        //14

        ArrayList<String> words = new ArrayList<>();
        words.add("Java");

        for(int i = 0; i < words.size(); i++){
            String res = words.get(i);
            res = res.replace("a", "*").replace("e", "*")
                    .replace("i", "*").replace("o", "*")
                    .replace("u", "*");

            words.set(i, res);
        }
        System.out.println(words);

        //15

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int n: nums){
            if(n % 2 == 0){
                even.add(n);
            }else{
                odd.add(n);
            }
        }
        System.out.println(even);
        System.out.println(odd);

        //16

        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");

        Collections.rotate(days, 2);
        System.out.println(days);

        //17

        ArrayList<String> students = new ArrayList<>();
        students.add("Tom");
        students.add(null);
        students.add("Anna");

        for(int i = 0; i < students.size(); i++){
            if(students.get(i) == null){
                students.remove(i);
                i--;
            }
        }
        System.out.println(students);

        //18

//        ArrayList<String> movies2 = new ArrayList<>();
//        movies2.add("Up");
//        movies2.add("Avatar");
//        movies2.add("Titanic");
//
//        String longest1 = movies2.get(0);
//
//        for(int i = 1; i < movies2.size(); i++){
//            if(movies2.get(i).length() > longest1.length()){
//                longest1 = movies2.get(i);
//            }
//        }
//        String secondLongest = null;
//        for(int i = 1; i < movies2.size(); i++){
//            String current = movies2.get(i);
//
//            if (!current.equals(longest)) {
//                if (secondLongest == null || current.length() > secondLongest.length()) {
//                    secondLongest = current;
//                }
//            }
//        }
//        System.out.println(secondLongest);

        ArrayList<String> movies2 = new ArrayList<>();
        movies2.add("Up");
        movies2.add("Avatar");
        movies2.add("Titanic");

        String longest1 = movies2.get(0);

        for (int i = 1; i < movies2.size(); i++) {
            if (movies2.get(i).length() > longest1.length()) {
                longest1 = movies2.get(i);
            }
        }

        String secondLongest = null;

        for (int i = 0; i < movies2.size(); i++) {
            String current = movies2.get(i);

            if (!current.equals(longest1)) {
                if (secondLongest == null || current.length() > secondLongest.length()) {
                    secondLongest = current;
                }
            }
        }
        System.out.println(secondLongest);

        //19

        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Kiwi");

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String f : fruits2) {
            lengths.add(f.length());
        }
        System.out.println(lengths);

        //20

        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> dep1 = new ArrayList<>();
        dep1.add("Alice");
        dep1.add("Bob");

        ArrayList<String> dep2 = new ArrayList<>();
        dep2.add("Charlie");

        departments.add(dep1);
        departments.add(dep2);

        System.out.println(departments);




    }
}
