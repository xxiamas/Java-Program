class Static {
    int n1;
    static int n2;
    public static void main(String args[]){
        Static ob1=new Static();
        Static ob2=new Static();
        Static ob3=new Static();
        System.out.println(ob1.n1);
        System.out.println(ob1.n2);
        ob1.n1=20; ob1.n2=30;
        System.out.println(ob2.n1);
        System.out.println(ob2.n2);
        System.out.println(ob3.n1); 
        System.out.println(ob3.n2);
    }
    
}
