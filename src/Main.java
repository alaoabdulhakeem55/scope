import com.abdulhakeem.ScopeCheck;

public class Main {
    public static void main(String[] args) {
        String privateVar = "This is privateVar to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("ScopeCheck privateVar is " + scopeCheck.getPrivateVar());
        System.out.println(privateVar);

        scopeCheck.timesTwo();
        System.out.println("*************");

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        System.out.println("InnerClass privateVar is " + innerClass.getPrivateVar());
        System.out.println(privateVar);
        innerClass.timesThree();

        System.out.println("*************");

        scopeCheck.fourTimes();


    }
}