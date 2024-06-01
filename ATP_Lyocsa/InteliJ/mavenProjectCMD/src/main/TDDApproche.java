package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.main;

public class TDDApproche
{

    public static String division(int number){
        if(number % 3 == 0){
            return "The number is divisible by three";
        }
        else if( number % 7 == 0){
            return "The number is divisible by seven";
        }
        else {
            return Integer.toString(number);
        }
    }

    public static String divisionRefactor(int i){
        StringBuilder stringBuilder = new StringBuilder();

        if(i % 3 == 0){
            stringBuilder.append("The number is divisible by three");
        }
        else if(i % 7 == 0){
            stringBuilder.append("The number is divisible by seven");
        }else {
            stringBuilder.append(Integer.toString(i));
        }
        return stringBuilder.toString();
    }

    public static double multiply(double num1, double num2) {
        if(num1 == 0 || num2 == 0){
            return 0;
        }else {
            return num1 * num2;
        }
    }
}