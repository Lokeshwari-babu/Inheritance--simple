class parent{
    public void m1(){}
}
class child extends parent{
    System.out.println("child class-method")
}


public class Testthree {
    public static void main (String[]args){
        int a=100;
        parent p1=new parent();
        child c1=new child();
        parent p2=new child();
    }
}

