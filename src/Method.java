public class Method {
    public static void main(String[] args) {
        System.out.println(add(5,7));
    }

    //1,2,3
    public static int add(int a, int b){
        return a+b;
    }

    //4
    public static int addTwo(int a, int b, int c, int d){
        return add(a, b) + add(c, d);
    }
    //5
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    //6
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }

    //7
    public static String triple(String word){
        return word + word + word;
    }

    //8
    public static double half(int number){
        return number/2.0;
    }

    //9
    public static int roundPositiveValueToNearestInteger(double number){
        return (int) Math.round(number);
    }

    //10
    public static int roundNegativeValueToNearestInteger(double number){
        return (int) Math.ceil(number-0.5);
    }


}
