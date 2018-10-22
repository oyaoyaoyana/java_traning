
public class Scores {
   public static void main(String[] args){
      int[][] scores = {{59, 39, 100, 2, 15, 40, 84, 97}, {63, 18, 64, 97, 50, 98}};
      int sum = 0;
      int count = 0;
      for(int[] ss : scores) {
    	  for(int score : ss) {
    		  sum += score;
    		  count++;
    	  }
      }
      System.out.println(sum / count);
   }
}
