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
				{0.426,8.522,10.000,-89.990},
				{2.130,25.565,10.000,-89.990},
				{5.965,51.130,10.000,-89.990},
				{12.783,85.217,10.000,-89.990},
				{23.435,127.826,10.000,-89.990},
				{38.774,178.957,10.000,-89.990},
				{59.652,238.609,10.000,-89.990},
				{86.922,306.783,10.000,-89.990},
				{121.435,383.479,10.000,-89.990},
				{164.044,468.696,10.000,-89.990},
				{215.600,562.435,10.000,-89.990},
				{276.957,664.696,10.000,-89.990},
				{348.966,775.479,10.000,-89.990},
				{432.479,894.784,10.000,-89.990},
				{527.922,1014.088,10.000,-89.990},
				{635.296,1133.393,10.000,-89.990},
				{754.601,1252.697,10.000,-89.990},
				{885.836,1372.002,10.000,-89.990},
				{1029.001,1491.306,10.000,-89.990},
				{1184.097,1610.611,10.000,-89.990},
				{1351.123,1729.915,10.000,-89.990},
				{1530.080,1849.220,10.000,-89.990},
				{1720.967,1968.524,10.000,-89.990},
				{1923.785,2087.829,10.000,-89.990},
				{2138.533,2207.133,10.000,-89.990},
				{2365.211,2326.438,10.000,-89.990},
				{2603.820,2445.742,10.000,-89.990},
				{2854.360,2565.046,10.000,-89.990},
				{3116.830,2684.351,10.000,-89.991},
				{3391.230,2803.655,10.000,-89.991},
				{3677.561,2922.960,10.000,-89.991},
				{3975.822,3042.264,10.000,-89.991},
				{4286.014,3161.569,10.000,-89.991},
				{4608.136,3280.873,10.000,-89.991},
				{4942.188,3400.178,10.000,-89.991},
				{5288.171,3519.482,10.000,-89.992},
				{5646.085,3638.787,10.000,-89.992},
				{6015.929,3758.091,10.000,-89.992},
				{6397.703,3877.396,10.000,-89.992},
				{6791.408,3996.700,10.000,-89.992},
				{7197.043,4116.005,10.000,-89.993},
				{7614.609,4235.309,10.000,-89.993},
				{8044.105,4354.614,10.000,-89.993},
				{8485.532,4473.918,10.000,-89.994},
				{8938.889,4593.223,10.000,-89.994},
				{9404.176,4712.527,10.000,-89.994},
				{9881.394,4831.832,10.000,-89.995},
				{10370.543,4951.136,10.000,-89.995},
				{10871.621,5070.441,10.000,-89.995},
				{11384.631,5189.745,10.000,-89.996},
				{11909.570,5309.050,10.000,-89.996},
				{12446.441,5428.354,10.000,-89.997},
				{12995.241,5547.659,10.000,-89.997},
				{13555.972,5666.963,10.000,-89.998},
				{14128.634,5786.268,10.000,-89.998},
				{14713.226,5905.572,10.000,-89.999},
				{15309.748,6024.877,10.000,-89.999},
				{15918.201,6144.181,10.000,-90.000},
				{16538.585,6263.486,10.000,-90.000},
				{17170.898,6382.790,10.000,-90.001},
				{17815.143,6502.095,10.000,-90.001},
				{18471.317,6621.399,10.000,-90.002},
				{19139.422,6740.704,10.000,-90.002},
				{19819.458,6860.008,10.000,-90.003},
				{20511.424,6979.313,10.000,-90.003},
				{21215.320,7098.617,10.000,-90.004},
				{21931.147,7217.921,10.000,-90.004},
				{22658.905,7337.226,10.000,-90.005},
				{23398.593,7456.530,10.000,-90.005},
				{24149.785,7567.313,10.000,-90.006},
				{24911.629,7669.574,10.000,-90.006},
				{25683.274,7763.313,10.000,-90.007},
				{26463.866,7848.531,10.000,-90.007},
				{27252.554,7925.227,10.000,-90.007},
				{28048.485,7993.401,10.000,-90.008},
				{28850.808,8053.053,10.000,-90.008},
				{29658.670,8104.183,10.000,-90.008},
				{30471.218,8146.792,10.000,-90.008},
				{31287.602,8180.879,10.000,-90.009},
				{32106.968,8206.444,10.000,-90.009},
				{32928.465,8223.488,10.000,-90.009},
				{33751.223,8231.689,10.000,-90.009},
				{34573.950,8222.847,10.000,-90.009},
				{35395.367,8205.483,10.000,-90.009},
				{36214.621,8179.597,10.000,-90.009},
				{37030.860,8145.189,10.000,-90.008},
				{37843.232,8102.260,10.000,-90.008},
				{38650.886,8050.809,10.000,-90.008},
				{39452.968,7990.836,10.000,-90.008},
				{40248.627,7922.341,10.000,-90.007},
				{41037.010,7845.325,10.000,-90.007},
				{41817.266,7759.787,10.000,-90.007},
				{42588.542,7665.727,10.000,-90.006},
				{43349.985,7563.146,10.000,-90.006},
				{44100.745,7452.042,10.000,-90.005},
				{44839.984,7332.738,10.000,-90.005},
				{45567.292,7213.433,10.000,-90.004},
				{46282.670,7094.129,10.000,-90.004},
				{46986.118,6974.824,10.000,-90.003},
				{47677.635,6855.520,10.000,-90.003},
				{48357.222,6736.215,10.000,-90.002},
				{49024.878,6616.911,10.000,-90.002},
				{49680.604,6497.606,10.000,-90.001},
				{50324.400,6378.302,10.000,-90.001},
				{50956.264,6258.997,10.000,-90.000},
				{51576.199,6139.693,10.000,-90.000},
				{52184.203,6020.388,10.000,-89.999},
				{52780.277,5901.084,10.000,-89.999},
				{53364.420,5781.779,10.000,-89.998},
				{53936.633,5662.475,10.000,-89.998},
				{54496.915,5543.170,10.000,-89.997},
				{55045.267,5423.866,10.000,-89.997},
				{55581.688,5304.561,10.000,-89.996},
				{56106.179,5185.257,10.000,-89.996},
				{56618.739,5065.953,10.000,-89.995},
				{57119.369,4946.648,10.000,-89.995},
				{57608.069,4827.344,10.000,-89.995},
				{58084.838,4708.039,10.000,-89.994},
				{58549.677,4588.735,10.000,-89.994},
				{59002.585,4469.430,10.000,-89.994},
				{59443.563,4350.126,10.000,-89.993},
				{59872.610,4230.821,10.000,-89.993},
				{60289.727,4111.517,10.000,-89.993},
				{60694.914,3992.212,10.000,-89.992},
				{61088.170,3872.908,10.000,-89.992},
				{61469.495,3753.603,10.000,-89.992},
				{61838.890,3634.299,10.000,-89.992},
				{62196.355,3514.994,10.000,-89.992},
				{62541.889,3395.690,10.000,-89.991},
				{62875.493,3276.385,10.000,-89.991},
				{63197.166,3157.081,10.000,-89.991},
				{63506.909,3037.776,10.000,-89.991},
				{63804.721,2918.472,10.000,-89.991},
				{64090.603,2799.167,10.000,-89.991},
				{64364.555,2679.863,10.000,-89.991},
				{64626.576,2560.558,10.000,-89.990},
				{64876.666,2441.254,10.000,-89.990},
				{65114.827,2321.949,10.000,-89.990},
				{65341.056,2202.645,10.000,-89.990},
				{65555.355,2083.340,10.000,-89.990},
				{65757.724,1964.036,10.000,-89.990},
				{65948.163,1844.731,10.000,-89.990},
				{66126.671,1725.427,10.000,-89.990},
				{66293.248,1606.122,10.000,-89.990},
				{66447.895,1486.818,10.000,-89.990},
				{66590.612,1367.513,10.000,-89.990},
				{66721.398,1248.209,10.000,-89.990},
				{66840.253,1128.904,10.000,-89.990},
				{66947.179,1009.600,10.000,-89.990},
				{67042.173,890.295,10.000,-89.990},
				{67125.254,771.312,10.000,-89.990},
				{67196.862,660.849,10.000,-89.990},
				{67257.850,558.909,10.000,-89.990},
				{67309.070,465.490,10.000,-89.990},
				{67351.374,380.593,10.000,-89.990},
				{67385.614,304.218,10.000,-89.990},
				{67412.644,236.365,10.000,-89.990},
				{67433.313,177.033,10.000,-89.990},
				{67448.476,126.223,10.000,-89.990},
				{67458.984,83.935,10.000,-89.990},
				{67465.689,50.169,10.000,-89.990},
				{67469.444,24.924,10.000,-89.990},
				{67471.100,8.201,10.000,-89.990},
				{67471.510,0.000,10.000,-89.990},
				{67471.510,0.000,10.000,-89.990}		};

}