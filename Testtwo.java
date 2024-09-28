class grandparent{
    public void m1(){
        System.out.println("grandparent class -inheritance method");
    }
    public void m2(){}
}
class parent extends grandparent{
    public void m3(){}
    
}
class child extends parent{
    public void m4(){}
}

public class Testtwo {
    public static void main (String[]args) {
        child c1 = new child();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();
        
    }
}