class Methodoverloading{
static void m1(){
  System.out.println("m1");
  }
  static void m1(String a){
  System.out.println(a);
  }
  
public static void main (String[] args){
    System.out.println("hithere");
	m1("bhaskar");
}
}