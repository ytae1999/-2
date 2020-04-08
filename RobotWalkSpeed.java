
/**
 * RobotWalk 메소드에 대한 코드
 * 
 * 2018315005 유제훈, 2018315033 태영준
 * 2020.04.05 
 */
public class RobotWalkSpeed
{
    public static void main(String[] args){
        String trafficLight; // trafficLight 선언 
               
        trafficLight = "green"; // 초기화 
        trafficLight = "yellow"; // 초기화 
        trafficLight = "red"; // 초기화 
       
        System.out.println("교통신호가 녹색이므로 " + RobotWalk("green") + 
                            "km/h" + " 속도로 보행 계속");
        System.out.println("교통신호가 노란색이므로 " + RobotWalk("yellow") + 
                            "km/h" + " 속도로 보행 계속");
        System.out.println("교통신호가 빨간색이므로 " + RobotWalk("red") + 
                            "km/h" + " 속도로 보행 정지");
    }
    
    public static int RobotWalk(String trafficLight){
        int speed = 5; // speed 값 5로 설정
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