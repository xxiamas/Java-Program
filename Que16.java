class Que16 {
    int num1;
    static int num2;
    Que16(){
        num1=100;
        num2=200;

    }
    public static void main(String args[]){
    Que16 ob1=new Que16();
    Que16 ob2=new Que16();
    Que16 ob3=new Que16();
    System.out.println(ob1.num1);
    System.out.println(ob1.num2);
    ob1.num1++; ob1.num2++;
    System.out.println(ob2.num1);
    System.out.println(ob2.num2);
    ob3.num1++; ob3.num2++;
    System.out.println(ob3.num1);
    System.out.println(ob3.num2);
    

    }
}
