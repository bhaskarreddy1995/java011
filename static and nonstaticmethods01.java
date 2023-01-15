class B{
static int a =10;
static void m1(){
	 System.out.println("main");
}
int x=20;
 public static void main(String[] args){
 System.out.println("main");
 B a1 =new B();
 B a2 =new B();
 B.a=20;
 m1();
 System.out.println(B.a);
 System.out.println(a);
 
 }

}