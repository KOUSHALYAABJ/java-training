import java.util.*;
class Longestsubstring
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Queue<Character> queue=new LinkedList<Character>();
    String str=sc.next();
    int result=0; 
    for(char ch:str.toCharArray())
    {
      if(queue.contains(ch))
      {
        while(queue.contains(ch))
        {
          queue.poll();
        }
      }
      queue.add(ch);
      result=Math.max(result,queue.size());
     }
     System.out.println(result);
   }
}
    
    
