import java.util.Scanner;
/**
 * 여기에 RobotWalk 클래스 설명을 작성하십시오.
 * 
 * 2018315005 유제훈 2018315033 태영준
 * 2020.04.05 
 */
public class RobotWalk
{
    public static void main(String[] args){
        
        //String trafficLight;
        
        result = RobotWalk();        
        System.out.println(result);
    }
    
    public static String RobotWalk(){
        double Speed = 50;
        Scanner trafficLight = new Scanner(System.in);
        if(trafficLight.equals("green")){    
           
        }
        else if(trafficLight.equals("yellow")){
            Speed = Speed*1.2; 
        }
        else{
            Speed = 0;
        }
        return RobotWalk();
    }
}