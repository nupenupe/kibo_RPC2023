package jp.jaxa.iss.kibo.rpc.planner;

import android.util.Log;

import gov.nasa.arc.astrobee.internal.BaseRobot;
import gov.nasa.arc.astrobee.types.FlightMode;
import gov.nasa.arc.astrobee.Result;
import gov.nasa.arc.astrobee.Kinematics;
import gov.nasa.arc.astrobee.types.Point;
import gov.nasa.arc.astrobee.types.Quaternion;
import jp.jaxa.iss.kibo.rpc.api.KiboRpcService;

import java.util.List;

import org.opencv.core.Mat;

/**
 * Class meant to handle commands from the Ground Data System and execute them in Astrobee
 */

public class YourService extends KiboRpcService {
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void runPlan1(){

        int loop_counter = 0;
        int target_id;

        /*setOperatingLimits(String profileName, FlightMode flightMode,
                            float targetLinearVelocity,
                            float targetLinearAcceleration,
                            float targetAngularVelocity,
                            float targetAngularAcceleration,
                            float collisionDistance);*/
        //BaseRobot::setOperatingLimits("",  FlightMode.PRECISION, 999, 999, 999, 999, 0.01);
        //BaseRobot.setOperatingLimits("",  FlightMode.PRECISION, 999, 999, 999, 999, 0.01);

        /*//////////////////////////////
        //      mission start         //
        /*//////////////////////////////
        api.startMission();

        MoveToWaypoint(waypoints_config.wp1);
        MoveToWaypoint(waypoints_config.point6);
        MoveToWaypoint(waypoints_config.point1);

        // irradiate the laser
        api.laserControl(true);
        api.laserControl(true);

        // take active target snapshots
        target_id = 1;
        api.takeTargetSnapshot(target_id);

        MoveToWaypoint(waypoints_config.point6);
        // irradiate the laser
        api.laserControl(true);

        // take active target snapshots
        target_id = 6;
        api.takeTargetSnapshot(target_id);

        MoveToWaypoint(waypoints_config.point2);

        // irradiate the laser
        api.laserControl(true);

        // take active target snapshots
        target_id = 2;
        api.takeTargetSnapshot(target_id);


        MoveToWaypoint(waypoints_config.point3);
        // irradiate the laser
        api.laserControl(true);
        // take active target snapshots
        target_id = 3;
        api.takeTargetSnapshot(target_id);

        MoveToWaypoint(waypoints_config.point5);
        // irradiate the laser
        api.laserControl(true);
        // take active target snapshots
        target_id = 5;
        api.takeTargetSnapshot(target_id);

        MoveToWaypoint(waypoints_config.point4);
        // irradiate the laser
        api.laserControl(true);
        // take active target snapshots
        target_id = 4;
        api.takeTargetSnapshot(target_id);

        /*
        while (true){
            // get the list of active target id
            List<Integer> list = api.getActiveTargets();


            // move to a point


            // get a camera image
            //Mat image = api.getMatNavCam();

            // irradiate the laser
            api.laserControl(true);

            // take active target snapshots
            int target_id = 1;
            api.takeTargetSnapshot(target_id);

        }
        // turn on the front flash light
        api.flashlightControlFront(0.05f);


        // turn off the front flash light
        api.flashlightControlFront(0.00f);


        // get remaining active time and mission time
        List<Long> timeRemaining = api.getTimeRemaining();
        // check the remaining milliseconds of mission time
        if (timeRemaining.get(1) < 60000){
            break;
        }*/

        // get QR code content
        String mQrContent = read_QRcode();
        // notify that astrobee is heading to the goal

        MoveToWaypoint(waypoints_config.goal_point);
        api.notifyGoingToGoal();

        // send mission completion
        api.reportMissionCompletion(mQrContent);
    }

    private void MoveToWaypoint(Waypoint name){

        final int LOOP_MAX = 10;

        int count = 0;
        while(count < LOOP_MAX){
            final Point point = new Point(
                    (float)(name.posX + name.avoidX*count),
                    (float)(name.posY + name.avoidY*count),
                    (float)(name.posZ + name.avoidZ*count)  );
            final Quaternion quaternion = new Quaternion(
                    (float)name.quaX,
                    (float)name.quaY,
                    (float)name.quaZ,
                    (float)name.quaW    );

            Result result = api.moveTo(point, quaternion, true);
            ++count;

            if(result.hasSucceeded()){
                break;
            }
            Log.w(TAG, "move Failure, retry");
        }
    }

    // You can add your method
    private String read_QRcode(){
        String QRcode_content = "";

        return QRcode_content;
    }
}
