package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchPt5Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.23,13.08,0.00)
	// (8.61,9.08,0.00)
	
    public CenterToRightSwitchPt5Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchPt5Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.428,8.568,10.000,-0.000},
				{2.142,25.703,10.000,-0.000},
				{5.997,51.407,10.000,-0.000},
				{12.852,85.678,10.000,-0.000},
				{23.561,128.517,10.000,-0.000},
				{38.984,179.924,10.000,-0.000},
				{59.975,239.899,10.000,-0.000},
				{87.392,308.441,10.000,-0.000},
				{122.091,385.551,10.000,-0.001},
				{164.930,471.230,10.000,-0.001},
				{216.766,565.476,10.000,-0.002},
				{278.454,668.289,10.000,-0.003},
				{350.852,779.671,10.000,-0.005},
				{434.816,899.620,10.000,-0.008},
				{530.776,1019.569,10.000,-0.012},
				{638.730,1139.519,10.000,-0.018},
				{758.680,1259.468,10.000,-0.025},
				{890.624,1379.418,10.000,-0.034},
				{1034.563,1499.367,10.000,-0.046},
				{1190.497,1619.316,10.000,-0.061},
				{1358.426,1739.266,10.000,-0.079},
				{1538.350,1859.215,10.000,-0.101},
				{1730.269,1979.164,10.000,-0.127},
				{1934.183,2099.114,10.000,-0.159},
				{2150.092,2219.063,10.000,-0.196},
				{2377.996,2339.012,10.000,-0.239},
				{2617.895,2458.962,10.000,-0.289},
				{2869.788,2578.911,10.000,-0.346},
				{3133.677,2698.860,10.000,-0.411},
				{3409.560,2818.810,10.000,-0.486},
				{3697.439,2938.759,10.000,-0.569},
				{3997.312,3058.708,10.000,-0.663},
				{4309.180,3178.658,10.000,-0.769},
				{4633.044,3298.607,10.000,-0.886},
				{4968.902,3418.557,10.000,-1.016},
				{5316.755,3538.506,10.000,-1.160},
				{5676.603,3658.455,10.000,-1.318},
				{6048.446,3778.405,10.000,-1.492},
				{6432.284,3898.354,10.000,-1.683},
				{6828.117,4018.303,10.000,-1.892},
				{7235.945,4138.253,10.000,-2.119},
				{7655.767,4258.202,10.000,-2.366},
				{8087.585,4378.151,10.000,-2.634},
				{8531.398,4498.101,10.000,-2.924},
				{8987.205,4618.050,10.000,-3.237},
				{9455.008,4737.999,10.000,-3.575},
				{9934.805,4857.949,10.000,-3.939},
				{10426.597,4977.898,10.000,-4.331},
				{10930.385,5097.847,10.000,-4.751},
				{11446.167,5217.797,10.000,-5.201},
				{11973.944,5337.746,10.000,-5.683},
				{12513.716,5457.695,10.000,-6.198},
				{13065.483,5577.645,10.000,-6.748},
				{13629.245,5697.594,10.000,-7.334},
				{14205.002,5817.544,10.000,-7.959},
				{14792.754,5937.493,10.000,-8.622},
				{15392.500,6057.442,10.000,-9.327},
				{16004.242,6177.392,10.000,-10.074},
				{16627.979,6297.341,10.000,-10.865},
				{17263.710,6417.290,10.000,-11.702},
				{17911.437,6537.240,10.000,-12.585},
				{18571.158,6657.189,10.000,-13.517},
				{19242.875,6777.138,10.000,-14.496},
				{19926.586,6897.088,10.000,-15.525},
				{20622.292,7017.037,10.000,-16.604},
				{21329.993,7136.986,10.000,-17.732},
				{22049.689,7256.936,10.000,-18.909},
				{22781.380,7376.885,10.000,-20.135},
				{23525.066,7496.834,10.000,-21.407},
				{24280.747,7616.784,10.000,-22.724},
				{25048.423,7736.733,10.000,-24.084},
				{25828.094,7856.682,10.000,-25.482},
				{26619.760,7976.632,10.000,-26.914},
				{27423.420,8096.581,10.000,-28.378},
				{28239.076,8216.531,10.000,-29.866},
				{29066.298,8327.912,10.000,-31.373},
				{29904.230,8430.726,10.000,-32.891},
				{30752.015,8524.972,10.000,-34.413},
				{31608.796,8610.650,10.000,-35.930},
				{32473.716,8687.760,10.000,-37.434},
				{33345.920,8756.303,10.000,-38.917},
				{34224.549,8816.277,10.000,-40.374},
				{35108.747,8867.684,10.000,-41.796},
				{35997.657,8910.523,10.000,-43.179},
				{36890.423,8944.794,10.000,-44.518},
				{37786.188,8970.498,10.000,-45.807},
				{38684.094,8987.634,10.000,-47.043},
				{39583.286,8996.201,10.000,-48.224},
				{40482.906,8996.201,10.000,-49.348},
				{41382.526,8996.201,10.000,-50.413},
				{42282.146,8996.201,10.000,-51.421},
				{43181.766,8996.201,10.000,-52.371},
				{44081.387,8996.201,10.000,-53.264},
				{44981.007,8996.201,10.000,-54.102},
				{45880.627,8996.201,10.000,-54.884},
				{46780.247,8996.201,10.000,-55.613},
				{47679.867,8996.201,10.000,-56.290},
				{48579.487,8996.201,10.000,-56.915},
				{49479.107,8996.201,10.000,-57.490},
				{50378.727,8996.201,10.000,-58.016},
				{51278.348,8996.201,10.000,-58.495},
				{52177.968,8996.201,10.000,-58.927},
				{53077.588,8996.201,10.000,-59.314},
				{53977.208,8996.201,10.000,-59.656},
				{54876.828,8996.201,10.000,-59.955},
				{55776.448,8996.201,10.000,-60.210},
				{56676.068,8996.201,10.000,-60.423},
				{57575.688,8996.201,10.000,-60.595},
				{58475.309,8996.201,10.000,-60.725},
				{59374.929,8996.201,10.000,-60.815},
				{60274.549,8996.201,10.000,-60.864},
				{61174.169,8996.201,10.000,-60.872},
				{62073.789,8996.201,10.000,-60.840},
				{62973.409,8996.201,10.000,-60.767},
				{63873.029,8996.201,10.000,-60.654},
				{64772.650,8996.201,10.000,-60.499},
				{65672.270,8996.201,10.000,-60.303},
				{66571.890,8996.201,10.000,-60.065},
				{67471.510,8996.201,10.000,-59.785},
				{68371.130,8996.201,10.000,-59.461},
				{69270.750,8996.201,10.000,-59.092},
				{70170.370,8996.201,10.000,-58.679},
				{71069.990,8996.201,10.000,-58.220},
				{71969.611,8996.201,10.000,-57.713},
				{72869.231,8996.201,10.000,-57.158},
				{73768.851,8996.201,10.000,-56.554},
				{74668.471,8996.201,10.000,-55.899},
				{75568.091,8996.201,10.000,-55.192},
				{76467.711,8996.201,10.000,-54.432},
				{77367.331,8996.201,10.000,-53.617},
				{78266.952,8996.201,10.000,-52.747},
				{79166.572,8996.201,10.000,-51.821},
				{80066.192,8996.201,10.000,-50.837},
				{80965.812,8996.201,10.000,-49.795},
				{81865.432,8996.201,10.000,-48.695},
				{82764.801,8991.174,10.000,-47.538},
				{83663.239,8977.579,10.000,-46.324},
				{84559.888,8955.417,10.000,-45.057},
				{85453.893,8924.686,10.000,-43.739},
				{86344.397,8885.388,10.000,-42.374},
				{87230.543,8837.521,10.000,-40.967},
				{88111.473,8781.087,10.000,-39.524},
				{88986.332,8716.086,10.000,-38.051},
				{89854.262,8642.516,10.000,-36.555},
				{90714.406,8560.379,10.000,-35.042},
				{91565.909,8469.673,10.000,-33.522},
				{92407.913,8370.400,10.000,-32.002},
				{93239.561,8262.559,10.000,-30.489},
				{94059.996,8146.151,10.000,-28.993},
				{94868.614,8026.201,10.000,-27.518},
				{95665.236,7906.252,10.000,-26.072},
				{96449.864,7786.303,10.000,-24.659},
				{97222.497,7666.353,10.000,-23.284},
				{97983.135,7546.404,10.000,-21.949},
				{98731.778,7426.455,10.000,-20.658},
				{99468.426,7306.505,10.000,-19.413},
				{100193.079,7186.556,10.000,-18.215},
				{100905.737,7066.607,10.000,-17.066},
				{101606.400,6946.657,10.000,-15.967},
				{102295.068,6826.708,10.000,-14.918},
				{102971.742,6706.759,10.000,-13.918},
				{103636.420,6586.809,10.000,-12.966},
				{104289.104,6466.860,10.000,-12.063},
				{104929.792,6346.910,10.000,-11.208},
				{105558.486,6226.961,10.000,-10.398},
				{106175.184,6107.012,10.000,-9.632},
				{106779.888,5987.062,10.000,-8.910},
				{107372.597,5867.113,10.000,-8.230},
				{107953.311,5747.164,10.000,-7.589},
				{108522.030,5627.214,10.000,-6.987},
				{109078.753,5507.265,10.000,-6.423},
				{109623.483,5387.316,10.000,-5.893},
				{110156.217,5267.366,10.000,-5.398},
				{110676.956,5147.417,10.000,-4.934},
				{111185.700,5027.468,10.000,-4.502},
				{111682.449,4907.518,10.000,-4.099},
				{112167.204,4787.569,10.000,-3.723},
				{112639.963,4667.620,10.000,-3.375},
				{113100.728,4547.670,10.000,-3.051},
				{113549.497,4427.721,10.000,-2.752},
				{113986.272,4307.771,10.000,-2.475},
				{114411.051,4187.822,10.000,-2.219},
				{114823.836,4067.873,10.000,-1.984},
				{115224.626,3947.923,10.000,-1.768},
				{115613.421,3827.974,10.000,-1.570},
				{115990.221,3708.025,10.000,-1.389},
				{116355.026,3588.075,10.000,-1.224},
				{116707.836,3468.126,10.000,-1.074},
				{117048.651,3348.177,10.000,-0.939},
				{117377.471,3228.227,10.000,-0.816},
				{117694.296,3108.278,10.000,-0.706},
				{117999.127,2988.329,10.000,-0.607},
				{118291.962,2868.379,10.000,-0.519},
				{118572.803,2748.430,10.000,-0.441},
				{118841.648,2628.481,10.000,-0.372},
				{119098.499,2508.531,10.000,-0.312},
				{119343.354,2388.582,10.000,-0.259},
				{119576.215,2268.633,10.000,-0.213},
				{119797.081,2148.683,10.000,-0.174},
				{120005.952,2028.734,10.000,-0.140},
				{120202.828,1908.784,10.000,-0.112},
				{120387.709,1788.835,10.000,-0.088},
				{120560.595,1668.886,10.000,-0.068},
				{120721.486,1548.936,10.000,-0.052},
				{120870.382,1428.987,10.000,-0.039},
				{121007.283,1309.038,10.000,-0.029},
				{121132.190,1189.088,10.000,-0.020},
				{121245.101,1069.139,10.000,-0.014},
				{121346.017,949.190,10.000,-0.010},
				{121434.939,829.240,10.000,-0.006},
				{121512.117,714.318,10.000,-0.004},
				{121578.231,607.964,10.000,-0.003},
				{121634.138,510.177,10.000,-0.002},
				{121680.695,420.958,10.000,-0.001},
				{121718.758,340.307,10.000,-0.000},
				{121749.184,268.224,10.000,-0.000},
				{121772.831,204.709,10.000,-0.000},
				{121790.555,149.761,10.000,-0.000},
				{121803.212,103.382,10.000,-0.000},
				{121811.659,65.570,10.000,-0.000},
				{121816.754,36.325,10.000,-0.000},
				{121819.353,15.649,10.000,-0.000},
				{121820.312,3.541,10.000,-0.000},
				{121820.489,0.000,10.000,0.000},
				{121820.489,0.000,10.000,0.000}		};

}