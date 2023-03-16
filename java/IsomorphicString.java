import java.util.*;  
public class IsomorphicString  
{    
  public static void main(String[] args)
  {  
    String s = "title";
    String t = "paepr"; 
    
     System.out.println("The given string values are " +isomorphicstring(s,t)+ " isomorphic values");  
  }  

    public static boolean isomorphicstring(String s, String t)   
    {  
       if (s== null || t == null || s.length() != t.length())
       {  
        return false;  
       }

        Map<Character, Character>  map= new HashMap<Character, Character>();  
        for (int i = 0; i < s.length(); i++)   
        {  
            if(map.containsKey(s.charAt(i)))
            {
                if(!map.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(t.charAt(i)))
                {
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
