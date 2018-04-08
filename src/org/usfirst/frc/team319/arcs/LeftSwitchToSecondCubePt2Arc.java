package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftSwitchToSecondCubePt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (9.00,18.03,-89.99)
	// (9.00,13.53,-89.99)
	
    public LeftSwitchToSecondCubePt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftSwitchToSecondCubePt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.551,11.012,10.000,-89.990},
				{2.753,33.035,10.000,-89.990},
				{7.708,66.069,10.000,-89.990},
				{16.517,110.116,10.000,-89.990},
				{30.282,165.174,10.000,-89.990},
				{50.103,231.243,10.000,-89.990},
				{77.081,308.324,10.000,-89.990},
				{112.318,396.417,10.000,-89.990},
				{156.915,495.521,10.000,-89.990},
				{211.973,605.637,10.000,-89.990},
				{278.593,726.764,10.000,-89.990},
				{357.876,858.903,10.000,-89.990},
				{450.924,1002.054,10.000,-89.990},
				{558.838,1156.216,10.000,-89.990},
				{682.167,1310.378,10.000,-89.990},
				{820.913,1464.540,10.000,-89.990},
				{975.076,1618.703,10.000,-89.990},
				{1144.654,1772.865,10.000,-89.990},
				{1329.649,1927.027,10.000,-89.990},
				{1530.059,2081.189,10.000,-89.990},
				{1745.886,2235.351,10.000,-89.990},
				{1977.130,2389.513,10.000,-89.990},
				{2223.789,2543.675,10.000,-89.990},
				{2485.865,2697.838,10.000,-89.990},
				{2763.356,2852.000,10.000,-89.990},
				{3056.265,3006.162,10.000,-89.990},
				{3364.589,3160.324,10.000,-89.990},
				{3688.329,3314.486,10.000,-89.990},
				{4027.486,3468.648,10.000,-89.991},
				{4382.059,3622.810,10.000,-89.991},
				{4752.048,3776.973,10.000,-89.991},
				{5137.454,3931.135,10.000,-89.991},
				{5538.275,4085.297,10.000,-89.991},
				{5954.513,4239.459,10.000,-89.991},
				{6386.167,4393.621,10.000,-89.991},
				{6833.237,4547.783,10.000,-89.992},
				{7295.724,4701.945,10.000,-89.992},
				{7773.626,4856.108,10.000,-89.992},
				{8266.945,5010.270,10.000,-89.992},
				{8775.680,5164.432,10.000,-89.992},
				{9299.831,5318.594,10.000,-89.993},
				{9839.399,5472.756,10.000,-89.993},
				{10394.383,5626.918,10.000,-89.993},
				{10964.783,5781.080,10.000,-89.994},
				{11550.599,5935.243,10.000,-89.994},
				{12151.831,6089.405,10.000,-89.994},
				{12768.480,6243.567,10.000,-89.995},
				{13400.545,6397.729,10.000,-89.995},
				{14048.026,6551.891,10.000,-89.995},
				{14710.923,6706.053,10.000,-89.996},
				{15389.236,6860.216,10.000,-89.996},
				{16082.966,7014.378,10.000,-89.997},
				{16792.112,7168.540,10.000,-89.997},
				{17516.674,7322.702,10.000,-89.998},
				{18256.652,7476.864,10.000,-89.998},
				{19012.047,7631.026,10.000,-89.999},
				{19782.857,7785.188,10.000,-89.999},
				{20569.084,7939.351,10.000,-90.000},
				{21370.728,8093.513,10.000,-90.000},
				{22187.787,8247.675,10.000,-90.001},
				{23020.263,8401.837,10.000,-90.001},
				{23868.154,8555.999,10.000,-90.002},
				{24731.462,8710.161,10.000,-90.002},
				{25610.187,8864.323,10.000,-90.003},
				{26504.327,9018.486,10.000,-90.003},
				{27413.884,9172.648,10.000,-90.004},
				{28338.857,9326.810,10.000,-90.004},
				{29279.246,9480.972,10.000,-90.005},
				{30235.051,9635.134,10.000,-90.005},
				{31205.722,9778.285,10.000,-90.006},
				{32190.157,9910.424,10.000,-90.006},
				{33187.256,10031.551,10.000,-90.007},
				{34195.917,10141.667,10.000,-90.007},
				{35215.039,10240.771,10.000,-90.007},
				{36243.521,10328.864,10.000,-90.008},
				{37280.261,10405.945,10.000,-90.008},
				{38324.159,10472.014,10.000,-90.008},
				{39374.113,10527.072,10.000,-90.008},
				{40429.023,10571.119,10.000,-90.009},
				{41487.787,10604.153,10.000,-90.009},
				{42549.303,10626.177,10.000,-90.009},
				{43612.451,10636.774,10.000,-90.009},
				{44675.557,10625.348,10.000,-90.009},
				{45736.970,10602.911,10.000,-90.009},
				{46795.588,10569.462,10.000,-90.009},
				{47850.311,10525.001,10.000,-90.008},
				{48900.038,10469.529,10.000,-90.008},
				{49943.666,10403.045,10.000,-90.008},
				{50980.096,10325.550,10.000,-90.008},
				{52008.226,10237.043,10.000,-90.007},
				{53026.954,10137.524,10.000,-90.007},
				{54035.180,10026.994,10.000,-90.007},
				{55031.803,9905.453,10.000,-90.006},
				{56015.720,9772.899,10.000,-90.006},
				{56985.832,9629.335,10.000,-90.005},
				{57941.057,9475.172,10.000,-90.005},
				{58880.866,9321.010,10.000,-90.004},
				{59805.259,9166.848,10.000,-90.004},
				{60714.236,9012.686,10.000,-90.003},
				{61607.796,8858.524,10.000,-90.003},
				{62485.941,8704.362,10.000,-90.002},
				{63348.669,8550.200,10.000,-90.002},
				{64195.981,8396.037,10.000,-90.001},
				{65027.876,8241.875,10.000,-90.001},
				{65844.356,8087.713,10.000,-90.000},
				{66645.419,7933.551,10.000,-90.000},
				{67431.066,7779.389,10.000,-89.999},
				{68201.297,7625.227,10.000,-89.999},
				{68956.111,7471.065,10.000,-89.998},
				{69695.510,7316.902,10.000,-89.998},
				{70419.492,7162.740,10.000,-89.997},
				{71128.058,7008.578,10.000,-89.997},
				{71821.207,6854.416,10.000,-89.996},
				{72498.941,6700.254,10.000,-89.996},
				{73161.258,6546.092,10.000,-89.995},
				{73808.159,6391.930,10.000,-89.995},
				{74439.644,6237.767,10.000,-89.995},
				{75055.713,6083.605,10.000,-89.994},
				{75656.365,5929.443,10.000,-89.994},
				{76241.601,5775.281,10.000,-89.994},
				{76811.421,5621.119,10.000,-89.993},
				{77365.825,5466.957,10.000,-89.993},
				{77904.813,5312.795,10.000,-89.993},
				{78428.384,5158.632,10.000,-89.992},
				{78936.539,5004.470,10.000,-89.992},
				{79429.278,4850.308,10.000,-89.992},
				{79906.601,4696.146,10.000,-89.992},
				{80368.507,4541.984,10.000,-89.992},
				{80814.997,4387.822,10.000,-89.991},
				{81246.071,4233.659,10.000,-89.991},
				{81661.729,4079.497,10.000,-89.991},
				{82061.971,3925.335,10.000,-89.991},
				{82446.796,3771.173,10.000,-89.991},
				{82816.206,3617.011,10.000,-89.991},
				{83170.199,3462.849,10.000,-89.991},
				{83508.775,3308.687,10.000,-89.990},
				{83831.936,3154.524,10.000,-89.990},
				{84139.680,3000.362,10.000,-89.990},
				{84432.008,2846.200,10.000,-89.990},
				{84708.920,2692.038,10.000,-89.990},
				{84970.416,2537.876,10.000,-89.990},
				{85216.495,2383.714,10.000,-89.990},
				{85447.159,2229.552,10.000,-89.990},
				{85662.406,2075.389,10.000,-89.990},
				{85862.237,1921.227,10.000,-89.990},
				{86046.651,1767.065,10.000,-89.990},
				{86215.650,1612.903,10.000,-89.990},
				{86369.232,1458.741,10.000,-89.990},
				{86507.398,1304.579,10.000,-89.990},
				{86630.148,1150.417,10.000,-89.990},
				{86737.502,996.669,10.000,-89.990},
				{86830.032,853.932,10.000,-89.990},
				{86908.839,722.208,10.000,-89.990},
				{86975.024,601.494,10.000,-89.990},
				{87029.688,491.793,10.000,-89.990},
				{87073.933,393.103,10.000,-89.990},
				{87108.859,305.425,10.000,-89.990},
				{87135.569,228.758,10.000,-89.990},
				{87155.162,163.102,10.000,-89.990},
				{87168.740,108.459,10.000,-89.990},
				{87177.404,64.827,10.000,-89.990},
				{87182.256,32.206,10.000,-89.990},
				{87184.396,10.597,10.000,-89.990},
				{87184.926,0.000,10.000,-89.990},
				{87184.926,0.000,10.000,-89.990}		};

}