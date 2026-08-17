import java.util.*;
class Duplicate2{
  public static void main(String args[]){
    String str = "aabbcc";
    boolean[] visited = new boolean[256];
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);

      if(!visited[ch]){
        System.out.print(ch);
        visited[ch] = true;// remove duplicates
      }
    }
  }
}
