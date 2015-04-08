//Contoh method overloading
class TestMethodOverloading{
   public static int average(int nSatu, int nDua){ // A
      return (nSatu+nDua)/2;
   }
   public static double average(double nSatu, double nDua){ // B
      return (nSatu+nDua)/2;
   }
   public static int average(int nSatu, int nDua, int nTiga){ // C
      return (nSatu+nDua+nTiga)/3;
   }
    public static int average(int nSatu, int nDua, int nTiga, int nEmpat){ // D
      return (nSatu+nDua+nTiga+nEmpat)/4;
   }

   public static void main(String[] args) {
      System.out.println("Average satu    : " +average(1, 2));       // Use A
      System.out.println("Average dua     : " +average(1.0, 2.0));   // Use B
      System.out.println("Average tiga    : " +average(1, 2, 3));    // Use C
      System.out.println("Average dua     : " +average(1.0, 2));     // Use B - int 2 implicitly casted to double 2.0
      System.out.println("Average empat   : " +average(1, 2, 3, 4)); 
   }
}