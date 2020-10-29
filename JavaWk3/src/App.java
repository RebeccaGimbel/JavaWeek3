
public class App {

	public static void main(String[] args) {
		
		// The excessive comments are to help me learn.
		
		// #1a on HW - subtract 1st from last - print out
		// I know how to do this shorter from my C# class. - int[] ages = {3,9,23,64,2,8,28,93};
		// I would probably have to use the long method if I was only going to fill in part of the array at creation
		int[] ages = new int[8];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		// commented out the longer way without a method so I could reference back to the alternate ways
		//int lastItem = ages.length - 1;
		//int lastMinusFirst = ages[lastItem] - ages[0];
		//System.out.println(lastMinusFirst);
		System.out.println(lastMinusFirst(ages));
		
		// #1b - add a new age to array and subtract 1st from last again - print out
		int newLength = ages.length + 1;
		int[] ages2 = new int[newLength];
		int add = 0;
		for (int num : ages) {
			ages2[add] = ages[add];
		}
		ages2[newLength-1] = 74;
		
		System.out.println(lastMinusFirst(ages2));
		
		// #1c - use loop through array and calculate average - print out results
		double intSum = 0;
		for (int addNum : ages) {
			intSum += addNum;
		}
		System.out.println("\nAverage of the integers: " + intSum/ages.length);
		
		// #2a - loop and calculate average number of letters per name - print out
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		double tally = 0;
		for (int i = 0; i < names.length; i++) {
			tally += names[i].length(); 
		}
		
		System.out.println("\nAverage name length: " + tally / names.length); // how do I limit the decimal places? ****
		
		// #2b - loop and concatenate names with a space - print out
		String nameList = "";
		for (String item : names) {
			nameList += item;
			nameList += " "; // how do I not put a space after the last one? *****
		}
		System.out.print("\nList of namess: " + nameList);
		System.out.println();  // putting this here since I used print instead of println in the last sysout 
		
		// #3
		System.out.println("\nTo access the last element of an array, write the spot number in brackets behind the array name.");
		System.out.println("To make this a dynamic process, don't use the actual number of the spot.");
		System.out.println("Either in the brackets or in a separate int variable, put the array name then \".lenghth -1\"");
		System.out.println("The -1 is needed because the array starts with 0 so the array length will always be one greater than the spot.");
		
		
		// #4
		System.out.println("\nTo access the first element of an array, write a zero in brackets behind the array name.");
		System.out.println("Since all Java arrays start with spot #0, it will always be the same.");
		System.out.println("Other languages can start with spot #1, so be careful when learning new languages.");
		
		// #5 - loop through names and add name lengths to the new array nameLengths
		int nLength = names.length;
		int[] nameLengths = new int[nLength];
		
		for (int i = 0 ; i < names.length ; i++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.print("\nList of name lenghts: ");
		for (int item : nameLengths) {
			System.out.print(item + " ");
		}
		System.out.println(""); 
		
		// #6 - loop through nameLenghts and sum - print out total of sum
		int sum = 0;
		for (int item : nameLengths) {
			sum += item;
		}
		System.out.println("Sum of name lenghts: " + sum);
		
		// #7 - send a String word and int n - return the word concatenated n times
		  String word = "Beetlejuice";
		  int n = 3;
		  String repeatWord = repeatMyself(word, n);
		  System.out.println("\n" + word + " written " + n + " time(s)");
		  System.out.println(repeatWord);
		  
		// #8 - send two String firstName and lastName - return full name with a space
		  String firstName = "Rebecca";
		  String lastName = "Gimbel";
		  String fullName = createFullName(firstName, lastName);
		  
		  System.out.println("\nMy concatenated first and last name is: " + fullName);
		  // practicing different ways
		  System.out.println("You may call me "+ createFullName(firstName, lastName));  
		  System.out.println("You may not call me " + createFullName("Ms.", lastName));
		  
		 // #9 - takes an array of ints - returns true if sum > 100
		  int[] firstIntArray = {2,3,4,5,6};
		  int[] secondIntArray = {50,25,50};
		  boolean firstIntArrayResult = oneHundredPlus(firstIntArray);
		  		  
		  System.out.println("\nThe sum of the first int array is greater than 100: " + firstIntArrayResult);
		  // trying the method instead of creating a boolean
		  System.out.println("The sum of the second int array is greater than 100: " + oneHundredPlus(secondIntArray));
		 
		 // #10 - takes an array of doubles - returns the average
		  double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		  double averageOfDoubleArray = findAverage(doubleArray);
		  
		  System.out.println("\nThe average of the double array is "+ averageOfDoubleArray);
			
		 // #11 - takes two arrays of doubles - returns true if average of 1st array is greater than 2nd
		  double[] firstDoubleArray = {1, 5.58, 6.6, 78, 57.25};
		  double[] secondDoubleArray = {5, 55, 2, 5000};
		  
		  System.out.println("\nThe first double array is greater: " + greaterAverage(firstDoubleArray, secondDoubleArray));
		  boolean tryForPractice = greaterAverage(secondDoubleArray, firstDoubleArray);
		  System.out.println("The second double array is greater: " + tryForPractice);
		  
		 // #12 - willBuyDrink - takes a boolean isHotOutside and double moneyInPocket - returns true if true and > 10.50
		 boolean isHotOutside = false;
		 double moneyInPocket = 20.00;
		 
		 System.out.println("\nIf it is hot outside and I have more than $10.50 then I will get buy a drink.");
		 System.out.println("I will buy a drink: " + willBuyDrink(isHotOutside, moneyInPocket));
		 
		 // #13 - method of my own - passes an array and a string, returns a modified array
		 // I created this so I could return an array and practice.
		 String[] likes = {"vacations", "coffee", "family", "friends", "learning"};
		 String name = "Becky";
		 
		 System.out.println("\nWhat does " + name + " like?");
		 for (String listFromMethod : myLikes(likes, name)) {
			  System.out.println(listFromMethod);
		 }
		 		 
		 
		} // end of Main - start of methods
	
		public static int lastMinusFirst(int[] list) {
			int lastItem = list.length - 1;
			int result = list[lastItem] - list[0];
			return result;
		}
		
		public static String repeatMyself(String a, int b) {
			String word = "";
			for (int i = 0; i < b; i++) {
				word += a;
			}
			return word;
		}
		
		public static String createFullName(String a, String b) {
			return a + " " + b;
		}
		
		public static boolean oneHundredPlus(int[] list) {
			int sum = 0;
			for (int number : list) {
				sum += number;
			}
			boolean result = sum>100;
			return result;
		}
	
		public static double findAverage(double[] list){
			double sum = 0;
			for (double number : list ) {
				sum += number;
			}
			return sum/list.length;
		}
		
		public static boolean greaterAverage(double[] list1, double[] list2) {
			double sum1 = 0, sum2 = 0;
			for (double number : list1 ) {
				sum1 += number;
			}
			for (double number : list2 ) {
				sum2 += number;
			}
			return sum1/list1.length > sum2/list2.length;
		}
		
		public static boolean willBuyDrink(boolean hot, double money) {
			boolean result = (hot && money > 10.50);
			return result;
		}
		
		public static String[] myLikes(String[] what, String who) {
			String[] iLike = new String[what.length];
			int spot = 0;
			for (String item : what) {
				iLike[spot] = who + " likes " + item + "!";
				spot++;
			}
			return iLike;
		}
		
		
		

}