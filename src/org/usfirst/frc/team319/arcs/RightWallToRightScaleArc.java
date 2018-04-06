package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (17.63,4.79,10.00)
	// (24.13,6.79,0.00)
	
    public RightWallToRightScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToRightScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.554,-11.071,10.000,-0.000},
				{-2.768,-33.213,10.000,-0.000},
				{-7.750,-66.427,10.000,-0.000},
				{-16.607,-110.711,10.000,-0.000},
				{-30.446,-166.067,10.000,-0.000},
				{-50.374,-232.493,10.000,-0.000},
				{-77.498,-309.991,10.000,-0.000},
				{-112.925,-398.560,10.000,-0.000},
				{-157.763,-498.200,10.000,-0.000},
				{-213.119,-608.911,10.000,-0.000},
				{-280.099,-730.693,10.000,-0.000},
				{-359.811,-863.546,10.000,-0.000},
				{-453.362,-1007.470,10.000,-0.000},
				{-561.858,-1162.466,10.000,-0.000},
				{-685.855,-1317.461,10.000,-0.000},
				{-825.351,-1472.457,10.000,-0.000},
				{-980.346,-1627.452,10.000,-0.000},
				{-1150.841,-1782.447,10.000,-0.000},
				{-1336.836,-1937.443,10.000,-0.000},
				{-1538.330,-2092.438,10.000,-0.000},
				{-1755.323,-2247.434,10.000,-0.000},
				{-1987.816,-2402.429,10.000,-0.001},
				{-2235.809,-2557.424,10.000,-0.001},
				{-2499.301,-2712.420,10.000,-0.001},
				{-2778.293,-2867.415,10.000,-0.001},
				{-3072.784,-3022.411,10.000,-0.001},
				{-3382.775,-3177.406,10.000,-0.001},
				{-3708.265,-3332.402,10.000,-0.002},
				{-4049.255,-3487.397,10.000,-0.002},
				{-4405.745,-3642.392,10.000,-0.002},
				{-4777.734,-3797.388,10.000,-0.003},
				{-5165.222,-3952.383,10.000,-0.003},
				{-5568.211,-4107.379,10.000,-0.004},
				{-5986.698,-4262.374,10.000,-0.004},
				{-6420.685,-4417.370,10.000,-0.005},
				{-6870.172,-4572.365,10.000,-0.006},
				{-7335.158,-4727.360,10.000,-0.006},
				{-7815.644,-4882.356,10.000,-0.007},
				{-8311.630,-5037.351,10.000,-0.008},
				{-8823.114,-5192.347,10.000,-0.009},
				{-9350.099,-5347.342,10.000,-0.010},
				{-9892.583,-5502.337,10.000,-0.011},
				{-10450.566,-5657.333,10.000,-0.012},
				{-11024.049,-5812.328,10.000,-0.013},
				{-11613.032,-5967.324,10.000,-0.015},
				{-12217.514,-6122.319,10.000,-0.016},
				{-12837.496,-6277.315,10.000,-0.017},
				{-13472.977,-6432.310,10.000,-0.019},
				{-14123.958,-6587.305,10.000,-0.021},
				{-14790.438,-6742.301,10.000,-0.022},
				{-15472.418,-6897.296,10.000,-0.024},
				{-16169.897,-7052.292,10.000,-0.026},
				{-16882.876,-7207.287,10.000,-0.028},
				{-17611.355,-7362.283,10.000,-0.030},
				{-18355.333,-7517.278,10.000,-0.032},
				{-19114.810,-7672.273,10.000,-0.034},
				{-19889.788,-7827.269,10.000,-0.036},
				{-20680.264,-7982.264,10.000,-0.039},
				{-21486.240,-8137.260,10.000,-0.041},
				{-22307.716,-8292.255,10.000,-0.043},
				{-23144.691,-8447.251,10.000,-0.046},
				{-23997.166,-8602.246,10.000,-0.048},
				{-24865.141,-8757.241,10.000,-0.051},
				{-25748.615,-8912.237,10.000,-0.053},
				{-26647.588,-9067.232,10.000,-0.056},
				{-27562.061,-9222.228,10.000,-0.058},
				{-28492.034,-9377.223,10.000,-0.061},
				{-29437.506,-9532.218,10.000,-0.063},
				{-30398.477,-9687.214,10.000,-0.066},
				{-31374.948,-9842.209,10.000,-0.068},
				{-32366.919,-9997.205,10.000,-0.071},
				{-33374.389,-10152.200,10.000,-0.073},
				{-34397.359,-10307.196,10.000,-0.075},
				{-35435.828,-10462.191,10.000,-0.077},
				{-36489.797,-10617.186,10.000,-0.079},
				{-37559.266,-10772.182,10.000,-0.081},
				{-38644.234,-10927.177,10.000,-0.083},
				{-39744.701,-11082.173,10.000,-0.085},
				{-40860.668,-11237.168,10.000,-0.086},
				{-41992.135,-11392.164,10.000,-0.087},
				{-43139.101,-11547.159,10.000,-0.089},
				{-44301.567,-11702.154,10.000,-0.089},
				{-45479.532,-11857.150,10.000,-0.090},
				{-46672.997,-12012.145,10.000,-0.090},
				{-47881.961,-12167.141,10.000,-0.090},
				{-49106.425,-12322.136,10.000,-0.089},
				{-50346.388,-12477.131,10.000,-0.089},
				{-51601.851,-12632.127,10.000,-0.087},
				{-52872.813,-12787.122,10.000,-0.086},
				{-54159.275,-12942.118,10.000,-0.083},
				{-55461.237,-13097.113,10.000,-0.081},
				{-56778.698,-13252.109,10.000,-0.077},
				{-58111.659,-13407.104,10.000,-0.074},
				{-59460.119,-13562.099,10.000,-0.069},
				{-60824.079,-13717.095,10.000,-0.064},
				{-62203.538,-13872.090,10.000,-0.059},
				{-63598.497,-14027.086,10.000,-0.052},
				{-65008.955,-14182.081,10.000,-0.045},
				{-66434.913,-14337.077,10.000,-0.037},
				{-67876.370,-14492.072,10.000,-0.028},
				{-69333.327,-14647.067,10.000,-0.019},
				{-70805.784,-14802.063,10.000,-0.008},
				{-72293.740,-14957.058,10.000,0.003},
				{-73797.195,-15112.054,10.000,0.016},
				{-75316.151,-15267.049,10.000,0.030},
				{-76850.605,-15422.045,10.000,0.044},
				{-78400.559,-15577.040,10.000,0.060},
				{-79966.013,-15732.035,10.000,0.077},
				{-81546.967,-15887.031,10.000,0.095},
				{-83143.419,-16042.026,10.000,0.115},
				{-84755.372,-16197.022,10.000,0.136},
				{-86382.824,-16352.017,10.000,0.158},
				{-88025.775,-16507.012,10.000,0.182},
				{-89684.226,-16662.008,10.000,0.207},
				{-91358.177,-16817.003,10.000,0.234},
				{-93047.627,-16971.999,10.000,0.262},
				{-94752.577,-17126.994,10.000,0.292},
				{-96473.026,-17281.990,10.000,0.324},
				{-98208.974,-17436.985,10.000,0.357},
				{-99960.423,-17591.980,10.000,0.392},
				{-101727.371,-17746.976,10.000,0.430},
				{-103509.818,-17901.971,10.000,0.469},
				{-105307.765,-18056.967,10.000,0.509},
				{-107121.211,-18211.962,10.000,0.552},
				{-108950.157,-18366.958,10.000,0.597},
				{-110794.049,-18510.882,10.000,0.645},
				{-112651.780,-18643.735,10.000,0.694},
				{-114522.243,-18765.517,10.000,0.745},
				{-116404.330,-18876.228,10.000,0.799},
				{-118296.935,-18975.868,10.000,0.854},
				{-120198.950,-19064.437,10.000,0.912},
				{-122109.269,-19141.935,10.000,0.972},
				{-124026.783,-19208.361,10.000,1.034},
				{-125950.387,-19263.717,10.000,1.099},
				{-127878.973,-19308.001,10.000,1.165},
				{-129811.434,-19341.214,10.000,1.233},
				{-131746.662,-19363.357,10.000,1.304},
				{-133683.552,-19374.428,10.000,1.376},
				{-135620.995,-19374.428,10.000,1.450},
				{-137558.437,-19374.428,10.000,1.526},
				{-139495.880,-19374.428,10.000,1.604},
				{-141433.323,-19374.428,10.000,1.684},
				{-143370.766,-19374.428,10.000,1.766},
				{-145308.208,-19374.428,10.000,1.850},
				{-147245.651,-19374.428,10.000,1.935},
				{-149183.094,-19374.428,10.000,2.022},
				{-151120.537,-19374.428,10.000,2.111},
				{-153057.980,-19374.428,10.000,2.202},
				{-154995.422,-19374.428,10.000,2.295},
				{-156932.865,-19374.428,10.000,2.389},
				{-158870.308,-19374.428,10.000,2.485},
				{-160807.751,-19374.428,10.000,2.582},
				{-162745.193,-19374.428,10.000,2.681},
				{-164682.636,-19374.428,10.000,2.782},
				{-166620.079,-19374.428,10.000,2.884},
				{-168557.522,-19374.428,10.000,2.988},
				{-170494.965,-19374.428,10.000,3.093},
				{-172432.407,-19374.428,10.000,3.199},
				{-174369.850,-19374.428,10.000,3.307},
				{-176307.293,-19374.428,10.000,3.416},
				{-178244.736,-19374.428,10.000,3.527},
				{-180182.178,-19374.428,10.000,3.638},
				{-182119.621,-19374.428,10.000,3.751},
				{-184057.064,-19374.428,10.000,3.865},
				{-185994.507,-19374.428,10.000,3.980},
				{-187931.950,-19374.428,10.000,4.096},
				{-189869.392,-19374.428,10.000,4.213},
				{-191806.835,-19374.428,10.000,4.331},
				{-193744.278,-19374.428,10.000,4.450},
				{-195681.721,-19374.428,10.000,4.569},
				{-197619.163,-19374.428,10.000,4.690},
				{-199556.606,-19374.428,10.000,4.811},
				{-201494.049,-19374.428,10.000,4.932},
				{-203431.492,-19374.428,10.000,5.054},
				{-205368.935,-19374.428,10.000,5.177},
				{-207306.377,-19374.428,10.000,5.300},
				{-209243.820,-19374.428,10.000,5.423},
				{-211181.263,-19374.428,10.000,5.546},
				{-213118.706,-19374.428,10.000,5.670},
				{-215056.148,-19374.428,10.000,5.793},
				{-216993.591,-19374.428,10.000,5.917},
				{-218931.034,-19374.428,10.000,6.041},
				{-220868.477,-19374.428,10.000,6.164},
				{-222805.920,-19374.428,10.000,6.287},
				{-224743.362,-19374.428,10.000,6.410},
				{-226680.805,-19374.428,10.000,6.533},
				{-228618.248,-19374.428,10.000,6.655},
				{-230555.691,-19374.428,10.000,6.776},
				{-232493.133,-19374.428,10.000,6.897},
				{-234430.576,-19374.428,10.000,7.017},
				{-236368.019,-19374.428,10.000,7.136},
				{-238305.462,-19374.428,10.000,7.255},
				{-240242.905,-19374.428,10.000,7.372},
				{-242180.347,-19374.428,10.000,7.488},
				{-244117.790,-19374.428,10.000,7.603},
				{-246055.233,-19374.428,10.000,7.716},
				{-247992.676,-19374.428,10.000,7.828},
				{-249930.118,-19374.428,10.000,7.939},
				{-251867.561,-19374.428,10.000,8.048},
				{-253805.004,-19374.428,10.000,8.155},
				{-255742.447,-19374.428,10.000,8.260},
				{-257679.890,-19374.428,10.000,8.364},
				{-259617.332,-19374.428,10.000,8.465},
				{-261554.775,-19374.428,10.000,8.564},
				{-263492.218,-19374.428,10.000,8.661},
				{-265429.661,-19374.428,10.000,8.756},
				{-267367.103,-19374.428,10.000,8.848},
				{-269304.546,-19374.428,10.000,8.937},
				{-271241.989,-19374.428,10.000,9.024},
				{-273179.432,-19374.428,10.000,9.108},
				{-275116.875,-19374.428,10.000,9.189},
				{-277054.317,-19374.428,10.000,9.266},
				{-278991.760,-19374.428,10.000,9.341},
				{-280929.203,-19374.428,10.000,9.412},
				{-282866.646,-19374.428,10.000,9.480},
				{-284804.088,-19374.428,10.000,9.545},
				{-286741.531,-19374.428,10.000,9.605},
				{-288678.974,-19374.428,10.000,9.662},
				{-290616.417,-19374.428,10.000,9.715},
				{-292553.860,-19374.428,10.000,9.764},
				{-294491.302,-19374.428,10.000,9.809},
				{-296428.745,-19374.428,10.000,9.849},
				{-298366.188,-19374.428,10.000,9.885},
				{-300303.631,-19374.428,10.000,9.916},
				{-302241.073,-19374.428,10.000,9.943},
				{-304178.516,-19374.428,10.000,9.965},
				{-306115.959,-19374.428,10.000,9.981},
				{-308053.402,-19374.428,10.000,9.993},
				{-309990.845,-19374.428,10.000,9.999},
				{-311927.982,-19368.323,10.000,10.010},
				{-313863.956,-19351.146,10.000,10.128},
				{-315797.658,-19322.899,10.000,10.371},
				{-317727.982,-19283.580,10.000,10.726},
				{-319653.820,-19233.191,10.000,11.181},
				{-321574.066,-19171.730,10.000,11.724},
				{-323487.613,-19099.198,10.000,12.343},
				{-325393.352,-19015.595,10.000,13.028},
				{-327290.178,-18920.921,10.000,13.766},
				{-329176.983,-18815.176,10.000,14.547},
				{-331052.660,-18698.359,10.000,15.360},
				{-332916.101,-18570.472,10.000,16.195},
				{-334766.201,-18431.514,10.000,17.043},
				{-336601.850,-18281.484,10.000,17.894},
				{-338422.249,-18126.489,10.000,18.739},
				{-340227.148,-17971.493,10.000,19.573},
				{-342016.548,-17816.498,10.000,20.387},
				{-343790.448,-17661.502,10.000,21.176},
				{-345548.848,-17506.507,10.000,21.936},
				{-347291.749,-17351.512,10.000,22.661},
				{-349019.150,-17196.516,10.000,23.349},
				{-350731.052,-17041.521,10.000,23.996},
				{-352427.455,-16886.525,10.000,24.600},
				{-354108.357,-16731.530,10.000,25.158},
				{-355773.761,-16576.534,10.000,25.669},
				{-357423.664,-16421.539,10.000,26.133},
				{-359058.068,-16266.544,10.000,26.548},
				{-360676.973,-16111.548,10.000,26.915},
				{-362280.378,-15956.553,10.000,27.233},
				{-363868.284,-15801.557,10.000,27.501},
				{-365440.689,-15646.562,10.000,27.722},
				{-366997.596,-15491.566,10.000,27.894},
				{-368539.003,-15336.571,10.000,28.020},
				{-370064.910,-15181.576,10.000,28.099},
				{-371575.318,-15026.580,10.000,28.132},
				{-373070.226,-14871.585,10.000,28.121},
				{-374549.635,-14716.589,10.000,28.066},
				{-376013.544,-14561.594,10.000,27.970},
				{-377461.954,-14406.599,10.000,27.831},
				{-378894.864,-14251.603,10.000,27.653},
				{-380312.274,-14096.608,10.000,27.436},
				{-381714.185,-13941.612,10.000,27.182},
				{-383100.597,-13786.617,10.000,26.892},
				{-384471.509,-13631.621,10.000,26.568},
				{-385826.921,-13476.626,10.000,26.211},
				{-387166.834,-13321.631,10.000,25.822},
				{-388491.247,-13166.635,10.000,25.403},
				{-389800.161,-13011.640,10.000,24.957},
				{-391093.575,-12856.644,10.000,24.484},
				{-392371.490,-12701.649,10.000,23.986},
				{-393633.905,-12546.653,10.000,23.466},
				{-394880.820,-12391.658,10.000,22.924},
				{-396112.236,-12236.663,10.000,22.364},
				{-397328.153,-12081.667,10.000,21.786},
				{-398528.570,-11926.672,10.000,21.194},
				{-399713.487,-11771.676,10.000,20.588},
				{-400882.905,-11616.681,10.000,19.971},
				{-402036.823,-11461.685,10.000,19.344},
				{-403175.242,-11306.690,10.000,18.711},
				{-404298.161,-11151.695,10.000,18.072},
				{-405405.581,-10996.699,10.000,17.430},
				{-406497.501,-10841.704,10.000,16.786},
				{-407573.922,-10686.708,10.000,16.143},
				{-408634.843,-10531.713,10.000,15.501},
				{-409680.264,-10376.718,10.000,14.863},
				{-410710.186,-10221.722,10.000,14.231},
				{-411724.609,-10066.727,10.000,13.605},
				{-412723.532,-9911.731,10.000,12.988},
				{-413706.955,-9756.736,10.000,12.380},
				{-414674.879,-9601.740,10.000,11.783},
				{-415627.303,-9446.745,10.000,11.198},
				{-416564.228,-9291.750,10.000,10.625},
				{-417485.653,-9136.754,10.000,10.066},
				{-418391.579,-8981.759,10.000,9.522},
				{-419282.005,-8826.763,10.000,8.993},
				{-420156.931,-8671.768,10.000,8.480},
				{-421016.358,-8516.772,10.000,7.983},
				{-421860.286,-8361.777,10.000,7.503},
				{-422688.714,-8206.782,10.000,7.040},
				{-423501.642,-8051.786,10.000,6.594},
				{-424299.071,-7896.791,10.000,6.166},
				{-425081.000,-7741.795,10.000,5.755},
				{-425847.430,-7586.800,10.000,5.361},
				{-426598.360,-7431.805,10.000,4.985},
				{-427333.791,-7276.809,10.000,4.627},
				{-428053.722,-7121.814,10.000,4.285},
				{-428758.154,-6966.818,10.000,3.961},
				{-429447.086,-6811.823,10.000,3.653},
				{-430120.518,-6656.827,10.000,3.362},
				{-430778.451,-6501.832,10.000,3.086},
				{-431420.885,-6346.837,10.000,2.827},
				{-432047.819,-6191.841,10.000,2.583},
				{-432659.253,-6036.846,10.000,2.353},
				{-433255.188,-5881.850,10.000,2.139},
				{-433835.623,-5726.855,10.000,1.938},
				{-434400.559,-5571.859,10.000,1.751},
				{-434949.995,-5416.864,10.000,1.577},
				{-435483.932,-5261.869,10.000,1.415},
				{-436002.369,-5106.873,10.000,1.266},
				{-436505.306,-4951.878,10.000,1.128},
				{-436992.744,-4796.882,10.000,1.001},
				{-437464.683,-4641.887,10.000,0.885},
				{-437921.122,-4486.891,10.000,0.779},
				{-438362.061,-4331.896,10.000,0.683},
				{-438787.501,-4176.901,10.000,0.595},
				{-439197.441,-4021.905,10.000,0.516},
				{-439591.882,-3866.910,10.000,0.445},
				{-439970.823,-3711.914,10.000,0.381},
				{-440334.265,-3556.919,10.000,0.325},
				{-440682.207,-3401.924,10.000,0.274},
				{-441014.649,-3246.928,10.000,0.230},
				{-441331.592,-3091.933,10.000,0.191},
				{-441633.036,-2936.937,10.000,0.158},
				{-441918.980,-2781.942,10.000,0.129},
				{-442189.424,-2626.946,10.000,0.104},
				{-442444.369,-2471.951,10.000,0.083},
				{-442683.815,-2316.956,10.000,0.065},
				{-442907.760,-2161.960,10.000,0.051},
				{-443116.207,-2006.965,10.000,0.039},
				{-443309.153,-1851.969,10.000,0.029},
				{-443486.600,-1696.974,10.000,0.021},
				{-443648.548,-1541.978,10.000,0.015},
				{-443794.996,-1386.983,10.000,0.011},
				{-443925.945,-1231.988,10.000,0.007},
				{-444041.394,-1076.992,10.000,0.005},
				{-444141.648,-928.102,10.000,0.003},
				{-444227.568,-790.283,10.000,0.002},
				{-444300.258,-663.535,10.000,0.001},
				{-444360.828,-547.858,10.000,0.001},
				{-444410.384,-443.252,10.000,0.000},
				{-444450.032,-349.718,10.000,0.000},
				{-444480.881,-267.254,10.000,0.000},
				{-444504.037,-195.862,10.000,0.000},
				{-444520.607,-135.540,10.000,0.000},
				{-444531.698,-86.290,10.000,0.000},
				{-444538.418,-48.111,10.000,0.000},
				{-444541.874,-21.003,10.000,0.000},
				{-444543.172,-4.966,10.000,0.000},
				{-444543.421,-0.000,10.000,-0.000},
				{-444543.421,-0.000,10.000,-0.000}		};

}