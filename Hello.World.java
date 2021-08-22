public class Hello.World {
    public static void main(String[] args) {
    
        hello("saitou");
        metodB();
        int ans = add(100, 20);
        System.out.println(add(add(100, 20), add(30, 50)));
        int[] array = {1, 3, 4};
        printArray(array);
      }
    
      public static void hello(String name) {
        System.out.println(name);
      }
    
      public static void metodB() {
        System.out.println("tanaka");
      }
    
      public static int add(int x, int y) {
       int ans = x + y;
       return ans;
      }
    
      public static void printArray(int[] array) {
        for (int element : array) {
          System.out.println(element);
        }
      }
    
    
}
