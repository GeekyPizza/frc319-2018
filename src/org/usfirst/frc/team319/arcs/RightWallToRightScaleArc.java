package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (12.00,0.00,0.00)
	// (22.50,4.00,15.00)
	
    public RightWallToRightScaleArc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToRightScaleArc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{-0.142,-2.835,10.000,0.000},
				{-0.709,-5.670,10.000,0.000},
				{-1.984,-12.757,10.000,0.000},
				{-4.252,-22.679,10.000,0.000},
				{-7.796,-35.435,10.000,0.000},
				{-12.898,-51.027,10.000,0.000},
				{-19.844,-69.453,10.000,0.000},
				{-28.774,-89.297,10.000,0.000},
				{-39.688,-109.141,10.000,0.000},
				{-52.586,-128.985,10.000,0.000},
				{-67.469,-148.828,10.000,0.000},
				{-84.336,-168.672,10.000,0.000},
				{-103.188,-188.516,10.000,0.000},
				{-124.024,-208.360,10.000,0.000},
				{-146.844,-228.204,10.000,0.000},
				{-171.649,-248.047,10.000,0.000},
				{-198.438,-267.891,10.000,0.000},
				{-227.211,-287.735,10.000,0.000},
				{-257.969,-307.579,10.000,0.000},
				{-290.712,-327.423,10.000,0.000},
				{-325.438,-347.266,10.000,0.000},
				{-362.149,-367.110,10.000,0.000},
				{-400.845,-386.954,10.000,0.000},
				{-441.524,-406.798,10.000,0.000},
				{-484.189,-426.642,10.000,0.000},
				{-528.837,-446.485,10.000,0.000},
				{-575.470,-466.329,10.000,0.000},
				{-624.087,-486.173,10.000,0.000},
				{-674.689,-506.017,10.000,0.000},
				{-727.275,-525.861,10.000,0.000},
				{-781.846,-545.704,10.000,0.000},
				{-838.400,-565.548,10.000,0.000},
				{-896.940,-585.392,10.000,0.000},
				{-957.463,-605.236,10.000,0.000},
				{-1019.971,-625.080,10.000,0.000},
				{-1084.463,-644.923,10.000,0.000},
				{-1150.940,-664.767,10.000,0.000},
				{-1219.401,-684.611,10.000,0.000},
				{-1289.847,-704.455,10.000,0.000},
				{-1362.277,-724.299,10.000,0.000},
				{-1436.691,-744.142,10.000,0.000},
				{-1513.089,-763.986,10.000,0.000},
				{-1591.472,-783.830,10.000,0.000},
				{-1671.840,-803.674,10.000,0.000},
				{-1754.191,-823.517,10.000,0.000},
				{-1838.528,-843.361,10.000,0.000},
				{-1924.848,-863.205,10.000,0.000},
				{-2013.153,-883.049,10.000,0.000},
				{-2103.442,-902.893,10.000,0.000},
				{-2195.716,-922.736,10.000,0.000},
				{-2289.974,-942.580,10.000,0.000},
				{-2386.216,-962.424,10.000,0.000},
				{-2484.443,-982.268,10.000,0.000},
				{-2584.654,-1002.112,10.000,0.000},
				{-2686.850,-1021.955,10.000,0.000},
				{-2791.030,-1041.799,10.000,0.000},
				{-2897.194,-1061.643,10.000,0.000},
				{-3005.343,-1081.487,10.000,0.000},
				{-3115.476,-1101.331,10.000,0.000},
				{-3227.593,-1121.174,10.000,0.000},
				{-3341.695,-1141.018,10.000,0.000},
				{-3457.781,-1160.862,10.000,0.000},
				{-3575.852,-1180.706,10.000,0.000},
				{-3695.907,-1200.550,10.000,0.000},
				{-3817.946,-1220.393,10.000,0.000},
				{-3941.970,-1240.237,10.000,0.000},
				{-4067.978,-1260.081,10.000,0.000},
				{-4195.970,-1279.925,10.000,0.000},
				{-4325.947,-1299.769,10.000,0.000},
				{-4457.909,-1319.612,10.000,0.000},
				{-4591.854,-1339.456,10.000,0.000},
				{-4727.784,-1359.300,10.000,0.000},
				{-4865.698,-1379.144,10.000,0.000},
				{-5005.597,-1398.988,10.000,0.000},
				{-5147.480,-1418.831,10.000,0.000},
				{-5291.348,-1438.675,10.000,0.000},
				{-5437.200,-1458.519,10.000,0.000},
				{-5585.036,-1478.363,10.000,0.000},
				{-5734.857,-1498.207,10.000,0.000},
				{-5886.662,-1518.050,10.000,0.000},
				{-6040.451,-1537.894,10.000,0.000},
				{-6196.225,-1557.738,10.000,0.000},
				{-6353.983,-1577.582,10.000,0.000},
				{-6513.726,-1597.425,10.000,0.000},
				{-6675.453,-1617.269,10.000,0.000},
				{-6839.164,-1637.113,10.000,0.000},
				{-7004.860,-1656.957,10.000,0.000},
				{-7172.540,-1676.801,10.000,0.000},
				{-7342.204,-1696.644,10.000,0.000},
				{-7513.853,-1716.488,10.000,0.000},
				{-7687.486,-1736.332,10.000,0.000},
				{-7863.104,-1756.176,10.000,0.000},
				{-8040.706,-1776.020,10.000,0.000},
				{-8220.292,-1795.863,10.000,0.000},
				{-8401.863,-1815.707,10.000,0.000},
				{-8585.418,-1835.551,10.000,0.000},
				{-8770.957,-1855.395,10.000,0.000},
				{-8958.481,-1875.239,10.000,0.000},
				{-9147.989,-1895.082,10.000,0.000},
				{-9339.482,-1914.926,10.000,0.000},
				{-9532.959,-1934.770,10.000,0.000},
				{-9728.420,-1954.614,10.000,0.000},
				{-9925.866,-1974.458,10.000,0.000},
				{-10125.296,-1994.301,10.000,0.000},
				{-10326.711,-2014.145,10.000,0.000},
				{-10530.110,-2033.989,10.000,0.000},
				{-10735.493,-2053.833,10.000,0.000},
				{-10942.861,-2073.677,10.000,0.000},
				{-11152.213,-2093.520,10.000,0.000},
				{-11363.549,-2113.364,10.000,0.000},
				{-11576.870,-2133.208,10.000,0.000},
				{-11792.175,-2153.052,10.000,0.000},
				{-12009.465,-2172.896,10.000,0.000},
				{-12228.739,-2192.739,10.000,0.000},
				{-12449.997,-2212.583,10.000,0.000},
				{-12673.240,-2232.427,10.000,0.000},
				{-12898.467,-2252.271,10.000,0.000},
				{-13125.678,-2272.115,10.000,0.000},
				{-13354.874,-2291.958,10.000,0.000},
				{-13586.054,-2311.802,10.000,0.000},
				{-13819.219,-2331.646,10.000,0.000},
				{-14054.368,-2351.490,10.000,0.000},
				{-14291.501,-2371.333,10.000,0.000},
				{-14530.619,-2391.177,10.000,0.000},
				{-14771.721,-2411.021,10.000,0.000},
				{-15014.807,-2430.865,10.000,0.000},
				{-15259.878,-2450.709,10.000,0.000},
				{-15506.933,-2470.552,10.000,0.000},
				{-15755.973,-2490.396,10.000,0.000},
				{-16006.997,-2510.240,10.000,0.000},
				{-16260.005,-2530.084,10.000,0.000},
				{-16514.998,-2549.928,10.000,0.000},
				{-16771.975,-2569.771,10.000,0.000},
				{-17030.937,-2589.615,10.000,0.000},
				{-17291.883,-2609.459,10.000,0.000},
				{-17554.813,-2629.303,10.000,0.000},
				{-17819.728,-2649.147,10.000,0.000},
				{-18086.627,-2668.990,10.000,0.000},
				{-18355.510,-2688.834,10.000,0.000},
				{-18626.378,-2708.678,10.000,0.000},
				{-18899.230,-2728.522,10.000,0.000},
				{-19174.067,-2748.366,10.000,0.000},
				{-19450.888,-2768.209,10.000,0.000},
				{-19729.693,-2788.053,10.000,0.000},
				{-20010.483,-2807.897,10.000,0.000},
				{-20293.257,-2827.741,10.000,0.000},
				{-20578.015,-2847.585,10.000,0.000},
				{-20864.758,-2867.428,10.000,0.000},
				{-21153.485,-2887.272,10.000,0.000},
				{-21444.197,-2907.116,10.000,0.000},
				{-21736.751,-2925.542,10.000,0.000},
				{-22030.864,-2941.134,10.000,0.000},
				{-22326.254,-2953.891,10.000,0.000},
				{-22622.635,-2963.812,10.000,0.000},
				{-22919.725,-2970.900,10.000,0.000},
				{-23217.240,-2975.152,10.000,0.000},
				{-23514.897,-2976.569,10.000,0.000},
				{-23812.554,-2976.569,10.000,0.000},
				{-24110.211,-2976.569,10.000,0.000},
				{-24407.868,-2976.569,10.000,0.000},
				{-24705.525,-2976.569,10.000,0.000},
				{-25003.181,-2976.569,10.000,0.000},
				{-25300.838,-2976.569,10.000,0.000},
				{-25598.495,-2976.569,10.000,0.000},
				{-25896.152,-2976.569,10.000,0.000},
				{-26193.809,-2976.569,10.000,0.000},
				{-26491.466,-2976.569,10.000,0.000},
				{-26789.123,-2976.569,10.000,0.000},
				{-27086.780,-2976.569,10.000,0.000},
				{-27384.437,-2976.569,10.000,0.000},
				{-27682.094,-2976.569,10.000,0.000},
				{-27979.751,-2976.569,10.000,0.000},
				{-28277.408,-2976.569,10.000,0.000},
				{-28575.065,-2976.569,10.000,0.000},
				{-28872.721,-2976.569,10.000,0.000},
				{-29170.378,-2976.569,10.000,0.000},
				{-29468.035,-2976.569,10.000,0.000},
				{-29765.692,-2976.569,10.000,0.000},
				{-30063.349,-2976.569,10.000,0.000},
				{-30361.006,-2976.569,10.000,0.000},
				{-30658.663,-2976.569,10.000,0.000},
				{-30956.320,-2976.569,10.000,0.000},
				{-31253.977,-2976.569,10.000,0.000},
				{-31551.634,-2976.569,10.000,0.000},
				{-31849.291,-2976.569,10.000,0.000},
				{-32146.948,-2976.569,10.000,0.000},
				{-32444.605,-2976.569,10.000,0.000},
				{-32742.261,-2976.569,10.000,0.000},
				{-33039.918,-2976.569,10.000,0.000},
				{-33337.575,-2976.569,10.000,0.000},
				{-33635.232,-2976.569,10.000,0.000},
				{-33932.889,-2976.569,10.000,0.000},
				{-34230.546,-2976.569,10.000,0.000},
				{-34528.203,-2976.569,10.000,0.000},
				{-34825.860,-2976.569,10.000,0.000},
				{-35123.517,-2976.569,10.000,0.000},
				{-35421.174,-2976.569,10.000,0.000},
				{-35718.831,-2976.569,10.000,0.000},
				{-36016.488,-2976.569,10.000,0.000},
				{-36314.145,-2976.569,10.000,0.000},
				{-36611.801,-2976.569,10.000,0.000},
				{-36909.458,-2976.569,10.000,0.000},
				{-37207.115,-2976.569,10.000,0.000},
				{-37504.772,-2976.569,10.000,0.000},
				{-37802.429,-2976.569,10.000,0.000},
				{-38100.086,-2976.569,10.000,0.000},
				{-38397.743,-2976.569,10.000,0.000},
				{-38695.400,-2976.569,10.000,0.000},
				{-38993.057,-2976.569,10.000,0.000},
				{-39290.714,-2976.569,10.000,0.000},
				{-39588.371,-2976.569,10.000,0.000},
				{-39886.028,-2976.569,10.000,0.000},
				{-40183.684,-2976.569,10.000,0.000},
				{-40481.341,-2976.569,10.000,0.000},
				{-40778.998,-2976.569,10.000,0.000},
				{-41076.655,-2976.569,10.000,0.000},
				{-41374.312,-2976.569,10.000,0.000},
				{-41671.969,-2976.569,10.000,0.000},
				{-41969.626,-2976.569,10.000,0.000},
				{-42267.283,-2976.569,10.000,0.000},
				{-42564.940,-2976.569,10.000,0.000},
				{-42862.597,-2976.569,10.000,0.000},
				{-43160.254,-2976.569,10.000,0.000},
				{-43457.911,-2976.569,10.000,0.000},
				{-43755.568,-2976.569,10.000,0.000},
				{-44053.224,-2976.569,10.000,0.000},
				{-44350.881,-2976.569,10.000,0.000},
				{-44648.538,-2976.569,10.000,0.000},
				{-44946.195,-2976.569,10.000,0.000},
				{-45243.852,-2976.569,10.000,0.000},
				{-45541.509,-2976.569,10.000,0.000},
				{-45839.166,-2976.569,10.000,0.000},
				{-46136.823,-2976.569,10.000,0.000},
				{-46434.480,-2976.569,10.000,0.000},
				{-46732.137,-2976.569,10.000,0.000},
				{-47029.794,-2976.569,10.000,0.000},
				{-47327.451,-2976.569,10.000,0.000},
				{-47625.108,-2976.569,10.000,0.000},
				{-47922.764,-2976.569,10.000,0.000},
				{-48220.421,-2976.569,10.000,0.000},
				{-48518.078,-2976.569,10.000,0.000},
				{-48815.735,-2976.569,10.000,0.000},
				{-49113.392,-2976.569,10.000,0.000},
				{-49411.049,-2976.569,10.000,0.000},
				{-49708.706,-2976.569,10.000,0.000},
				{-50006.363,-2976.569,10.000,0.000},
				{-50304.020,-2976.569,10.000,0.000},
				{-50601.677,-2976.569,10.000,0.000},
				{-50899.334,-2976.569,10.000,0.000},
				{-51196.991,-2976.569,10.000,0.000},
				{-51494.648,-2976.569,10.000,0.000},
				{-51792.304,-2976.569,10.000,0.000},
				{-52089.961,-2976.569,10.000,0.000},
				{-52387.618,-2976.569,10.000,0.000},
				{-52685.275,-2976.569,10.000,0.000},
				{-52982.932,-2976.569,10.000,0.000},
				{-53280.589,-2976.569,10.000,0.000},
				{-53578.246,-2976.569,10.000,0.000},
				{-53875.903,-2976.569,10.000,0.000},
				{-54173.560,-2976.569,10.000,0.000},
				{-54471.217,-2976.569,10.000,0.000},
				{-54768.874,-2976.569,10.000,0.000},
				{-55066.531,-2976.569,10.000,0.000},
				{-55364.188,-2976.569,10.000,0.000},
				{-55661.844,-2976.569,10.000,0.000},
				{-55959.501,-2976.569,10.000,0.000},
				{-56257.158,-2976.569,10.000,0.000},
				{-56554.815,-2976.569,10.000,0.000},
				{-56852.472,-2976.569,10.000,0.000},
				{-57150.129,-2976.569,10.000,0.000},
				{-57447.786,-2976.569,10.000,0.000},
				{-57745.443,-2976.569,10.000,0.000},
				{-58043.100,-2976.569,10.000,0.000},
				{-58340.757,-2976.569,10.000,0.000},
				{-58638.414,-2976.569,10.000,0.000},
				{-58936.071,-2976.569,10.000,0.000},
				{-59233.728,-2976.569,10.000,0.000},
				{-59531.384,-2976.569,10.000,0.000},
				{-59829.888,-2985.034,10.000,0.010},
				{-60130.054,-3001.659,10.000,0.040},
				{-60431.838,-3017.846,10.000,0.088},
				{-60735.200,-3033.618,10.000,0.156},
				{-61040.100,-3048.997,10.000,0.241},
				{-61346.500,-3064.001,10.000,0.344},
				{-61654.365,-3078.649,10.000,0.465},
				{-61963.660,-3092.954,10.000,0.602},
				{-62274.353,-3106.932,10.000,0.756},
				{-62586.413,-3120.594,10.000,0.925},
				{-62899.808,-3133.951,10.000,1.111},
				{-63214.509,-3147.011,10.000,1.312},
				{-63530.487,-3159.782,10.000,1.528},
				{-63847.714,-3172.270,10.000,1.759},
				{-64166.162,-3184.480,10.000,2.004},
				{-64485.804,-3196.414,10.000,2.264},
				{-64806.611,-3208.074,10.000,2.537},
				{-65128.557,-3219.461,10.000,2.823},
				{-65451.615,-3230.575,10.000,3.123},
				{-65775.756,-3241.414,10.000,3.435},
				{-66100.954,-3251.975,10.000,3.760},
				{-66427.179,-3262.255,10.000,4.097},
				{-66754.404,-3272.249,10.000,4.446},
				{-67082.599,-3281.952,10.000,4.806},
				{-67411.735,-3291.356,10.000,5.177},
				{-67741.780,-3300.456,10.000,5.559},
				{-68072.705,-3309.243,10.000,5.952},
				{-68404.476,-3317.710,10.000,6.354},
				{-68737.061,-3325.848,10.000,6.766},
				{-69070.425,-3333.647,10.000,7.187},
				{-69404.535,-3341.098,10.000,7.617},
				{-69739.354,-3348.193,10.000,8.056},
				{-70074.846,-3354.921,10.000,8.502},
				{-70410.974,-3361.273,10.000,8.956},
				{-70747.698,-3367.239,10.000,9.416},
				{-71084.979,-3372.810,10.000,9.884},
				{-71422.777,-3377.978,10.000,10.357},
				{-71761.050,-3382.734,10.000,10.836},
				{-72099.757,-3387.070,10.000,11.321},
				{-72438.855,-3390.979,10.000,11.809},
				{-72778.300,-3394.454,10.000,12.302},
				{-73118.049,-3397.490,10.000,12.799},
				{-73458.057,-3400.081,10.000,13.298},
				{-73798.280,-3402.225,10.000,13.800},
				{-74138.672,-3403.918,10.000,14.304},
				{-74479.187,-3405.158,10.000,14.810},
				{-74819.782,-3405.946,10.000,15.316},
				{-75160.410,-3406.281,10.000,15.823},
				{-75501.026,-3406.164,10.000,16.330},
				{-75841.586,-3405.600,10.000,16.836},
				{-76182.046,-3404.592,10.000,17.341},
				{-76522.360,-3403.144,10.000,17.844},
				{-76862.486,-3401.264,10.000,18.345},
				{-77202.382,-3398.959,10.000,18.843},
				{-77542.006,-3396.236,10.000,19.338},
				{-77881.317,-3393.106,10.000,19.830},
				{-78220.274,-3389.579,10.000,20.317},
				{-78558.841,-3385.666,10.000,20.799},
				{-78896.979,-3381.378,10.000,21.277},
				{-79234.652,-3376.728,10.000,21.749},
				{-79571.825,-3371.730,10.000,22.215},
				{-79908.464,-3366.397,10.000,22.675},
				{-80244.538,-3360.742,10.000,23.128},
				{-80580.017,-3354.782,10.000,23.574},
				{-80914.870,-3348.529,10.000,24.013},
				{-81249.069,-3341.999,10.000,24.444},
				{-81582.590,-3335.207,10.000,24.867},
				{-81915.407,-3328.168,10.000,25.282},
				{-82247.497,-3320.896,10.000,25.688},
				{-82578.837,-3313.406,10.000,26.085},
				{-82909.409,-3305.713,10.000,26.473},
				{-83239.192,-3297.831,10.000,26.852},
				{-83568.169,-3289.773,10.000,27.222},
				{-83896.324,-3281.553,10.000,27.581},
				{-84223.643,-3273.184,10.000,27.931},
				{-84550.111,-3264.679,10.000,28.271},
				{-84875.716,-3256.050,10.000,28.601},
				{-85200.446,-3247.308,10.000,28.920},
				{-85524.293,-3238.465,10.000,29.229},
				{-85847.246,-3229.532,10.000,29.527},
				{-86169.298,-3220.517,10.000,29.815},
				{-86490.441,-3211.432,10.000,30.092},
				{-86810.669,-3202.285,10.000,30.358},
				{-87129.978,-3193.084,10.000,30.614},
				{-87448.362,-3183.838,10.000,30.858},
				{-87765.817,-3174.554,10.000,31.092},
				{-88082.341,-3165.239,10.000,31.314},
				{-88397.931,-3155.899,10.000,31.526},
				{-88712.585,-3146.541,10.000,31.726},
				{-89026.302,-3137.170,10.000,31.916},
				{-89339.081,-3127.792,10.000,32.094},
				{-89650.922,-3118.410,10.000,32.261},
				{-89961.825,-3109.031,10.000,32.418},
				{-90271.791,-3099.658,10.000,32.563},
				{-90580.820,-3090.294,10.000,32.697},
				{-90888.915,-3080.943,10.000,32.820},
				{-91196.076,-3071.609,10.000,32.932},
				{-91502.305,-3062.294,10.000,33.033},
				{-91807.605,-3053.002,10.000,33.123},
				{-92111.978,-3043.734,10.000,33.203},
				{-92415.428,-3034.494,10.000,33.271},
				{-92717.956,-3025.284,10.000,33.328},
				{-93019.567,-3016.106,10.000,33.375},
				{-93320.263,-3006.962,10.000,33.411},
				{-93620.049,-2997.855,10.000,33.436},
				{-93918.927,-2988.787,10.000,33.450},
				{-94216.903,-2979.759,10.000,33.454},
				{-94513.981,-2970.774,10.000,33.447},
				{-94810.164,-2961.835,10.000,33.430},
				{-95105.459,-2952.943,10.000,33.402},
				{-95399.869,-2944.101,10.000,33.364},
				{-95693.400,-2935.311,10.000,33.315},
				{-95985.979,-2925.792,10.000,33.256},
				{-96277.396,-2914.169,10.000,33.187},
				{-96567.382,-2899.866,10.000,33.108},
				{-96855.674,-2882.919,10.000,33.019},
				{-97142.010,-2863.361,10.000,32.921},
				{-97426.133,-2841.227,10.000,32.813},
				{-97707.788,-2816.549,10.000,32.697},
				{-97986.801,-2790.129,10.000,32.572},
				{-98263.136,-2763.347,10.000,32.439},
				{-98536.816,-2736.802,10.000,32.299},
				{-98807.865,-2710.494,10.000,32.150},
				{-99076.308,-2684.424,10.000,31.994},
				{-99342.167,-2658.591,10.000,31.831},
				{-99605.466,-2632.995,10.000,31.662},
				{-99866.230,-2607.637,10.000,31.485},
				{-100124.481,-2582.515,10.000,31.303},
				{-100380.244,-2557.630,10.000,31.115},
				{-100633.543,-2532.983,10.000,30.920},
				{-100884.400,-2508.571,10.000,30.721},
				{-101132.839,-2484.396,10.000,30.517},
				{-101378.885,-2460.457,10.000,30.307},
				{-101622.560,-2436.753,10.000,30.093},
				{-101863.889,-2413.283,10.000,29.875},
				{-102102.893,-2390.047,10.000,29.653},
				{-102339.598,-2367.044,10.000,29.427},
				{-102574.025,-2344.272,10.000,29.198},
				{-102806.198,-2321.730,10.000,28.965},
				{-103036.140,-2299.417,10.000,28.730},
				{-103263.873,-2277.330,10.000,28.491},
				{-103489.420,-2255.469,10.000,28.251},
				{-103712.803,-2233.830,10.000,28.008},
				{-103934.044,-2212.411,10.000,27.764},
				{-104153.165,-2191.211,10.000,27.518},
				{-104370.187,-2170.225,10.000,27.270},
				{-104585.132,-2149.451,10.000,27.022},
				{-104798.021,-2128.885,10.000,26.772},
				{-105008.873,-2108.525,10.000,26.522},
				{-105217.710,-2088.366,10.000,26.272},
				{-105424.550,-2068.405,10.000,26.022},
				{-105629.414,-2048.637,10.000,25.771},
				{-105832.320,-2029.058,10.000,25.521},
				{-106033.286,-2009.663,10.000,25.272},
				{-106232.331,-1990.449,10.000,25.023},
				{-106429.472,-1971.409,10.000,24.775},
				{-106624.726,-1952.540,10.000,24.528},
				{-106818.109,-1933.835,10.000,24.283},
				{-107009.638,-1915.290,10.000,24.039},
				{-107199.328,-1896.899,10.000,23.797},
				{-107387.194,-1878.656,10.000,23.557},
				{-107573.250,-1860.557,10.000,23.318},
				{-107757.509,-1842.594,10.000,23.082},
				{-107939.985,-1824.763,10.000,22.849},
				{-108120.691,-1807.057,10.000,22.618},
				{-108299.638,-1789.471,10.000,22.389},
				{-108476.838,-1771.998,10.000,22.164},
				{-108652.301,-1754.633,10.000,21.941},
				{-108826.038,-1737.370,10.000,21.721},
				{-108998.059,-1720.203,10.000,21.505},
				{-109168.371,-1703.125,10.000,21.292},
				{-109336.984,-1686.131,10.000,21.082},
				{-109503.906,-1669.215,10.000,20.875},
				{-109669.143,-1652.372,10.000,20.673},
				{-109832.702,-1635.595,10.000,20.473},
				{-109994.590,-1618.878,10.000,20.278},
				{-110154.812,-1602.217,10.000,20.086},
				{-110313.372,-1585.606,10.000,19.898},
				{-110470.276,-1569.038,10.000,19.714},
				{-110625.527,-1552.510,10.000,19.534},
				{-110779.129,-1536.016,10.000,19.357},
				{-110931.084,-1519.550,10.000,19.185},
				{-111081.395,-1503.108,10.000,19.017},
				{-111230.063,-1486.685,10.000,18.853},
				{-111377.091,-1470.275,10.000,18.692},
				{-111522.478,-1453.876,10.000,18.536},
				{-111666.226,-1437.482,10.000,18.384},
				{-111808.335,-1421.088,10.000,18.236},
				{-111948.804,-1404.691,10.000,18.092},
				{-112087.633,-1388.287,10.000,17.952},
				{-112224.820,-1371.871,10.000,17.817},
				{-112360.364,-1355.441,10.000,17.685},
				{-112494.263,-1338.992,10.000,17.557},
				{-112626.515,-1322.520,10.000,17.433},
				{-112757.118,-1306.024,10.000,17.313},
				{-112886.068,-1289.498,10.000,17.197},
				{-113013.362,-1272.941,10.000,17.085},
				{-113138.997,-1256.350,10.000,16.977},
				{-113262.969,-1239.721,10.000,16.873},
				{-113385.274,-1223.052,10.000,16.772},
				{-113505.908,-1206.341,10.000,16.675},
				{-113624.866,-1189.584,10.000,16.582},
				{-113742.145,-1172.781,10.000,16.492},
				{-113857.737,-1155.929,10.000,16.406},
				{-113971.640,-1139.025,10.000,16.323},
				{-114083.847,-1122.068,10.000,16.243},
				{-114194.352,-1105.057,10.000,16.167},
				{-114303.151,-1087.989,10.000,16.095},
				{-114410.238,-1070.863,10.000,16.025},
				{-114515.605,-1053.678,10.000,15.959},
				{-114619.249,-1036.433,10.000,15.895},
				{-114721.161,-1019.126,10.000,15.835},
				{-114821.337,-1001.757,10.000,15.777},
				{-114919.769,-984.323,10.000,15.723},
				{-115016.452,-966.826,10.000,15.671},
				{-115111.378,-949.263,10.000,15.622},
				{-115204.542,-931.635,10.000,15.575},
				{-115295.936,-913.941,10.000,15.531},
				{-115385.554,-896.180,10.000,15.490},
				{-115473.389,-878.352,10.000,15.451},
				{-115559.435,-860.458,10.000,15.414},
				{-115643.684,-842.496,10.000,15.379},
				{-115726.131,-824.467,10.000,15.347},
				{-115806.768,-806.371,10.000,15.316},
				{-115885.589,-788.208,10.000,15.288},
				{-115962.587,-769.979,10.000,15.261},
				{-116037.755,-751.684,10.000,15.236},
				{-116111.088,-733.323,10.000,15.214},
				{-116182.577,-714.897,10.000,15.192},
				{-116252.218,-696.406,10.000,15.173},
				{-116320.003,-677.851,10.000,15.154},
				{-116385.926,-659.234,10.000,15.138},
				{-116449.982,-640.554,10.000,15.122},
				{-116512.163,-621.813,10.000,15.108},
				{-116572.464,-603.011,10.000,15.095},
				{-116630.879,-584.151,10.000,15.084},
				{-116687.403,-565.232,10.000,15.073},
				{-116742.028,-546.257,10.000,15.063},
				{-116794.751,-527.227,10.000,15.055},
				{-116845.565,-508.142,10.000,15.047},
				{-116894.466,-489.005,10.000,15.040},
				{-116941.447,-469.817,10.000,15.034},
				{-116986.505,-450.579,10.000,15.029},
				{-117029.634,-431.293,10.000,15.024},
				{-117070.830,-411.961,10.000,15.020},
				{-117110.089,-392.584,10.000,15.016},
				{-117147.405,-373.164,10.000,15.013},
				{-117182.776,-353.704,10.000,15.011},
				{-117216.196,-334.204,10.000,15.008},
				{-117247.663,-314.668,10.000,15.007},
				{-117277.173,-295.096,10.000,15.005},
				{-117304.722,-275.491,10.000,15.004},
				{-117330.307,-255.855,10.000,15.003},
				{-117353.926,-236.189,10.000,15.002},
				{-117375.576,-216.497,10.000,15.001},
				{-117395.254,-196.780,10.000,15.001},
				{-117412.958,-177.041,10.000,15.001},
				{-117428.686,-157.281,10.000,15.000},
				{-117442.436,-137.503,10.000,15.000},
				{-117454.207,-117.709,10.000,15.000},
				{-117463.997,-97.901,10.000,15.000},
				{-117471.805,-78.082,10.000,15.000},
				{-117477.710,-59.052,10.000,15.000},
				{-117481.934,-42.232,10.000,15.000},
				{-117484.758,-28.243,10.000,15.000},
				{-117486.466,-17.085,10.000,15.000},
				{-117487.343,-8.762,10.000,15.000},
				{-117487.670,-3.273,10.000,15.000},
				{-117487.732,-0.618,10.000,15.000},
				{-117487.732,-0.000,10.000,15.000}		};

}