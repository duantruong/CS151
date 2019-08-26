public class Strings
{
   public static String uniqueLetters(String str)
   {
      String answer = "";
         for(int i = 0; i < str.length(); ++i){
            int count = 0;
            for(int k = 0; k < str.length(); ++k){
                if(str.charAt(i) == str.charAt(k)){
                    ++count;
                }
            }
            if(count == 1){
                answer += String.valueOf(str.charAt(i));
            }
        }
        return answer;
   }
    public static void main(String[] args) {
        System.out.println(uniqueLetters("harrassess"));
    }
}
