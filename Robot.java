
/**
 * RobotWalk 메소드에 대한 코드
 * 
 * @author (2018315005 유제훈, 2018315033 태영준)
 * @version (2020.04.10) 
 */
public class Robot
<<<<<<< HEAD
{   
    public static int RobotWalk(String trafficLight, int speed){                  
        trafficLight = "green"; // 초기화 
        trafficLight = "yellow"; // 초기화 
        trafficLight = "red"; // 초기화 
        
=======
{    
    public static int RobotWalk(String trafficLight, int speed){
        speed = 5; // speed 값 5로 설정
>>>>>>> 2024b459e825bbf6031de483a0cb6f95face24b2
        if(trafficLight == "green"){    
<<<<<<< HEAD
            if(trafficLight == "yellow"){
                speed = (int)(speed*1.2);                 
            }else{
                speed = 0;   
            }
=======
        
      
        }
        else if(trafficLight == "yellow"){
            speed = (int)(speed*1.2); 
        }
        else{
            speed = 0;
>>>>>>> 2024b459e825bbf6031de483a0cb6f95face24b2
        }
        return speed;
    }
}