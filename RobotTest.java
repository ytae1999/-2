.
/**
 * Robot클래스를 실행시키는 메인 클래스
 *
 * @author (2018315005 유제훈, 2018315033 태영준)
 * @version (2020.04.10)
 */
public class RobotTest extends Robot
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
}
