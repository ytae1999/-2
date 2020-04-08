
/**
 * RobotWalk 메소드에 대한 코드
 * 
 * 2018315005 유제훈, 2018315033 태영준
 * 2020.04.05 
 */
public class RobotWalkSpeed
{
    public static void main(String[] args){
        String trafficLight;
               
        trafficLight = "green";
        trafficLight = "yellow";
        trafficLight = "red";
        
        System.out.println("교통신호가 녹색이므로 " + RobotWalk("green") + 
                            "km/h" + " 속도로 보행 계속");
        System.out.println("교통신호가 노란색이므로 " + RobotWalk("yellow") + 
                            "km/h" + " 속도로 보행 계속");
        System.out.println("교통신호가 빨간색이므로 " + RobotWalk("red") + 
                            "km/h" + " 속도로 보행 정지");
    }
    
    public static int RobotWalk(String trafficLight){
        int speed = 5;
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