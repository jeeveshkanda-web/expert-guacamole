

public class RecursionTestCodingBat
{
  
    
    public String deleteChars(String str) {
        
        
        if(str.length() < 2) 
            return str;
        
        if(str.length() == 2) {
            
            if(str.charAt(0) == str.charAt(1))
                return "";
            else
                return str;
                
        }
        
        
        if(str.charAt(str.length()-2) == str.charAt(str.length()-1)) {
            
            

        }
        
        
        if(str.charAt(str.length()-2) == str.charAt(str.length()-3)) {
            
            return deleteChars(str.substring(0, str.length()-1));
            
        }
        
        return deleteChars(str.substring(0, str.length()-1)) + str.charAt(str.length()-2);
        
    }
    
    //abdsbfggd
    
    
}