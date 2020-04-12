
/**
 * RobotWalk 메소드에 대한 코드
 * 
 * @author (2018315005 유제훈, 2018315033 태영준)
 * @version (2020.04.10) 
 */
public class Robot
{           
    String trafficLight; //변수 정의
    int speed; //변수 정의

    public static int RobotWalk(String trafficLight, int speed){                       
        if(trafficLight != "green"){                    
            if(trafficLight == "yellow"){ 
<<<<<<< HEAD
                speed = (int)(speed*1.2); 
                if(trafficLight == "red"){
                    speed = 0;                      
                }
                
            }   
=======
                speed = (int)(speed*1.2);                            
            }
            if(trafficLight == "red"){
                speed = 0;                      
                }     
>>>>>>> 6721e5165d6473f6082bc0e4903f08505218c18a
        }         
        return speed;
    }
}