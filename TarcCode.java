/*
 * 
 * Code in Java:
 * 
 * 
 * int bestPercent = 0;
 * boolean falling = false;
 * double highApogee = 0;
 * double lowApogee = 0;
 * double targetApogee = 800;
 * 
 * 
 * while(!falling) {
 *     
 *     if(getVelocity <= 0) {
            
            setAirBrakePercent(0);
            falling = true;
            
        }
        
        else {
 *     
 *          for(int i = 100; i >= 0; i--) {
 *         
 *              highApogee = predictApogee(i-1);
 *              lowApogee = predictApogee(i);
 *         
 *              if(lowApogee <= 800 && highApogee >= 800) {
 *           
 *                  if(Math.abs(800-lowApogee) < Math.abs(800-highApogee))
 *                      bestPercent = i;
 *                  else
 *                      bestPercent = i-1;
 *           
 *                  break;
 *                  
                 }
              
                 
                if(i == 100 && predictApogee(i) >= 800) {
                    
                    bestPercent = 100;
                    break;
                    
                }
                 
            }   
            
            setAirBrakePercent(bestPercent);
            delay(100);
            
        }
        
        
 *     
 *     
 *     
}
 * 
 * 
 * Psuedocode: 
 * 
SET bestPercent = 0
SET falling = false
SET highApogee = 0
SET lowApogee = 0
SET targetApogee = 800


WHILE falling is false:
 
      //checks if rocket is falling or stopped moving upwards. Airbrakes will close and loop will terminate at first occurance
      
      IF getVelocity() is less than or equal to 0:
          setAirBrakePercent(0);
          SET falling = true;
     
      ELSE:
    
          //loops through possible percentages of airbrake
       
          FOR percent = 100 to 0:
     
              SET highApogee = predictApogee(percent-1)
              SET lowApogee = predictApogee(percent)
      
     
              //As opposed to weighing all percentages 0 - 100 against one another, loop only searches until it finds percent where apogee is below 800 and consecutive percent where apogee is above 800. All other percentages above and below these two limits result in greater deviations from 800 and do not have to be searched 
              
              IF lowApogee is less than or equal to targetApogee and highApogee is greater than or equal to targetApogee:
              
                  IF absolute value of lowApogee - targetApogee is less than absolute value of highApogee - targetApogee:
                      Set bestPercent = percent;
                  ELSE:
                  Set bestPercent = percent - 1;
                  
                  END IF
                  
                  break  
                  
               END IF
               
               //If statement handles edge case where maximum airbrake extension results in overshot apogee and code within above if statement is never run
               
               IF i equals 100 and predictApogee(i) is greater than or equal to targetApogee:
                   SET bestPercent = 100
                   break
               END IF
              
          END FOR
     
          setAirBrakePercent(bestPercent)
          
          //To avoid the airbrakes adjusting every iteration of the loop, a delay function is used
          delay(100)
          
     END IF
     
 END WHILE
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 * 
 * 
 *
 * 
 * 
 * 
 */