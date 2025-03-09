public class Solution {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheros = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Print the superhero names
        System.out.println("Superhero Names:");

        // Print all the 5 superheros names as suggested in the example
        System.out.println(superheros[0]);
        System.out.println(superheros[1]);
        System.out.println(superheros[2]);
        System.out.println(superheros[3]);
        System.out.println(superheros[4]);

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the introduction years
        System.out.println("Introduction Years:");

        // Print the introductionYear of the superheros.
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);

        // Print the original name of the third superhero
        System.out.println("Original superhero name at position 3: " + superheros[2]);

        // Modify the third superhero name
        superheros[2] = "Thor";

        // Print the modified name of the third superhero
        System.out.println("Modified superhero name at position 3: " + superheros[2]);

        // Print the original year of introduction of the third superhero
        System.out.println("Original introduction year for superhero at position 3: " + introductionYears[2]);

        // Modify the year of introduction of the third superhero
        introductionYears[2] = 2011;

        // Print the modified year of introduction of the third superhero
        System.out.println("Modified introduction year for superhero at position 3: " + introductionYears[2]);

        // Print the length of the array containing superhero names
        System.out.println("Total superheros names in String array: " + superheros.length);

        // Print the length of the array containing superhero year of introduction
        System.out.println("Total superheros introduction year in int array: " + introductionYears.length);

    }
}
