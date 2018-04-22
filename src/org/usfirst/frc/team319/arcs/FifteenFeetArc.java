package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class FifteenFeetArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (15.00,0.00,0.00)
	
    public FifteenFeetArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public FifteenFeetArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.553,11.056,10.000,0.000},
				{2.764,33.169,10.000,0.000},
				{7.739,66.337,10.000,0.000},
				{16.584,110.562,10.000,0.000},
				{30.405,165.843,10.000,0.000},
				{50.306,232.180,10.000,0.000},
				{77.393,309.574,10.000,0.000},
				{112.773,398.023,10.000,0.000},
				{157.551,497.529,10.000,0.000},
				{212.832,608.091,10.000,0.000},
				{279.722,729.709,10.000,0.000},
				{359.327,862.384,10.000,0.000},
				{452.751,1006.114,10.000,0.000},
				{561.102,1160.901,10.000,0.000},
				{684.932,1315.688,10.000,0.000},
				{824.240,1470.475,10.000,0.000},
				{979.027,1625.262,10.000,0.000},
				{1149.292,1780.048,10.000,0.000},
				{1335.036,1934.835,10.000,0.000},
				{1536.259,2089.622,10.000,0.000},
				{1752.961,2244.409,10.000,0.000},
				{1985.141,2399.196,10.000,0.000},
				{2232.800,2553.982,10.000,0.000},
				{2495.937,2708.769,10.000,0.000},
				{2774.554,2863.556,10.000,0.000},
				{3068.649,3018.343,10.000,0.000},
				{3378.222,3173.130,10.000,0.000},
				{3703.275,3327.917,10.000,0.000},
				{4043.806,3482.703,10.000,0.000},
				{4399.815,3637.490,10.000,0.000},
				{4771.304,3792.277,10.000,0.000},
				{5158.271,3947.064,10.000,0.000},
				{5560.716,4101.851,10.000,0.000},
				{5978.641,4256.637,10.000,0.000},
				{6412.044,4411.424,10.000,0.000},
				{6860.926,4566.211,10.000,0.000},
				{7325.286,4720.998,10.000,0.000},
				{7805.125,4875.785,10.000,0.000},
				{8300.443,5030.571,10.000,0.000},
				{8811.239,5185.358,10.000,0.000},
				{9337.515,5340.145,10.000,0.000},
				{9879.268,5494.932,10.000,0.000},
				{10436.501,5649.719,10.000,0.000},
				{11009.212,5804.506,10.000,0.000},
				{11597.402,5959.292,10.000,0.000},
				{12201.071,6114.079,10.000,0.000},
				{12820.218,6268.866,10.000,0.000},
				{13454.844,6423.653,10.000,0.000},
				{14104.948,6578.440,10.000,0.000},
				{14770.532,6733.226,10.000,0.000},
				{15451.594,6888.013,10.000,0.000},
				{16148.134,7042.800,10.000,0.000},
				{16860.154,7197.587,10.000,0.000},
				{17587.652,7352.374,10.000,0.000},
				{18330.629,7507.161,10.000,0.000},
				{19089.084,7661.947,10.000,0.000},
				{19863.018,7816.734,10.000,0.000},
				{20652.431,7971.521,10.000,0.000},
				{21457.322,8126.308,10.000,0.000},
				{22277.692,8281.095,10.000,0.000},
				{23113.541,8435.881,10.000,0.000},
				{23964.869,8590.668,10.000,0.000},
				{24831.675,8745.455,10.000,0.000},
				{25713.960,8900.242,10.000,0.000},
				{26611.723,9055.029,10.000,0.000},
				{27524.965,9209.815,10.000,0.000},
				{28453.686,9364.602,10.000,0.000},
				{29397.886,9519.389,10.000,0.000},
				{30357.564,9674.176,10.000,0.000},
				{31332.721,9828.963,10.000,0.000},
				{32323.357,9983.750,10.000,0.000},
				{33329.471,10138.536,10.000,0.000},
				{34351.064,10293.323,10.000,0.000},
				{35388.136,10448.110,10.000,0.000},
				{36440.686,10602.897,10.000,0.000},
				{37508.162,10746.627,10.000,0.000},
				{38589.459,10879.302,10.000,0.000},
				{39683.470,11000.920,10.000,0.000},
				{40789.090,11111.482,10.000,0.000},
				{41905.213,11210.988,10.000,0.000},
				{43030.734,11299.437,10.000,0.000},
				{44164.548,11376.831,10.000,0.000},
				{45305.548,11443.168,10.000,0.000},
				{46452.629,11498.449,10.000,0.000},
				{47604.685,11542.674,10.000,0.000},
				{48760.611,11575.843,10.000,0.000},
				{49919.301,11597.955,10.000,0.000},
				{51079.649,11609.011,10.000,0.000},
				{52240.550,11609.011,10.000,0.000},
				{53401.451,11609.011,10.000,0.000},
				{54562.352,11609.011,10.000,0.000},
				{55723.253,11609.011,10.000,0.000},
				{56884.154,11609.011,10.000,0.000},
				{58045.056,11609.011,10.000,0.000},
				{59205.957,11609.011,10.000,0.000},
				{60366.858,11609.011,10.000,0.000},
				{61527.759,11609.011,10.000,0.000},
				{62688.660,11609.011,10.000,0.000},
				{63849.561,11609.011,10.000,0.000},
				{65010.462,11609.011,10.000,0.000},
				{66171.363,11609.011,10.000,0.000},
				{67332.264,11609.011,10.000,0.000},
				{68493.166,11609.011,10.000,0.000},
				{69654.067,11609.011,10.000,0.000},
				{70814.968,11609.011,10.000,0.000},
				{71975.869,11609.011,10.000,0.000},
				{73136.770,11609.011,10.000,0.000},
				{74297.671,11609.011,10.000,0.000},
				{75458.572,11609.011,10.000,0.000},
				{76619.473,11609.011,10.000,0.000},
				{77780.374,11609.011,10.000,0.000},
				{78941.276,11609.011,10.000,0.000},
				{80102.177,11609.011,10.000,0.000},
				{81263.078,11609.011,10.000,0.000},
				{82423.979,11609.011,10.000,0.000},
				{83584.880,11609.011,10.000,0.000},
				{84745.781,11609.011,10.000,0.000},
				{85906.682,11609.011,10.000,0.000},
				{87067.583,11609.011,10.000,0.000},
				{88228.484,11609.011,10.000,0.000},
				{89389.386,11609.011,10.000,0.000},
				{90550.287,11609.011,10.000,0.000},
				{91711.188,11609.011,10.000,0.000},
				{92872.089,11609.011,10.000,0.000},
				{94032.990,11609.011,10.000,0.000},
				{95193.891,11609.011,10.000,0.000},
				{96354.792,11609.011,10.000,0.000},
				{97515.693,11609.011,10.000,0.000},
				{98676.594,11609.011,10.000,0.000},
				{99837.495,11609.011,10.000,0.000},
				{100998.397,11609.011,10.000,0.000},
				{102159.298,11609.011,10.000,0.000},
				{103320.199,11609.011,10.000,0.000},
				{104481.100,11609.011,10.000,0.000},
				{105642.001,11609.011,10.000,0.000},
				{106802.902,11609.011,10.000,0.000},
				{107963.803,11609.011,10.000,0.000},
				{109124.704,11609.011,10.000,0.000},
				{110285.605,11609.011,10.000,0.000},
				{111446.507,11609.011,10.000,0.000},
				{112607.408,11609.011,10.000,0.000},
				{113768.309,11609.011,10.000,0.000},
				{114929.210,11609.011,10.000,0.000},
				{116090.111,11609.011,10.000,0.000},
				{117251.012,11609.011,10.000,0.000},
				{118411.913,11609.011,10.000,0.000},
				{119572.814,11609.011,10.000,0.000},
				{120733.715,11609.011,10.000,0.000},
				{121894.617,11609.011,10.000,0.000},
				{123055.518,11609.011,10.000,0.000},
				{124216.419,11609.011,10.000,0.000},
				{125377.320,11609.011,10.000,0.000},
				{126538.221,11609.011,10.000,0.000},
				{127699.122,11609.011,10.000,0.000},
				{128860.023,11609.011,10.000,0.000},
				{130020.924,11609.011,10.000,0.000},
				{131181.825,11609.011,10.000,0.000},
				{132342.727,11609.011,10.000,0.000},
				{133503.628,11609.011,10.000,0.000},
				{134664.529,11609.011,10.000,0.000},
				{135825.430,11609.011,10.000,0.000},
				{136986.331,11609.011,10.000,0.000},
				{138147.232,11609.011,10.000,0.000},
				{139308.133,11609.011,10.000,0.000},
				{140469.034,11609.011,10.000,0.000},
				{141629.935,11609.011,10.000,0.000},
				{142790.837,11609.011,10.000,0.000},
				{143951.738,11609.011,10.000,0.000},
				{145112.639,11609.011,10.000,0.000},
				{146273.540,11609.011,10.000,0.000},
				{147434.441,11609.011,10.000,0.000},
				{148595.342,11609.011,10.000,0.000},
				{149756.243,11609.011,10.000,0.000},
				{150917.144,11609.011,10.000,0.000},
				{152078.045,11609.011,10.000,0.000},
				{153238.947,11609.011,10.000,0.000},
				{154399.848,11609.011,10.000,0.000},
				{155560.749,11609.011,10.000,0.000},
				{156721.650,11609.011,10.000,0.000},
				{157882.551,11609.011,10.000,0.000},
				{159043.452,11609.011,10.000,0.000},
				{160204.353,11609.011,10.000,0.000},
				{161365.254,11609.011,10.000,0.000},
				{162526.155,11609.011,10.000,0.000},
				{163687.057,11609.011,10.000,0.000},
				{164847.958,11609.011,10.000,0.000},
				{166008.859,11609.011,10.000,0.000},
				{167169.760,11609.011,10.000,0.000},
				{168330.661,11609.011,10.000,0.000},
				{169491.562,11609.011,10.000,0.000},
				{170652.463,11609.011,10.000,0.000},
				{171813.364,11609.011,10.000,0.000},
				{172974.265,11609.011,10.000,0.000},
				{174135.167,11609.011,10.000,0.000},
				{175296.068,11609.011,10.000,0.000},
				{176456.969,11609.011,10.000,0.000},
				{177617.870,11609.011,10.000,0.000},
				{178778.771,11609.011,10.000,0.000},
				{179939.672,11609.011,10.000,0.000},
				{181100.573,11609.011,10.000,0.000},
				{182261.474,11609.011,10.000,0.000},
				{183422.375,11609.011,10.000,0.000},
				{184583.277,11609.011,10.000,0.000},
				{185744.178,11609.011,10.000,0.000},
				{186905.079,11609.011,10.000,0.000},
				{188065.980,11609.011,10.000,0.000},
				{189226.881,11609.011,10.000,0.000},
				{190387.782,11609.011,10.000,0.000},
				{191548.683,11609.011,10.000,0.000},
				{192709.584,11609.011,10.000,0.000},
				{193870.485,11609.011,10.000,0.000},
				{195031.387,11609.011,10.000,0.000},
				{196192.288,11609.011,10.000,0.000},
				{197353.189,11609.011,10.000,0.000},
				{198514.090,11609.011,10.000,0.000},
				{199674.991,11609.011,10.000,0.000},
				{200835.892,11609.011,10.000,0.000},
				{201996.793,11609.011,10.000,0.000},
				{203157.694,11609.011,10.000,0.000},
				{204318.595,11609.011,10.000,0.000},
				{205479.497,11609.011,10.000,0.000},
				{206640.398,11609.011,10.000,0.000},
				{207801.299,11609.011,10.000,0.000},
				{208962.200,11609.011,10.000,0.000},
				{210123.101,11609.011,10.000,0.000},
				{211284.002,11609.011,10.000,0.000},
				{212444.903,11609.011,10.000,0.000},
				{213605.804,11609.011,10.000,0.000},
				{214766.705,11609.011,10.000,0.000},
				{215927.607,11609.011,10.000,0.000},
				{217088.508,11609.011,10.000,0.000},
				{218249.409,11609.011,10.000,0.000},
				{219410.310,11609.011,10.000,0.000},
				{220571.211,11609.011,10.000,0.000},
				{221732.112,11609.011,10.000,0.000},
				{222893.013,11609.011,10.000,0.000},
				{224053.914,11609.011,10.000,0.000},
				{225214.815,11609.011,10.000,0.000},
				{226375.717,11609.011,10.000,0.000},
				{227536.618,11609.011,10.000,0.000},
				{228697.519,11609.011,10.000,0.000},
				{229858.420,11609.011,10.000,0.000},
				{231019.321,11609.011,10.000,0.000},
				{232180.222,11609.011,10.000,0.000},
				{233341.123,11609.011,10.000,0.000},
				{234502.024,11609.011,10.000,0.000},
				{235662.925,11609.011,10.000,0.000},
				{236823.827,11609.011,10.000,0.000},
				{237984.728,11609.011,10.000,0.000},
				{239145.629,11609.011,10.000,0.000},
				{240305.977,11597.955,10.000,0.000},
				{241464.667,11575.843,10.000,0.000},
				{242620.593,11542.674,10.000,0.000},
				{243772.649,11498.449,10.000,0.000},
				{244919.730,11443.168,10.000,0.000},
				{246060.730,11376.831,10.000,0.000},
				{247194.543,11299.437,10.000,0.000},
				{248320.064,11210.988,10.000,0.000},
				{249436.188,11111.482,10.000,0.000},
				{250541.808,11000.920,10.000,0.000},
				{251635.819,10879.302,10.000,0.000},
				{252717.116,10746.627,10.000,0.000},
				{253784.592,10602.897,10.000,0.000},
				{254837.142,10448.110,10.000,0.000},
				{255874.214,10293.323,10.000,0.000},
				{256895.807,10138.536,10.000,0.000},
				{257901.921,9983.750,10.000,0.000},
				{258892.557,9828.963,10.000,0.000},
				{259867.714,9674.176,10.000,0.000},
				{260827.392,9519.389,10.000,0.000},
				{261771.591,9364.602,10.000,0.000},
				{262700.312,9209.815,10.000,0.000},
				{263613.554,9055.029,10.000,0.000},
				{264511.318,8900.242,10.000,0.000},
				{265393.603,8745.455,10.000,0.000},
				{266260.409,8590.668,10.000,0.000},
				{267111.736,8435.881,10.000,0.000},
				{267947.585,8281.095,10.000,0.000},
				{268767.955,8126.308,10.000,0.000},
				{269572.847,7971.521,10.000,0.000},
				{270362.260,7816.734,10.000,0.000},
				{271136.194,7661.947,10.000,0.000},
				{271894.649,7507.161,10.000,0.000},
				{272637.626,7352.374,10.000,0.000},
				{273365.124,7197.587,10.000,0.000},
				{274077.143,7042.800,10.000,0.000},
				{274773.684,6888.013,10.000,0.000},
				{275454.746,6733.226,10.000,0.000},
				{276120.329,6578.440,10.000,0.000},
				{276770.434,6423.653,10.000,0.000},
				{277405.060,6268.866,10.000,0.000},
				{278024.207,6114.079,10.000,0.000},
				{278627.876,5959.292,10.000,0.000},
				{279216.065,5804.506,10.000,0.000},
				{279788.777,5649.719,10.000,0.000},
				{280346.009,5494.932,10.000,0.000},
				{280887.763,5340.145,10.000,0.000},
				{281414.038,5185.358,10.000,0.000},
				{281924.835,5030.571,10.000,0.000},
				{282420.152,4875.785,10.000,0.000},
				{282899.992,4720.998,10.000,0.000},
				{283364.352,4566.211,10.000,0.000},
				{283813.234,4411.424,10.000,0.000},
				{284246.637,4256.637,10.000,0.000},
				{284664.561,4101.851,10.000,0.000},
				{285067.007,3947.064,10.000,0.000},
				{285453.974,3792.277,10.000,0.000},
				{285825.462,3637.490,10.000,0.000},
				{286181.472,3482.703,10.000,0.000},
				{286522.003,3327.917,10.000,0.000},
				{286847.055,3173.130,10.000,0.000},
				{287156.629,3018.343,10.000,0.000},
				{287450.724,2863.556,10.000,0.000},
				{287729.340,2708.769,10.000,0.000},
				{287992.478,2553.982,10.000,0.000},
				{288240.137,2399.196,10.000,0.000},
				{288472.317,2244.409,10.000,0.000},
				{288689.018,2089.622,10.000,0.000},
				{288890.241,1934.835,10.000,0.000},
				{289075.986,1780.048,10.000,0.000},
				{289246.251,1625.262,10.000,0.000},
				{289401.038,1470.475,10.000,0.000},
				{289540.346,1315.688,10.000,0.000},
				{289664.175,1160.901,10.000,0.000},
				{289772.526,1006.114,10.000,0.000},
				{289865.951,862.384,10.000,0.000},
				{289945.556,729.709,10.000,0.000},
				{290012.446,608.091,10.000,0.000},
				{290067.727,497.529,10.000,0.000},
				{290112.504,398.023,10.000,0.000},
				{290147.884,309.574,10.000,0.000},
				{290174.972,232.180,10.000,0.000},
				{290194.873,165.843,10.000,0.000},
				{290208.693,110.562,10.000,0.000},
				{290217.538,66.337,10.000,0.000},
				{290222.514,33.169,10.000,0.000},
				{290224.725,11.056,10.000,0.000},
				{290225.278,0.000,10.000,0.000},
				{290225.278,0.000,10.000,0.000}		};

}