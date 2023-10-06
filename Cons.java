//Parameteriesd Constructor
class Cons {
    Cons(){
        System.out.println("Que13");
    }
    Cons(int n){
        System.out.println("Que13(int)");
    }
    Cons(String s){
        System.out.println("Que13(String)");
    }
    Cons(int n,String s){
        System.out.println("Que11(int, String)");
    }
    Cons(String s,int num){
        System.out.println("String,int");
    }
    public static void main(String ar[]){
        Cons ob1=new Cons();
        Cons ob2=new Cons(20);
        Cons ob3=new Cons(30,"Abc");
        Cons ob4=new Cons("SMS",100);
        Cons ob5=new Cons("VNS");
    }
    
}
