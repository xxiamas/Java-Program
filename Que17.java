class Que17 {
    public static void main(String s[]){
        T2 ob=new T2();
        System.out.println(ob.num1);
        System.out.println(ob.num2);
        System.out.println(T2.num2);
    }
    
}
class T2{
    int num1;
    static int num2;
    T2(){
        num1=10;
        num2=100;
    }
}
