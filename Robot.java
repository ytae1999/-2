
/**
 * RobotWalk 메소드에 대한 코드
 * 
 * @author (2018315005 유제훈, 2018315033 태영준)
 * @version (2020.04.10) 
 */
public class Robot
{    
    public static int RobotWalk(String trafficLight, int speed){
        speed = 5; // speed 값 5로 설정
        if(trafficLight == "green"){    
        
      
        }
        else if(trafficLight == "yellow"){
            speed = (int)(speed*1.2); 
        }
        else{
            speed = 0;
        }
        return speed;
    }
}