package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftScalePt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.43,12.08,30.00)
	// (16.43,16.08,-15.00)
	
    public CenterToLeftScalePt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftScalePt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.554,11.071,10.000,30.000},
				{2.768,33.213,10.000,30.000},
				{7.750,66.427,10.000,30.000},
				{16.607,110.711,10.000,30.000},
				{30.446,166.067,10.000,30.000},
				{50.374,232.493,10.000,30.000},
				{77.498,309.991,10.000,30.000},
				{112.925,398.560,10.000,30.000},
				{157.763,498.200,10.000,30.000},
				{213.119,608.911,10.000,30.000},
				{280.099,730.693,10.000,30.000},
				{359.811,863.546,10.000,30.000},
				{453.362,1007.470,10.000,30.000},
				{561.858,1162.466,10.000,30.001},
				{685.855,1317.461,10.000,30.001},
				{825.351,1472.457,10.000,30.001},
				{980.346,1627.452,10.000,30.002},
				{1150.841,1782.447,10.000,30.002},
				{1336.836,1937.443,10.000,30.003},
				{1538.330,2092.438,10.000,30.004},
				{1755.323,2247.434,10.000,30.005},
				{1987.816,2402.429,10.000,30.007},
				{2235.809,2557.424,10.000,30.008},
				{2499.301,2712.420,10.000,30.010},
				{2778.293,2867.415,10.000,30.013},
				{3072.784,3022.411,10.000,30.016},
				{3382.775,3177.406,10.000,30.019},
				{3708.265,3332.402,10.000,30.023},
				{4049.255,3487.397,10.000,30.027},
				{4405.745,3642.392,10.000,30.032},
				{4777.734,3797.388,10.000,30.037},
				{5165.222,3952.383,10.000,30.043},
				{5568.211,4107.379,10.000,30.050},
				{5986.698,4262.374,10.000,30.057},
				{6420.685,4417.370,10.000,30.066},
				{6870.172,4572.365,10.000,30.075},
				{7335.158,4727.360,10.000,30.085},
				{7815.644,4882.356,10.000,30.096},
				{8311.630,5037.351,10.000,30.107},
				{8823.114,5192.347,10.000,30.120},
				{9350.099,5347.342,10.000,30.134},
				{9892.583,5502.337,10.000,30.149},
				{10450.566,5657.333,10.000,30.166},
				{11024.049,5812.328,10.000,30.183},
				{11613.032,5967.324,10.000,30.201},
				{12217.514,6122.319,10.000,30.221},
				{12837.496,6277.315,10.000,30.242},
				{13472.977,6432.310,10.000,30.265},
				{14123.958,6587.305,10.000,30.289},
				{14790.438,6742.301,10.000,30.314},
				{15472.418,6897.296,10.000,30.341},
				{16169.897,7052.292,10.000,30.369},
				{16882.876,7207.287,10.000,30.398},
				{17611.355,7362.283,10.000,30.429},
				{18355.333,7517.278,10.000,30.461},
				{19114.810,7672.273,10.000,30.495},
				{19889.788,7827.269,10.000,30.531},
				{20680.264,7982.264,10.000,30.568},
				{21486.240,8137.260,10.000,30.606},
				{22307.716,8292.255,10.000,30.646},
				{23144.691,8447.251,10.000,30.688},
				{23997.166,8602.246,10.000,30.731},
				{24865.141,8757.241,10.000,30.775},
				{25748.615,8912.237,10.000,30.821},
				{26647.588,9067.232,10.000,30.868},
				{27562.061,9222.228,10.000,30.916},
				{28492.034,9377.223,10.000,30.966},
				{29437.506,9532.218,10.000,31.017},
				{30398.477,9687.214,10.000,31.069},
				{31374.948,9842.209,10.000,31.122},
				{32366.919,9997.205,10.000,31.177},
				{33374.389,10152.200,10.000,31.232},
				{34397.359,10307.196,10.000,31.289},
				{35435.828,10462.191,10.000,31.346},
				{36489.797,10617.186,10.000,31.404},
				{37558.712,10761.111,10.000,31.462},
				{38641.466,10893.964,10.000,31.521},
				{39736.951,11015.746,10.000,31.580},
				{40844.062,11126.457,10.000,31.640},
				{41961.689,11226.097,10.000,31.699},
				{43088.727,11314.666,10.000,31.758},
				{44224.069,11392.164,10.000,31.816},
				{45366.607,11458.590,10.000,31.874},
				{46515.233,11513.946,10.000,31.932},
				{47668.842,11558.230,10.000,31.988},
				{48826.326,11591.443,10.000,32.043},
				{49986.577,11613.586,10.000,32.097},
				{51148.489,11624.657,10.000,32.149},
				{52310.955,11624.657,10.000,32.200},
				{53473.421,11624.657,10.000,32.249},
				{54635.886,11624.657,10.000,32.296},
				{55798.352,11624.657,10.000,32.341},
				{56960.818,11624.657,10.000,32.385},
				{58123.283,11624.657,10.000,32.426},
				{59285.749,11624.657,10.000,32.465},
				{60448.215,11624.657,10.000,32.502},
				{61610.680,11624.657,10.000,32.536},
				{62773.146,11624.657,10.000,32.568},
				{63935.612,11624.657,10.000,32.597},
				{65098.077,11624.657,10.000,32.624},
				{66260.543,11624.657,10.000,32.649},
				{67423.009,11624.657,10.000,32.670},
				{68585.474,11624.657,10.000,32.689},
				{69747.940,11624.657,10.000,32.705},
				{70910.406,11624.657,10.000,32.718},
				{72072.871,11624.657,10.000,32.728},
				{73235.337,11624.657,10.000,32.734},
				{74397.803,11624.657,10.000,32.738},
				{75560.268,11624.657,10.000,32.738},
				{76722.734,11624.657,10.000,32.736},
				{77885.200,11624.657,10.000,32.729},
				{79047.665,11624.657,10.000,32.720},
				{80210.131,11624.657,10.000,32.707},
				{81372.597,11624.657,10.000,32.690},
				{82535.062,11624.657,10.000,32.670},
				{83697.528,11624.657,10.000,32.646},
				{84859.994,11624.657,10.000,32.618},
				{86022.459,11624.657,10.000,32.587},
				{87184.925,11624.657,10.000,32.551},
				{88347.391,11624.657,10.000,32.512},
				{89509.856,11624.657,10.000,32.469},
				{90672.322,11624.657,10.000,32.422},
				{91834.788,11624.657,10.000,32.370},
				{92997.253,11624.657,10.000,32.315},
				{94159.719,11624.657,10.000,32.256},
				{95322.185,11624.657,10.000,32.192},
				{96484.650,11624.657,10.000,32.124},
				{97647.116,11624.657,10.000,32.051},
				{98809.582,11624.657,10.000,31.975},
				{99972.047,11624.657,10.000,31.893},
				{101134.513,11624.657,10.000,31.808},
				{102296.979,11624.657,10.000,31.717},
				{103459.444,11624.657,10.000,31.623},
				{104621.910,11624.657,10.000,31.523},
				{105784.376,11624.657,10.000,31.419},
				{106946.841,11624.657,10.000,31.310},
				{108109.307,11624.657,10.000,31.196},
				{109271.773,11624.657,10.000,31.078},
				{110434.238,11624.657,10.000,30.955},
				{111596.704,11624.657,10.000,30.826},
				{112759.170,11624.657,10.000,30.693},
				{113921.635,11624.657,10.000,30.555},
				{115084.101,11624.657,10.000,30.412},
				{116246.567,11624.657,10.000,30.263},
				{117409.032,11624.657,10.000,30.110},
				{118571.498,11624.657,10.000,29.951},
				{119733.964,11624.657,10.000,29.787},
				{120896.429,11624.657,10.000,29.618},
				{122058.895,11624.657,10.000,29.444},
				{123221.361,11624.657,10.000,29.264},
				{124383.826,11624.657,10.000,29.079},
				{125546.292,11624.657,10.000,28.889},
				{126708.758,11624.657,10.000,28.693},
				{127871.223,11624.657,10.000,28.492},
				{129033.689,11624.657,10.000,28.285},
				{130196.155,11624.657,10.000,28.073},
				{131358.620,11624.657,10.000,27.855},
				{132521.086,11624.657,10.000,27.632},
				{133683.552,11624.657,10.000,27.403},
				{134846.017,11624.657,10.000,27.169},
				{136008.483,11624.657,10.000,26.929},
				{137170.949,11624.657,10.000,26.684},
				{138333.414,11624.657,10.000,26.433},
				{139495.880,11624.657,10.000,26.176},
				{140658.346,11624.657,10.000,25.914},
				{141820.811,11624.657,10.000,25.646},
				{142983.277,11624.657,10.000,25.372},
				{144145.743,11624.657,10.000,25.093},
				{145308.208,11624.657,10.000,24.809},
				{146470.674,11624.657,10.000,24.519},
				{147633.140,11624.657,10.000,24.223},
				{148795.605,11624.657,10.000,23.922},
				{149958.071,11624.657,10.000,23.615},
				{151120.537,11624.657,10.000,23.303},
				{152283.002,11624.657,10.000,22.986},
				{153445.468,11624.657,10.000,22.663},
				{154607.934,11624.657,10.000,22.334},
				{155770.399,11624.657,10.000,22.001},
				{156932.865,11624.657,10.000,21.662},
				{158095.331,11624.657,10.000,21.318},
				{159257.796,11624.657,10.000,20.970},
				{160420.262,11624.657,10.000,20.616},
				{161582.728,11624.657,10.000,20.257},
				{162745.193,11624.657,10.000,19.893},
				{163907.659,11624.657,10.000,19.525},
				{165070.125,11624.657,10.000,19.152},
				{166232.590,11624.657,10.000,18.774},
				{167395.056,11624.657,10.000,18.392},
				{168557.522,11624.657,10.000,18.006},
				{169719.987,11624.657,10.000,17.615},
				{170882.453,11624.657,10.000,17.221},
				{172044.919,11624.657,10.000,16.822},
				{173207.384,11624.657,10.000,16.420},
				{174369.850,11624.657,10.000,16.014},
				{175532.316,11624.657,10.000,15.604},
				{176694.781,11624.657,10.000,15.191},
				{177857.247,11624.657,10.000,14.775},
				{179019.713,11624.657,10.000,14.356},
				{180182.178,11624.657,10.000,13.934},
				{181344.644,11624.657,10.000,13.510},
				{182507.110,11624.657,10.000,13.083},
				{183669.575,11624.657,10.000,12.654},
				{184832.041,11624.657,10.000,12.222},
				{185994.507,11624.657,10.000,11.789},
				{187156.972,11624.657,10.000,11.354},
				{188319.438,11624.657,10.000,10.917},
				{189481.904,11624.657,10.000,10.479},
				{190644.369,11624.657,10.000,10.040},
				{191806.835,11624.657,10.000,9.600},
				{192969.301,11624.657,10.000,9.159},
				{194131.766,11624.657,10.000,8.718},
				{195294.232,11624.657,10.000,8.276},
				{196456.698,11624.657,10.000,7.835},
				{197619.163,11624.657,10.000,7.393},
				{198781.629,11624.657,10.000,6.952},
				{199944.095,11624.657,10.000,6.511},
				{201106.560,11624.657,10.000,6.071},
				{202269.026,11624.657,10.000,5.632},
				{203431.492,11624.657,10.000,5.194},
				{204593.957,11624.657,10.000,4.758},
				{205756.423,11624.657,10.000,4.323},
				{206918.889,11624.657,10.000,3.890},
				{208081.354,11624.657,10.000,3.459},
				{209243.820,11624.657,10.000,3.030},
				{210406.286,11624.657,10.000,2.603},
				{211568.751,11624.657,10.000,2.179},
				{212731.217,11624.657,10.000,1.757},
				{213893.683,11624.657,10.000,1.339},
				{215056.148,11624.657,10.000,0.923},
				{216218.614,11624.657,10.000,0.511},
				{217381.080,11624.657,10.000,0.102},
				{218543.545,11624.657,10.000,-0.304},
				{219706.011,11624.657,10.000,-0.705},
				{220868.477,11624.657,10.000,-1.104},
				{222030.942,11624.657,10.000,-1.498},
				{223193.408,11624.657,10.000,-1.888},
				{224355.874,11624.657,10.000,-2.273},
				{225518.339,11624.657,10.000,-2.655},
				{226680.805,11624.657,10.000,-3.032},
				{227843.271,11624.657,10.000,-3.404},
				{229005.736,11624.657,10.000,-3.772},
				{230168.202,11624.657,10.000,-4.135},
				{231330.668,11624.657,10.000,-4.492},
				{232493.133,11624.657,10.000,-4.845},
				{233655.599,11624.657,10.000,-5.193},
				{234818.065,11624.657,10.000,-5.536},
				{235980.530,11624.657,10.000,-5.874},
				{237142.996,11624.657,10.000,-6.206},
				{238305.462,11624.657,10.000,-6.533},
				{239467.927,11624.657,10.000,-6.854},
				{240630.393,11624.657,10.000,-7.170},
				{241792.859,11624.657,10.000,-7.480},
				{242955.324,11624.657,10.000,-7.785},
				{244117.790,11624.657,10.000,-8.083},
				{245279.910,11617.738,10.000,-8.376},
				{246440.784,11599.748,10.000,-8.663},
				{247599.306,11570.687,10.000,-8.944},
				{248754.368,11530.555,10.000,-9.218},
				{249904.863,11479.352,10.000,-9.485},
				{251049.685,11417.078,10.000,-9.745},
				{252187.725,11343.733,10.000,-9.997},
				{253317.878,11259.316,10.000,-10.242},
				{254439.035,11163.829,10.000,-10.480},
				{255550.090,11057.270,10.000,-10.710},
				{256649.936,10939.641,10.000,-10.932},
				{257737.465,10810.940,10.000,-11.146},
				{258811.570,10671.168,10.000,-11.352},
				{259871.145,10520.325,10.000,-11.550},
				{260915.427,10365.329,10.000,-11.740},
				{261944.211,10210.334,10.000,-11.922},
				{262957.494,10055.339,10.000,-12.097},
				{263955.278,9900.343,10.000,-12.264},
				{264937.563,9745.348,10.000,-12.425},
				{265904.348,9590.352,10.000,-12.578},
				{266855.633,9435.357,10.000,-12.724},
				{267791.419,9280.361,10.000,-12.864},
				{268711.706,9125.366,10.000,-12.998},
				{269616.492,8970.371,10.000,-13.125},
				{270505.780,8815.375,10.000,-13.246},
				{271379.568,8660.380,10.000,-13.362},
				{272237.856,8505.384,10.000,-13.471},
				{273080.644,8350.389,10.000,-13.576},
				{273907.934,8195.394,10.000,-13.675},
				{274719.723,8040.398,10.000,-13.768},
				{275516.013,7885.403,10.000,-13.857},
				{276296.804,7730.407,10.000,-13.941},
				{277062.095,7575.412,10.000,-14.021},
				{277811.886,7420.416,10.000,-14.096},
				{278546.178,7265.421,10.000,-14.166},
				{279264.970,7110.426,10.000,-14.233},
				{279968.263,6955.430,10.000,-14.295},
				{280656.056,6800.435,10.000,-14.354},
				{281328.350,6645.439,10.000,-14.409},
				{281985.144,6490.444,10.000,-14.461},
				{282626.439,6335.448,10.000,-14.509},
				{283252.234,6180.453,10.000,-14.554},
				{283862.529,6025.458,10.000,-14.595},
				{284457.325,5870.462,10.000,-14.634},
				{285036.622,5715.467,10.000,-14.670},
				{285600.419,5560.471,10.000,-14.704},
				{286148.716,5405.476,10.000,-14.734},
				{286681.514,5250.480,10.000,-14.763},
				{287198.812,5095.485,10.000,-14.789},
				{287700.611,4940.490,10.000,-14.812},
				{288186.910,4785.494,10.000,-14.834},
				{288657.710,4630.499,10.000,-14.854},
				{289113.010,4475.503,10.000,-14.872},
				{289552.810,4320.508,10.000,-14.888},
				{289977.111,4165.513,10.000,-14.903},
				{290385.913,4010.517,10.000,-14.916},
				{290779.215,3855.522,10.000,-14.928},
				{291157.017,3700.526,10.000,-14.939},
				{291519.320,3545.531,10.000,-14.948},
				{291866.123,3390.535,10.000,-14.956},
				{292197.427,3235.540,10.000,-14.963},
				{292513.231,3080.545,10.000,-14.970},
				{292813.536,2925.549,10.000,-14.975},
				{293098.341,2770.554,10.000,-14.980},
				{293367.647,2615.558,10.000,-14.984},
				{293621.453,2460.563,10.000,-14.987},
				{293859.759,2305.567,10.000,-14.990},
				{294082.566,2150.572,10.000,-14.992},
				{294289.874,1995.577,10.000,-14.994},
				{294481.682,1840.581,10.000,-14.996},
				{294657.990,1685.586,10.000,-14.997},
				{294818.799,1530.590,10.000,-14.998},
				{294964.108,1375.595,10.000,-14.998},
				{295093.918,1220.600,10.000,-14.999},
				{295208.228,1065.604,10.000,-14.999},
				{295307.385,917.527,10.000,-15.000},
				{295392.287,780.522,10.000,-15.000},
				{295464.043,654.587,10.000,-15.000},
				{295523.758,539.724,10.000,-15.000},
				{295572.541,435.931,10.000,-15.000},
				{295611.498,343.210,10.000,-15.000},
				{295641.736,261.560,10.000,-15.000},
				{295664.363,190.981,10.000,-15.000},
				{295680.486,131.473,10.000,-15.000},
				{295691.212,83.036,10.000,-15.000},
				{295697.647,45.671,10.000,-15.000},
				{295700.899,19.376,10.000,-15.000},
				{295702.076,4.152,10.000,-15.000},
				{295702.283,0.000,10.000,-15.000},
				{295702.283,0.000,10.000,-15.000}		};

}