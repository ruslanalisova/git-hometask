public class Part2Task1 {
    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        String str3 = str1.concat(str2);

        String result = str3.replaceAll("[P,p]","");
        System.out.println("Task1: " + result);
    }
}
