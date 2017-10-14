class Util{
    public static void yell(){
        System.out.println("go to hell");
    }
}
public class Hello{
   public static void main(String[] args){
      Util.yell();
      for(int i=0;i<10;i++){
         System.out.println("Hello..."+i);
      }
      Util.yell();
   }
}
