class test1{
    public static void tool(){
        System.out.println("static method");
    }
}

class Test extends test1{
    public static void main(String[] args){
        test1 t = new Test();
        tool();
    }
}
