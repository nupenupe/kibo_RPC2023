package jp.jaxa.iss.kibo.rpc.planner;

public interface waypoints_config {

    // set Waypoint value
// Write Position and Quaternion here.
// Waypoint(pos_x, pos_y, pos_z, qua_x, qua_y, qua_z, qua_w, avoidX, avoidY, avoidZ)
//X : right,left Y : back, front Z : down,up
    /*Waypoint point1 = new Waypoint(11.375, -9.922, 5.303,
            0.707, -0.707, 0, 0,
            0, 0, 0);    // Point*/
    Waypoint point1 = new Waypoint(11.318, -9.8, 5.251,
            0.707, -0.707, 0, 0,
            0, 0, 0);
    Waypoint point2 = new Waypoint(10.625, -9.144, 4.5,
            0, 0.707, 0, 0.707,
            0, 0, 0);    // Point
    Waypoint point3 = new Waypoint(10.722, -7.769, 4.55,
            0, 0.707, 0, 0.707,
            0, 0, 0);    // Point
    Waypoint point4 = new Waypoint(10.5, -6.616, 5.205,
            0, 0, 1, 0,
            0, 0, 0);    // Point
    Waypoint point5 = new Waypoint(10.992, -8.084, 5.34,
            0, -0.707, 0, 0.707,
            0, 0, 0);    // Point
    Waypoint point6 = new Waypoint(11.21, -9.045, 4.941,
            0, 0, 0, 1,
            0, 0, 0);    // Point
    Waypoint point7 = new Waypoint(11.362, -8.615, 4.883,
            -0.5, 0.5, 0.5, 0.5,
            0, 0, 0);    // QRcode

    Waypoint goal_point = new Waypoint(11.143, -6.7607, 4.9654,
            0, 0, -0.707, 0.707,
            0, 0, 0);    // Point

    Waypoint wp1 = new Waypoint(10.508, -9.769, 4.567,
                                    0, 0, 0, 1,
                                    0, 0, 0);    // way point
    Waypoint wp2 = new Waypoint(10.571, -8.708, 5.251,
            0, 0, -0.707, 0.707,
            0, 0, 0.0);    // way point
    Waypoint wp3 = new Waypoint(10.571, -7.463, 5.326,
            0, 0, -0.707, 0.707,
            0, 0, 0.0);    // way point
}