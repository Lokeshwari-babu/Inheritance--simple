class parent{
    public void m1(){
        System.out.println("parent class m1-method()");
    }
    public void m2(){
        System.out.println("parent class m2-method()");
    }

}
class child extends parent{
    public void m3(){
        System.out.print("child class m3()");
    }
}
class Testone{
    public static void main (String[]args) {
        child c1 = new child();
        c1.m1();
        c1.m2();
        c1.m3();
    }
}