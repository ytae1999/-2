<<<<<<< HEAD
=======

>>>>>>> 2024b459e825bbf6031de483a0cb6f95face24b2
/**
 * Robot클래스를 실행시키는 메인 클래스
 *
 * @author (2018315005 유제훈, 2018315033 태영준)
 * @version (2020.04.10)
 */
public class RobotTest extends Robot
{
<<<<<<< HEAD
    public static void main(String[] args){        
=======
    public static void main(String[] args){
        
        String trafficLight; // trafficLight 선언 
               
        trafficLight = "green"; // 초기화 
        trafficLight = "yellow"; // 초기화 
        trafficLight = "red"; // 초기화 
>>>>>>> 2024b459e825bbf6031de483a0cb6f95face24b2
       
<<<<<<< HEAD
        System.out.println("교통신호가 녹색이므로 " +  RobotWalk("green") + 
=======
        System.out.println("교통신호가 녹색이므로 " + RobotWalk("green", 5) +
>>>>>>> 8b2316d5b5ef09fcae4715e3de8dccde0d4a2e32
                            "km/h" + " 속도로 보행 계속");
        System.out.println("교통신호가 노란색이므로 " + RobotWalk("yellow", 5) + 
                            "km/h" + " 속도로 보행 계속");
        System.out.println("교통신호가 빨간색이므로 " + RobotWalk("red", 5) + 
                            "km/h" + " 속도로 보행 정지");
    }
}
