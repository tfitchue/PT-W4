package Week4Assignment;
import java.util.Arrays;
import java.util.Random;
public class week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Task 1
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        int resultA = ages[0] - ages[ages.length - 1];
        System.out.println("Result (a): " + resultA);

        int[] newAges = new int[ages.length + 1];
        System.arraycopy(ages, 0, newAges, 0, ages.length);
        int resultB = newAges[0] - newAges[newAges.length - 1];
        System.out.println("Result (b): " + resultB);

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println("Average Age (c): " + average);

        // Task 2
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        double totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = totalLetters / names.length;
        System.out.println("Average Letters per Name (a): " + averageLetters);

        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("Concatenated Names (b): " + concatenatedNames.toString().trim());

        // Task 3
        int lastElement = ages[ages.length - 1];
        System.out.println("Last Element: " + lastElement);

        // Task 4
        int firstElement = ages[0];
        System.out.println("First Element: " + firstElement);

        // Task 5
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Task 6
        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println("Sum of Name Lengths: " + sumOfNameLengths);

        // Task 7
        String repeatedWord = repeatWord("Hello", 3);
        System.out.println("Repeated Word: " + repeatedWord);

        // Task 8
        String fullName = getFullName("John", "Doe");
        System.out.println("Full Name: " + fullName);

        // Task 9
        boolean isSumGreaterThan100 = isSumGreaterThan(ages, 100);
        System.out.println("Is Sum Greater Than 100? " + isSumGreaterThan100);

        // Task 10
        double[] doubleArray = {2.5, 3.0, 4.5, 1.5};
        double averageDouble = calculateAverage(doubleArray);
        System.out.println("Average of Double Array: " + averageDouble);

        // Task 11
        double[] arr1 = {2.0, 3.0, 4.0};
        double[] arr2 = {1.0, 2.0, 3.0};
        boolean isAvgGreaterThanOther = isAverageGreaterThanOther(arr1, arr2);
        System.out.println("Is Average of arr1 Greater Than Average of arr2? " + isAvgGreaterThanOther);

        // Task 12
        boolean willBuyDrink = willBuyDrink(true, 12.0);
        System.out.println("Will Buy a Drink? " + willBuyDrink);

        // Task 13
        int[] parliamentSeats = generateParliamentSeats();
        printParliamentSeats(parliamentSeats);
    }

    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static boolean isSumGreaterThan(int[] numbers, int target) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum > target;
    }

    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static boolean isAverageGreaterThanOther(double[] arr1, double[] arr2) {
        double avg1 = calculateAverage(arr1);
        double avg2 = calculateAverage(arr2);
        return avg1 > avg2;
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    public static int[] generateParliamentSeats() {
        int totalSeats = 440;
        int[] seatsDistribution = new int[4];
        Random random = new Random();

        for (int i = 0; i < seatsDistribution.length - 1; i++) {
            seatsDistribution[i] = random.nextInt(totalSeats + 1);
            totalSeats -= seatsDistribution[i];
        }
        seatsDistribution[seatsDistribution.length - 1] = totalSeats;

        return seatsDistribution;
    }

    public static void printParliamentSeats(int[] seatsDistribution) {
        String[] parties = {"Labour", "Social Democrats", "National", "Central"};
        System.out.println("Parliament Seats Distribution:");
        for (int i = 0; i < parties.length; i++) {
            System.out.println(parties[i] + ": " + seatsDistribution[i]);
        }
	}

}
