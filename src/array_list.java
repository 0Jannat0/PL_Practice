import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args){

        //Array list - dynamic array (resizable)
        //Classwork
        // 26.01.26

        //ArrayList<Type> name = new ArrayList<>();
        //type -> f.e. Integer, String, Double

        //example:

//        ArrayList<Integer> numbers = new ArrayList<>();


//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        int n;
//        n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            int num=sc.nextInt();
//            numbers.add(num);
//        }
//        for(int num:numbers){
//            System.out.println(num+" ");
//        }
//        System.out.println(numbers);

        //

//        ArrayList<Integer> numbers1 = new ArrayList<>();
//        numbers1.add(7);
//        numbers1.add(9);
//        numbers1.add(1, 8);
//
//        int last = numbers1.get(2);
//        System.out.println(last);
//
//        numbers1.set(0, 5);
//
//        System.out.println(numbers1);
//        System.out.println(numbers1.size());

        //

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//
//        numbers.remove(1);
//        numbers.remove(Integer.valueOf(9));
//
//        if(numbers.contains(Integer.valueOf(8))){
//            System.out.println("Yes");
//        }
//
//        System.out.println(numbers);
//        System.out.println(numbers.size());

//        numbers.remove(Integer.valueOf(100)); // - !!! Doesn't give an error
//
//        int ind = numbers.indexOf(9);
//        System.out.println(ind);
//
//        Collections.sort(numbers); //Sorting in ascending order
//        System.out.println("Ascending:" + numbers);
//
//        Collections.sort(numbers, Collections.reverseOrder());
//        System.out.println("Descending:"+numbers);
//
//        //
//
//        Collections.reverse(numbers);
//        System.out.println(numbers);
//
//        Collections.shuffle(numbers); // - рандомно
//        System.out.println(numbers);
//
//        int maxValue = Collections.max(numbers);
//        System.out.println("Maximum:"+ maxValue);
//
//        int minValue = Collections.min(numbers);
//        System.out.println("Minimum:"+minValue);
//
//        //
//
//        ArrayList<Integer> zeroes = new ArrayList<>(Collections.nCopies(10, 0));
//        System.out.println(zeroes);






        //PRACTISE


        //1

        ArrayList<String> books1 = new ArrayList<>();
        books1.add("1984");
        books1.add("Dune");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Dune");
        books2.add("Hamlet");

        ArrayList<String> result = new ArrayList<>();

        for (String b : books1) {
            if (!result.contains(b)) {
                result.add(b);
            }
        }

        for (String b : books2) {
            if (!result.contains(b)) {
                result.add(b);
            }
        }

        System.out.println(result);


        //2

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Up");
        movies.add("Avatar");
        movies.add("Titanic");

        String longest = movies.get(0);

        for (String m : movies) {
            if (m.length() > longest.length()) {
                longest = m;
            }
        }

        System.out.println(longest);


        //3

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Pizza");

        int count = 0;

        for (String f : foods) {
            if (f.equals("Pizza")) {
                count++;
            }
        }

        System.out.println(count);


        //4

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("Banana")) {
                fruits.remove(i);
                i--;
            }
        }

        System.out.println(fruits);

        //5

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
        }

        System.out.println(colors);


        //6

        ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Hockey");

        if (sports.contains("Football") && sports.contains("Tennis")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //7

        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Lily");
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
        cities.add("Paris");
        cities.add("Rome");

        String[] arr = new String[cities.size()];
        for (int i = 0; i < cities.size(); i++) {
            arr[i] = cities.get(i);
        }

        //10

        int[] numbers = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : numbers) {
            list.add(n);
        }

        System.out.println(list);


        //11

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("USA");
        c1.add("Germany");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Germany");
        c2.add("France");

        for (String c : c1) {
            if (c2.contains(c)) {
                System.out.println(c);
            }
        }

        //12

        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Bob");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
                i--;
            }
        }

        System.out.println(names);


        //13

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Sky");
        songs.add("Universe");

        String shortest = songs.get(0);

        for (String s : songs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        System.out.println(shortest);

        //14

        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");

        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            w = w.replace("a", "*").replace("e", "*")
                    .replace("i", "*").replace("o", "*")
                    .replace("u", "*");
            words.set(i, w);
        }

        System.out.println(words);

        //15

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0) even.add(n);
            else odd.add(n);
        }

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

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) == null) {
                students.remove(i);
                i--;
            }
        }

        System.out.println(students);

        //18

        ArrayList<String> movies2 = new ArrayList<>();
        movies2.add("Up");
        movies2.add("Avatar");
        movies2.add("Titanic");

        Collections.sort(movies2, (a, b) -> b.length() - a.length());
        System.out.println(movies2.get(1));

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
