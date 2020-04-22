/**
 * RobotWalk 메소드에 대한 코드
 * 
 * @author (2018315005 유제훈, 2018315033 태영준)
 * @version (2020.04.10) 
 */
public class Robot
{           
    String trafficLight; //변수 정의
    double speed; //변수 정의
    
    public double getSpeed(){
        return speed;
    }
    
    public void setSpeed(double Speed){
        this.speed = speed;
    }
    
    public void RobotWalk(String trafficLight, double speed){                       
        if(trafficLight == "green"){            
        }else if(trafficLight == "yellow"){
            speed = speed * 1.2;           
        }else{
            speed = 0;
            }       
    }
}
