import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


//                                                 Exercise1

//1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
//• Input: Weight (kg) = 70, Height (m) = 1.75
//• Expected Output: BMI = 22.86


//
//        System.out.println("please enter the weight : ");
//        double we = s.nextDouble();
//
//        System.out.println("please enter the height : ");
//        double he = s.nextDouble();
//
//
//        double result =we/(he*2);
//
//        System.out.println("BMI = " + result);





//2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
//• Input: Obtained Marks = 85, Total Marks = 100
//• Expected Output: Percentage = 85.0%



//        System.out.println("Obtained Marks = ");
//        int op = s.nextInt();
//
//        System.out.println("Total Marks = ");
//        int total = s.nextInt();
//
//
//        double x = op ;
//        double y = total ;
//        double z = (x/y)* 100 ;
//        System.out.println("Percentage = " + z +"%");





// 3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
//• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//• Expected Output: Amount in EUR = 85.0


//        System.out.println("Amount in USD = ");
//        double usd = s.nextInt();
//
//
//        double eur = 0.85 ;
//        double ex = usd * eur ;
//
//        System.out.println("Amount in EUR = " + ex);




//4. Create a program that takes a string as input, calculates its length, and then reverses
//the string using the StringBuilder class, finally printing both the length and reversed string.
//• Input: "Hello, World!"
//• Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"


//
//        System.out.println("Enter a word :");
//        String word = s.nextLine();
//
//        StringBuilder rev = new StringBuilder(word);
//
//        rev.reverse();
//        String reversed = rev.toString();
//
//        System.out.println("Length of the string: " + word.length() + " And Reversed string: " + reversed );
//






//5. Develop a program that takes a sentence as input and extracts a substring from it,
//then prints the extracted substring.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
//• Expected Output: "brown fox"



//        System.out.println("Sentence = ");
//        String sentence = s.nextLine();
//
//        System.out.println("Start Index = ");
//        int start = s.nextInt();
//
//        System.out.println("End Index = ");
//        int end = s.nextInt();
//
//        System.out.println(sentence.substring(start, end));





//6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
//• Expected Output: Keyword "jumps" is present in the sentence.


//
//        System.out.println("Sentence = ");
//        String sen = s.nextLine();
//
//        System.out.println("Keyword = ");
//        String keyword = s.nextLine();
//
//
//
//        if (sen.contains(keyword)){
//            System.out.println("Keyword " + keyword + " is present in the sentence.");
//        } else {
//            System.out.println("Keyword " + keyword + " is not present in the sentence.");
//
//        }






//7. Develop a program that takes a sentence and a word to replace as input, then
//replace all occurrences of the word with another word and prints the modified sentence.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
//• Expected Output: "The quick brown cat jumps over the lazy dog"



//        System.out.println("Sentence = ");
//        String sen = s.nextLine();
//
//        System.out.println("Word to Replace = ");
//        String Rep = s.nextLine();
//
//        System.out.println("Replacement Word = ");
//        String Repm = s.nextLine();
//
//
//        String newSen = sen.replace(Rep, Repm);
//        System.out.println(newSen);
//




//8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.
//• Input: String 1 = "Hello", String 2 = "hello"
//• Expected Output: Strings are equal (ignoring case).



//        System.out.println("String 1 = ");
//        String st1 = s.next();
//        System.out.println("String 2 = ");
//        String st2 = s.next();
//
//
//        if (st1.equalsIgnoreCase(st2)) {
//            System.out.println("Strings are equal");
//        }
//        else {
//            System.out.println("Strings are not equal");
//        }











//                                                        Exercise2
//1.Write a program that checks the role of the user:
// If the role is admin print "welcome admin"
//If the role is superuser print "welcome superuser"
//If the role is user print "welcome user" (tip:use if else)



//
//        System.out.println("your role?");
//        String role = s.next();
//
//        if (role.equals("admin")){
//            System.out.println("welcome admin");
//        }
//        else if (role.equals("superuser")) {
//            System.out.println("welcome superuser");
//        } else if(role.equals("user")) {
//            System.out.println("welcome user");
//        }





//2.Take three numbers from the user and print the greatest number.
//Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//Expected Output : The greatest: 87


//
//        System.out.println("Input the 1st number : ");
//
//        int num1 = s.nextInt();
//
//        System.out.println("Input the 2nd number : ");
//        int num2 = s.nextInt();
//
//        System.out.println("Input the 3rd number : ");
//        int num3 = s.nextInt();
//
//
//        if (num1>num2 && num1>num3 ) {
//            System.out.println("The greatest: " + num1);
//            }
//        else if (num2 > num1 && num2 > num3) {
//            System.out.println("The greatest: " + num2);
//            }
//        else if (num3 > num1 && num3 > num2) {
//            System.out.println("The greatest: " + num3);
//        }






//3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
//        Test Data
//        number: 4
//Expected Output: Wednesday1



//                  System.out.println("enter 1 to 7 to show the day");
//                 int day = s.nextInt();
//
//            switch (day){
//            case 1:
//                  System.out.println("sunday");
//                break;
//            case 2:
//                  System.out.println("monday");
//                break;
//
//            case 3:
//                  System.out.println("Tuesday");
//                break;
//            case 4:
//                  System.out.println("Wednesday");
//                break;
//            case 5:
//                  System.out.println("Thursday");
//                break;
//            case 6:
//                  System.out.println("Friday");
//                break;
//            case 7:
//                  System.out.println("Saturday");
//                break;
//
//            default:
//                  System.out.println("please enter valid number!");
//        }
//







//4. Write a program that takes a numeric score as input and prints the corresponding letter grade using the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
//Enter your numeric score: 85
//   Numeric Score: 85
//   Letter Grade: B



//                  System.out.println("Enter your numeric score:");
//             int num = s.nextInt();
//
//
//             if ((num >= 90 )&&(num <= 100)){
//                 System.out.println("Numeric Score : " + num);
//                 System.out.println("Letter Grade: A");
//
//             }
//             else if ((num >= 80 )&&(num <= 89)) {
//                 System.out.println("Numeric Score : " + num);
//                 System.out.println("Letter Grade: B");
//
//             }
//             else if ((num >= 70 )&&(num <= 79)) {
//                 System.out.println("Numeric Score : " + num);
//                 System.out.println("Letter Grade: C");
//
//             }
//             else if ((num >= 60 )&&(num <= 69)) {
//                 System.out.println("Numeric Score : " + num);
//                 System.out.println("Letter Grade: D");
//
//             }
//             else if ((num >= 0 )&&(num <= 50)) {
//                 System.out.println("Numeric Score : " + num);
//                 System.out.println("Letter Grade: F");
//             } else {
//                 System.out.println("please enter valid number !");
//             }






//5. Write a Java program that takes a person's age as input and
//categorizes them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement.
//use an if statement to categorize the age based on the following criteria:
//• If the age is less than 13, categorize them as a "Child."
//• If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
//• If the age is 20 or older, categorize them as an "Adult."
//        Sample Output:
//        Enter your age: 25
//        You are an Adult



//                     System.out.println("please enter your age : " );
//                int age = s.nextInt();
//
//
//                if (age >= 20 ){
//                     System.out.println("Adult.");
//                } else if ((age <= 19)&&(age >= 13)) {
//                     System.out.println("Teenager.");
//                }else {
//                     System.out.println("Child");
//                }




    }
}