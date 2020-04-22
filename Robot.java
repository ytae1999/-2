/**
 * RobotWalk 메소드에 대한 코드
 * 
 * @author (2018315005 유제훈, 2018315033 태영준)
 * @version (2020.04.23) 
 */
public class Robot
{           
    double speed; //변수 정의

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    public void RobotWalk(String trafficLight){                       
        if(trafficLight == "green"){            
        }else if(trafficLight == "yellow"){
            speed = speed * 1.2;                
        }else{
            speed = 0;
        }
    }
}
