class ABC{
    public void myMethod()
    {
        System.out.println("Overridden method");
    }
}

public class VerifyOverridingWithSuperKey extends ABC{
    public void myMethod(){
        //This will call the myMethod() of parent class
        super.myMethod();
        System.out.println("Overriding method");
    }
    public static void main(String[] args){
        VerifyOverridingWithSuperKey v = new VerifyOverridingWithSuperKey();
        v.myMethod();
    }
}
