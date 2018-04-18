package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightSwitchToLeftScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (8.70,13.13,89.99)
	// (8.70,18.13,89.99)
	// (8.70,22.13,89.99)
	// (12.70,26.13,0.00)
	// (16.70,26.13,0.00)
	
    public RightSwitchToLeftScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightSwitchToLeftScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.427,8.545,10.000,89.990},
				{2.136,25.635,10.000,89.990},
				{5.982,51.270,10.000,89.990},
				{12.818,85.450,10.000,89.990},
				{23.499,128.175,10.000,89.990},
				{38.880,179.446,10.000,89.990},
				{59.815,239.261,10.000,89.990},
				{87.159,307.621,10.000,89.990},
				{121.767,384.526,10.000,89.990},
				{164.492,469.976,10.000,89.990},
				{216.189,563.972,10.000,89.990},
				{277.713,666.512,10.000,89.990},
				{349.919,777.597,10.000,89.990},
				{433.660,897.228,10.000,89.990},
				{529.364,1016.858,10.000,89.990},
				{637.032,1136.488,10.000,89.990},
				{756.662,1256.119,10.000,89.990},
				{888.255,1375.749,10.000,89.990},
				{1031.812,1495.379,10.000,89.990},
				{1187.331,1615.010,10.000,89.990},
				{1354.814,1734.640,10.000,89.990},
				{1534.259,1854.270,10.000,89.990},
				{1725.668,1973.901,10.000,89.990},
				{1929.039,2093.531,10.000,89.990},
				{2144.374,2213.161,10.000,89.990},
				{2371.671,2332.792,10.000,89.990},
				{2610.932,2452.422,10.000,89.990},
				{2862.156,2572.052,10.000,89.990},
				{3125.343,2691.683,10.000,89.990},
				{3400.492,2811.313,10.000,89.991},
				{3687.605,2930.943,10.000,89.991},
				{3986.681,3050.574,10.000,89.991},
				{4297.720,3170.204,10.000,89.991},
				{4620.722,3289.834,10.000,89.991},
				{4955.687,3409.465,10.000,89.991},
				{5302.615,3529.095,10.000,89.991},
				{5661.506,3648.725,10.000,89.991},
				{6032.360,3768.356,10.000,89.992},
				{6415.177,3887.986,10.000,89.992},
				{6809.957,4007.616,10.000,89.992},
				{7216.700,4127.247,10.000,89.992},
				{7635.406,4246.877,10.000,89.993},
				{8066.075,4366.507,10.000,89.993},
				{8508.708,4486.138,10.000,89.993},
				{8963.303,4605.768,10.000,89.993},
				{9429.861,4725.398,10.000,89.994},
				{9908.383,4845.029,10.000,89.994},
				{10398.867,4964.659,10.000,89.994},
				{10901.314,5084.289,10.000,89.995},
				{11415.725,5203.920,10.000,89.995},
				{11942.098,5323.550,10.000,89.995},
				{12480.435,5443.180,10.000,89.996},
				{13030.734,5562.811,10.000,89.996},
				{13592.997,5682.441,10.000,89.997},
				{14167.223,5802.071,10.000,89.997},
				{14753.411,5921.702,10.000,89.997},
				{15351.563,6041.332,10.000,89.998},
				{15961.678,6160.962,10.000,89.998},
				{16583.755,6280.593,10.000,89.999},
				{17217.796,6400.223,10.000,89.999},
				{17863.800,6519.853,10.000,90.000},
				{18521.767,6639.484,10.000,90.000},
				{19191.697,6759.114,10.000,90.001},
				{19873.590,6878.744,10.000,90.001},
				{20567.446,6998.375,10.000,90.002},
				{21273.265,7118.005,10.000,90.002},
				{21991.047,7237.635,10.000,90.003},
				{22720.792,7357.266,10.000,90.003},
				{23462.500,7476.896,10.000,90.004},
				{24216.171,7596.526,10.000,90.004},
				{24981.805,7716.157,10.000,90.005},
				{25759.402,7835.787,10.000,90.005},
				{26548.962,7955.417,10.000,90.006},
				{27350.486,8075.048,10.000,90.006},
				{28163.972,8194.678,10.000,90.007},
				{28989.421,8314.308,10.000,90.007},
				{29826.834,8433.939,10.000,90.007},
				{30676.209,8553.569,10.000,90.008},
				{31537.548,8673.199,10.000,90.008},
				{32410.849,8792.830,10.000,90.008},
				{33296.113,8912.460,10.000,90.008},
				{34193.341,9032.090,10.000,90.008},
				{35102.532,9151.721,10.000,90.009},
				{36023.685,9271.351,10.000,90.009},
				{36956.802,9390.981,10.000,90.009},
				{37901.881,9510.612,10.000,90.009},
				{38858.924,9630.242,10.000,90.009},
				{39827.930,9749.872,10.000,90.009},
				{40808.899,9869.503,10.000,90.008},
				{41801.830,9989.133,10.000,90.008},
				{42806.725,10108.763,10.000,90.008},
				{43823.583,10228.394,10.000,90.008},
				{44852.404,10348.024,10.000,90.007},
				{45893.188,10467.654,10.000,90.007},
				{46945.508,10578.740,10.000,90.006},
				{48008.509,10681.280,10.000,90.006},
				{49081.336,10775.275,10.000,90.005},
				{50163.136,10860.726,10.000,90.005},
				{51253.054,10937.631,10.000,90.004},
				{52350.235,11005.991,10.000,90.003},
				{53453.825,11065.806,10.000,90.003},
				{54562.969,11117.076,10.000,90.002},
				{55676.813,11159.801,10.000,90.001},
				{56794.502,11193.982,10.000,90.000},
				{57915.182,11219.617,10.000,89.999},
				{59037.998,11236.707,10.000,89.998},
				{60162.096,11245.252,10.000,89.998},
				{61286.622,11245.252,10.000,89.997},
				{62411.147,11245.252,10.000,89.996},
				{63535.672,11245.252,10.000,89.995},
				{64660.197,11245.252,10.000,89.994},
				{65784.722,11245.252,10.000,89.993},
				{66909.247,11245.252,10.000,89.993},
				{68033.773,11245.252,10.000,89.992},
				{69158.298,11245.252,10.000,89.992},
				{70282.823,11245.252,10.000,89.991},
				{71407.348,11245.252,10.000,89.991},
				{72531.873,11245.252,10.000,89.990},
				{73656.398,11245.252,10.000,89.990},
				{74780.924,11245.252,10.000,89.990},
				{75905.449,11245.252,10.000,89.990},
				{77029.974,11245.252,10.000,89.990},
				{78154.499,11245.252,10.000,89.991},
				{79279.024,11245.252,10.000,89.991},
				{80403.549,11245.252,10.000,89.992},
				{81528.075,11245.252,10.000,89.993},
				{82652.600,11245.252,10.000,89.994},
				{83777.125,11245.252,10.000,89.995},
				{84901.650,11245.252,10.000,89.996},
				{86026.175,11245.252,10.000,89.997},
				{87150.700,11245.252,10.000,89.998},
				{88275.226,11245.252,10.000,89.999},
				{89399.751,11245.252,10.000,90.000},
				{90524.276,11245.252,10.000,90.001},
				{91648.801,11245.252,10.000,90.002},
				{92773.326,11245.252,10.000,90.003},
				{93897.851,11245.252,10.000,90.004},
				{95022.377,11245.252,10.000,90.005},
				{96146.902,11245.252,10.000,90.006},
				{97271.427,11245.252,10.000,90.006},
				{98395.952,11245.252,10.000,90.007},
				{99520.477,11245.252,10.000,90.008},
				{100645.002,11245.252,10.000,90.008},
				{101769.528,11245.252,10.000,90.008},
				{102894.053,11245.252,10.000,90.009},
				{104018.578,11245.252,10.000,90.009},
				{105143.103,11245.252,10.000,90.009},
				{106267.628,11245.252,10.000,90.009},
				{107392.153,11245.252,10.000,90.009},
				{108516.679,11245.252,10.000,90.008},
				{109641.204,11245.252,10.000,90.008},
				{110765.729,11245.252,10.000,90.007},
				{111890.254,11245.252,10.000,90.007},
				{113014.779,11245.252,10.000,90.006},
				{114139.304,11245.252,10.000,90.005},
				{115263.830,11245.252,10.000,90.005},
				{116388.355,11245.252,10.000,90.004},
				{117512.880,11245.252,10.000,90.003},
				{118637.405,11245.252,10.000,90.002},
				{119761.930,11245.252,10.000,90.001},
				{120886.455,11245.252,10.000,90.000},
				{122010.981,11245.252,10.000,89.999},
				{123135.506,11245.252,10.000,89.998},
				{124260.031,11245.252,10.000,89.996},
				{125384.556,11245.252,10.000,89.995},
				{126509.081,11245.252,10.000,89.994},
				{127633.606,11245.252,10.000,89.993},
				{128758.131,11245.252,10.000,89.993},
				{129882.657,11245.252,10.000,89.992},
				{131007.182,11245.252,10.000,89.991},
				{132131.707,11245.252,10.000,89.991},
				{133256.232,11245.252,10.000,89.990},
				{134380.757,11245.252,10.000,89.990},
				{135505.282,11245.252,10.000,89.986},
				{136629.808,11245.252,10.000,89.956},
				{137754.333,11245.252,10.000,89.897},
				{138878.858,11245.252,10.000,89.808},
				{140003.383,11245.252,10.000,89.690},
				{141127.908,11245.252,10.000,89.543},
				{142252.433,11245.252,10.000,89.367},
				{143376.959,11245.252,10.000,89.161},
				{144501.484,11245.252,10.000,88.925},
				{145626.009,11245.252,10.000,88.659},
				{146750.534,11245.252,10.000,88.361},
				{147875.059,11245.252,10.000,88.032},
				{148999.584,11245.252,10.000,87.670},
				{150124.110,11245.252,10.000,87.274},
				{151248.635,11245.252,10.000,86.843},
				{152373.160,11245.252,10.000,86.375},
				{153497.685,11245.252,10.000,85.870},
				{154622.210,11245.252,10.000,85.325},
				{155746.735,11245.252,10.000,84.739},
				{156871.261,11245.252,10.000,84.110},
				{157995.786,11245.252,10.000,83.435},
				{159120.311,11245.252,10.000,82.713},
				{160244.836,11245.252,10.000,81.940},
				{161369.361,11245.252,10.000,81.115},
				{162493.886,11245.252,10.000,80.235},
				{163618.412,11245.252,10.000,79.296},
				{164742.937,11245.252,10.000,78.295},
				{165867.462,11245.252,10.000,77.230},
				{166991.987,11245.252,10.000,76.097},
				{168116.512,11245.252,10.000,74.894},
				{169241.037,11245.252,10.000,73.616},
				{170365.563,11245.252,10.000,72.262},
				{171490.088,11245.252,10.000,70.828},
				{172614.613,11245.252,10.000,69.312},
				{173739.138,11245.252,10.000,67.713},
				{174863.663,11245.252,10.000,66.030},
				{175988.188,11245.252,10.000,64.263},
				{177112.714,11245.252,10.000,62.414},
				{178237.239,11245.252,10.000,60.485},
				{179361.764,11245.252,10.000,58.480},
				{180486.289,11245.252,10.000,56.406},
				{181610.814,11245.252,10.000,54.270},
				{182735.339,11245.252,10.000,52.081},
				{183859.865,11245.252,10.000,49.851},
				{184984.390,11245.252,10.000,47.592},
				{186108.915,11245.252,10.000,45.317},
				{187233.440,11245.252,10.000,43.040},
				{188357.965,11245.252,10.000,40.774},
				{189482.490,11245.252,10.000,38.535},
				{190607.016,11245.252,10.000,36.333},
				{191731.541,11245.252,10.000,34.181},
				{192856.066,11245.252,10.000,32.088},
				{193980.591,11245.252,10.000,30.063},
				{195105.116,11245.252,10.000,28.112},
				{196229.641,11245.252,10.000,26.240},
				{197354.167,11245.252,10.000,24.449},
				{198478.692,11245.252,10.000,22.743},
				{199603.217,11245.252,10.000,21.120},
				{200727.742,11245.252,10.000,19.581},
				{201852.267,11245.252,10.000,18.124},
				{202976.792,11245.252,10.000,16.747},
				{204101.318,11245.252,10.000,15.448},
				{205225.843,11245.252,10.000,14.224},
				{206350.368,11245.252,10.000,13.071},
				{207474.893,11245.252,10.000,11.987},
				{208599.418,11245.252,10.000,10.969},
				{209723.943,11245.252,10.000,10.013},
				{210848.469,11245.252,10.000,9.116},
				{211972.994,11245.252,10.000,8.275},
				{213097.519,11245.252,10.000,7.488},
				{214222.044,11245.252,10.000,6.752},
				{215346.569,11245.252,10.000,6.064},
				{216471.094,11245.252,10.000,5.422},
				{217595.620,11245.252,10.000,4.824},
				{218720.145,11245.252,10.000,4.268},
				{219844.670,11245.252,10.000,3.752},
				{220969.195,11245.252,10.000,3.274},
				{222093.720,11245.252,10.000,2.832},
				{223218.245,11245.252,10.000,2.427},
				{224342.771,11245.252,10.000,2.055},
				{225467.296,11245.252,10.000,1.717},
				{226591.821,11245.252,10.000,1.410},
				{227716.346,11245.252,10.000,1.135},
				{228840.871,11245.252,10.000,0.891},
				{229965.396,11245.252,10.000,0.677},
				{231089.922,11245.252,10.000,0.492},
				{232214.447,11245.252,10.000,0.337},
				{233338.972,11245.252,10.000,0.211},
				{234463.497,11245.252,10.000,0.115},
				{235588.022,11245.252,10.000,0.047},
				{236712.547,11245.252,10.000,0.009},
				{237836.904,11241.878,10.000,0.000},
				{238960.496,11229.960,10.000,0.000},
				{240082.469,11209.497,10.000,0.000},
				{241201.968,11180.488,10.000,0.000},
				{242318.139,11142.935,10.000,0.000},
				{243430.128,11096.837,10.000,0.000},
				{244537.079,11042.193,10.000,0.000},
				{245638.139,10979.005,10.000,0.000},
				{246732.453,10907.271,10.000,0.000},
				{247819.166,10826.993,10.000,0.000},
				{248897.424,10738.169,10.000,0.000},
				{249966.373,10640.801,10.000,0.000},
				{251025.157,10534.887,10.000,0.000},
				{252072.923,10420.429,10.000,0.000},
				{253108.984,10300.798,10.000,0.000},
				{254133.082,10181.168,10.000,0.000},
				{255145.218,10061.538,10.000,0.000},
				{256145.390,9941.907,10.000,0.000},
				{257133.599,9822.277,10.000,0.000},
				{258109.845,9702.646,10.000,0.000},
				{259074.128,9583.016,10.000,0.000},
				{260026.449,9463.386,10.000,0.000},
				{260966.806,9343.755,10.000,0.000},
				{261895.200,9224.125,10.000,0.000},
				{262811.631,9104.495,10.000,0.000},
				{263716.099,8984.864,10.000,0.000},
				{264608.604,8865.234,10.000,0.000},
				{265489.145,8745.604,10.000,0.000},
				{266357.724,8625.973,10.000,0.000},
				{267214.340,8506.343,10.000,0.000},
				{268058.993,8386.713,10.000,0.000},
				{268891.683,8267.082,10.000,0.000},
				{269712.409,8147.452,10.000,0.000},
				{270521.173,8027.822,10.000,0.000},
				{271317.974,7908.191,10.000,0.000},
				{272102.811,7788.561,10.000,0.000},
				{272875.686,7668.931,10.000,0.000},
				{273636.598,7549.300,10.000,0.000},
				{274385.546,7429.670,10.000,0.000},
				{275122.532,7310.040,10.000,0.000},
				{275847.554,7190.409,10.000,0.000},
				{276560.614,7070.779,10.000,0.000},
				{277261.710,6951.149,10.000,0.000},
				{277950.843,6831.518,10.000,0.000},
				{278628.014,6711.888,10.000,0.000},
				{279293.221,6592.258,10.000,0.000},
				{279946.465,6472.627,10.000,0.000},
				{280587.746,6352.997,10.000,0.000},
				{281217.065,6233.367,10.000,0.000},
				{281834.420,6113.736,10.000,0.000},
				{282439.812,5994.106,10.000,0.000},
				{283033.241,5874.476,10.000,0.000},
				{283614.707,5754.845,10.000,0.000},
				{284184.210,5635.215,10.000,0.000},
				{284741.750,5515.585,10.000,0.000},
				{285287.327,5395.954,10.000,0.000},
				{285820.941,5276.324,10.000,0.000},
				{286342.592,5156.694,10.000,0.000},
				{286852.280,5037.063,10.000,0.000},
				{287350.004,4917.433,10.000,0.000},
				{287835.766,4797.803,10.000,0.000},
				{288309.565,4678.172,10.000,0.000},
				{288771.401,4558.542,10.000,0.000},
				{289221.273,4438.912,10.000,0.000},
				{289659.183,4319.281,10.000,0.000},
				{290085.130,4199.651,10.000,0.000},
				{290499.113,4080.021,10.000,0.000},
				{290901.134,3960.390,10.000,0.000},
				{291291.191,3840.760,10.000,0.000},
				{291669.286,3721.130,10.000,0.000},
				{292035.417,3601.499,10.000,0.000},
				{292389.586,3481.869,10.000,0.000},
				{292731.791,3362.239,10.000,0.000},
				{293062.033,3242.608,10.000,0.000},
				{293380.313,3122.978,10.000,0.000},
				{293686.629,3003.348,10.000,0.000},
				{293980.982,2883.717,10.000,0.000},
				{294263.372,2764.087,10.000,0.000},
				{294533.800,2644.457,10.000,0.000},
				{294792.264,2524.826,10.000,0.000},
				{295038.765,2405.196,10.000,0.000},
				{295273.303,2285.566,10.000,0.000},
				{295495.878,2165.935,10.000,0.000},
				{295706.490,2046.305,10.000,0.000},
				{295905.139,1926.675,10.000,0.000},
				{296091.825,1807.044,10.000,0.000},
				{296266.548,1687.414,10.000,0.000},
				{296429.308,1567.784,10.000,0.000},
				{296580.105,1448.153,10.000,0.000},
				{296718.938,1328.523,10.000,0.000},
				{296845.809,1208.893,10.000,0.000},
				{296960.717,1089.262,10.000,0.000},
				{297063.662,969.632,10.000,0.000},
				{297154.643,850.002,10.000,0.000},
				{297233.831,733.745,10.000,0.000},
				{297301.819,626.032,10.000,0.000},
				{297359.464,526.865,10.000,0.000},
				{297407.620,436.244,10.000,0.000},
				{297447.140,354.167,10.000,0.000},
				{297478.880,280.635,10.000,0.000},
				{297503.694,215.648,10.000,0.000},
				{297522.437,159.206,10.000,0.000},
				{297535.963,111.309,10.000,0.000},
				{297545.126,71.957,10.000,0.000},
				{297550.781,41.150,10.000,0.000},
				{297553.783,18.889,10.000,0.000},
				{297554.986,5.172,10.000,0.000},
				{297555.245,0.000,10.000,0.000},
				{297555.245,0.000,10.000,0.000}		};

}