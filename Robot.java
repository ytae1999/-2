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
<<<<<<< HEAD
        if(trafficLight == "green"){
            if(trafficLight == "yellow"){
                speed = 1.2 * speed;
        } else {
            
        ..
            
=======
        if(trafficLight != "green"){            
<<<<<<< HEAD
            if(trafficLight == "yellow" || trafficLight != "yellow"){  
                speed = (int)(speed*1.2);
                if(trafficLight == "red"){
                    speed = 0;                   
                }                 
            }          
=======
            if(trafficLight == "yellow"){ 
                speed = (int)(speed*1.2);                            
            }
            if(trafficLight == "red"){
                speed = 0;                      
                }     
>>>>>>> dc0925b81bec1f0320732a1911d38e23a5d60265
        }         
        return speed;
>>>>>>> f7a121f3878a4479cd4a878a75c8752048476742
    }
}