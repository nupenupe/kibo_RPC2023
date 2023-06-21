package jp.jaxa.iss.kibo.rpc.planner;

public interface adjacency_matrix{
    // point1 ~ point6 => 0 ~ 5
    // goal => 6
    // wp1 ~ wp3 => 7 ~ 9
    double INF = Double.POSITIVE_INFINITY;
    double[][] graph = {
            {INF,INF,INF,INF,6.74895768959687,5.82327941793780,INF,INF,6.23460115016956,7.45462889252123},
            {INF,INF,INF,INF,INF,INF,7.46616302178100,5.63671265104441,5.79220325674665,INF},
            {INF,INF,INF,INF,INF,INF,6.15214020414184,INF,6.14276944306365,5.80219262026025},
            {INF,INF,INF,INF,6.52542223662827,INF,5.61089708625922,INF,7.09731828771887,5.85609053259571},
            {6.74895768959687,INF,INF,6.52542223662827,INF,INF,6.38356389444073,INF,5.67808332821269,5.75038523439631},
            {5.82327941793780,INF,INF,INF,INF,INF,7.28541262138809,6.07557240574496,5.65474651583647,INF},
            {INF,7.46616302178100,6.15214020414184,5.61089708625922,6.38356389444073,7.28541262138809,INF,INF,7.00856805958872,5.97490596982478},
            {INF,5.63671265104441,INF,INF,INF,6.07557240574496,INF,INF,6.28387421502264,7.42851518422266},
            {6.23460115016956,5.79220325674665,6.14276944306365,7.09731828771887,5.67808332821269,5.65474651583647,7.00856805958872,6.28387421502264,INF,6.25892454102698},
            {7.45462889252123,INF,5.80219262026025,5.85609053259571,5.75038523439631,INF,5.97490596982478,7.42851518422266,6.25892454102698,INF},
    };
}
