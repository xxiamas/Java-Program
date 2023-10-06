//Program to using constructor
class Constructor {
    //Constructor
    Constructor(){
        System.out.println("Que11()called");
    }
    public static void main(String args[]){
        Constructor ob=new Constructor();
        ob.method();
    }
    
    void method(){
        System.out.println("method()");
    }
    
}
