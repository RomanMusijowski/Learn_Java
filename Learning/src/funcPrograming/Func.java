package funcPrograming;

import java.time.LocalTime;

public class Func {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.solve("10:15"));

    }
}

class App {
    public int solve(String time) {
        int angle;
        LocalTime t = LocalTime.parse(time);
        double hourAngleD =  360.0 / 12;
        double minuteAngleD = 360.0 / 60;
        double hourDeltaAngleD = hourAngleD / 60;

        int minAngle = (int) (t.getMinute() * minuteAngleD);
        int hourAngle = (int) (t.getHour()%12 * hourAngleD + hourDeltaAngleD * t.getMinute());

        angle = hourAngle - minAngle;
        if (angle < 0) {
            angle = 360 + angle;
        }

        return angle;
    }
}