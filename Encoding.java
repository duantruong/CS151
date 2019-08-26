import java.util.*;

public class Encoding{
   public static void gen(int m, int n, String gen, Set<String> result){

   if(m==0&&n==0){
      result.add(gen);
      return;
   }

   if(n==0){
      gen(m-1,n,gen+".",result);
      return;
   }
   if(m==0){
      gen(m,n-1,gen+"-",result);
      return;
   }

   gen(m-1,n,gen+".",result);
   gen(m,n-1,gen+"-",result);
}
public static Set<String> morseCodes(int m, int n){
   Set<String> result = new TreeSet<>();
   gen(m,n,"", result);
   return result;
  
}
}
