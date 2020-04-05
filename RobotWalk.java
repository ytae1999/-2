
/**
 * 여기에 RobotWalk 클래스 설명을 작성하십시오.
 * 
 * 2018315005 유제훈 2018315033 태영준
 * 2020.04.05 
 */
public class RobotWalk
{
    public static void main(String[] args){
        String Trafficlight;
        
        
        Trafficlight = "green";
        Trafficlight = "yellow";
        Trafficlight = "red";
        
        System.out.println(RobotWalk("green"));
        System.out.println(RobotWalk("yellow"));
        System.out.println(RobotWalk("red"));

    }
    
    public static double RobotWalk(String Trafficlight){
        double Speed = 50.0;
        if(Trafficlight == "green"){    
           
        }
        else if(Trafficlight == "yellow"){
            Speed = Speed*1.2; 
        }
        else{
            Speed = 0;
        }
        return Speed;
    }
}