package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftWallToRightSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,23.15,0.00)
	// (14.63,23.15,0.00)
	// (17.63,19.65,-89.99)
	
    public LeftWallToRightSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftWallToRightSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.554,-11.071,10.000,0.000},
				{-2.768,-33.213,10.000,0.000},
				{-7.750,-66.427,10.000,0.000},
				{-16.607,-110.711,10.000,0.000},
				{-30.446,-166.067,10.000,0.000},
				{-50.374,-232.493,10.000,0.000},
				{-77.498,-309.991,10.000,0.000},
				{-112.925,-398.560,10.000,0.000},
				{-157.763,-498.200,10.000,0.000},
				{-213.119,-608.911,10.000,0.000},
				{-280.099,-730.693,10.000,0.000},
				{-359.811,-863.546,10.000,0.000},
				{-453.362,-1007.470,10.000,0.000},
				{-561.858,-1162.466,10.000,0.000},
				{-685.855,-1317.461,10.000,0.000},
				{-825.351,-1472.457,10.000,0.000},
				{-980.346,-1627.452,10.000,0.000},
				{-1150.841,-1782.447,10.000,0.000},
				{-1336.836,-1937.443,10.000,0.000},
				{-1538.330,-2092.438,10.000,0.000},
				{-1755.323,-2247.434,10.000,0.000},
				{-1987.816,-2402.429,10.000,0.000},
				{-2235.809,-2557.424,10.000,0.000},
				{-2499.301,-2712.420,10.000,0.000},
				{-2778.293,-2867.415,10.000,0.000},
				{-3072.784,-3022.411,10.000,0.000},
				{-3382.775,-3177.406,10.000,0.000},
				{-3708.265,-3332.402,10.000,0.000},
				{-4049.255,-3487.397,10.000,0.000},
				{-4405.745,-3642.392,10.000,0.000},
				{-4777.734,-3797.388,10.000,0.000},
				{-5165.222,-3952.383,10.000,0.000},
				{-5568.211,-4107.379,10.000,0.000},
				{-5986.698,-4262.374,10.000,0.000},
				{-6420.685,-4417.370,10.000,0.000},
				{-6870.172,-4572.365,10.000,0.000},
				{-7335.158,-4727.360,10.000,0.000},
				{-7815.644,-4882.356,10.000,0.000},
				{-8311.630,-5037.351,10.000,0.000},
				{-8823.114,-5192.347,10.000,0.000},
				{-9350.099,-5347.342,10.000,0.000},
				{-9892.583,-5502.337,10.000,0.000},
				{-10450.566,-5657.333,10.000,0.000},
				{-11024.049,-5812.328,10.000,0.000},
				{-11613.032,-5967.324,10.000,0.000},
				{-12217.514,-6122.319,10.000,0.000},
				{-12837.496,-6277.315,10.000,0.000},
				{-13472.977,-6432.310,10.000,0.000},
				{-14123.958,-6587.305,10.000,0.000},
				{-14790.438,-6742.301,10.000,0.000},
				{-15472.418,-6897.296,10.000,0.000},
				{-16169.897,-7052.292,10.000,0.000},
				{-16882.876,-7207.287,10.000,0.000},
				{-17611.355,-7362.283,10.000,0.000},
				{-18355.333,-7517.278,10.000,0.000},
				{-19114.810,-7672.273,10.000,0.000},
				{-19889.788,-7827.269,10.000,0.000},
				{-20680.264,-7982.264,10.000,0.000},
				{-21486.240,-8137.260,10.000,0.000},
				{-22307.716,-8292.255,10.000,0.000},
				{-23144.691,-8447.251,10.000,0.000},
				{-23997.166,-8602.246,10.000,0.000},
				{-24865.141,-8757.241,10.000,0.000},
				{-25748.615,-8912.237,10.000,0.000},
				{-26647.588,-9067.232,10.000,0.000},
				{-27562.061,-9222.228,10.000,0.000},
				{-28492.034,-9377.223,10.000,0.000},
				{-29437.506,-9532.218,10.000,0.000},
				{-30398.477,-9687.214,10.000,0.000},
				{-31374.948,-9842.209,10.000,0.000},
				{-32366.919,-9997.205,10.000,0.000},
				{-33374.389,-10152.200,10.000,0.000},
				{-34397.359,-10307.196,10.000,0.000},
				{-35435.828,-10462.191,10.000,0.000},
				{-36489.797,-10617.186,10.000,0.000},
				{-37559.266,-10772.182,10.000,0.000},
				{-38644.234,-10927.177,10.000,0.000},
				{-39744.701,-11082.173,10.000,0.000},
				{-40860.668,-11237.168,10.000,0.000},
				{-41992.135,-11392.164,10.000,0.000},
				{-43139.101,-11547.159,10.000,0.000},
				{-44301.567,-11702.154,10.000,0.000},
				{-45479.532,-11857.150,10.000,0.000},
				{-46672.997,-12012.145,10.000,0.000},
				{-47881.961,-12167.141,10.000,0.000},
				{-49106.425,-12322.136,10.000,0.000},
				{-50346.388,-12477.131,10.000,0.000},
				{-51601.851,-12632.127,10.000,0.000},
				{-52872.813,-12787.122,10.000,0.000},
				{-54159.275,-12942.118,10.000,0.000},
				{-55461.237,-13097.113,10.000,0.000},
				{-56778.698,-13252.109,10.000,0.000},
				{-58111.659,-13407.104,10.000,0.000},
				{-59460.119,-13562.099,10.000,0.000},
				{-60824.079,-13717.095,10.000,0.000},
				{-62203.538,-13872.090,10.000,0.000},
				{-63598.497,-14027.086,10.000,0.000},
				{-65008.955,-14182.081,10.000,0.000},
				{-66434.913,-14337.077,10.000,0.000},
				{-67876.370,-14492.072,10.000,0.000},
				{-69333.327,-14647.067,10.000,0.000},
				{-70805.784,-14802.063,10.000,0.000},
				{-72293.740,-14957.058,10.000,0.000},
				{-73797.195,-15112.054,10.000,0.000},
				{-75316.151,-15267.049,10.000,0.000},
				{-76850.605,-15422.045,10.000,0.000},
				{-78400.559,-15577.040,10.000,0.000},
				{-79966.013,-15732.035,10.000,0.000},
				{-81546.967,-15887.031,10.000,0.000},
				{-83143.419,-16042.026,10.000,0.000},
				{-84755.372,-16197.022,10.000,0.000},
				{-86382.824,-16352.017,10.000,0.000},
				{-88025.775,-16507.012,10.000,0.000},
				{-89684.226,-16662.008,10.000,0.000},
				{-91358.177,-16817.003,10.000,0.000},
				{-93047.627,-16971.999,10.000,0.000},
				{-94752.577,-17126.994,10.000,0.000},
				{-96473.026,-17281.990,10.000,0.000},
				{-98208.974,-17436.985,10.000,0.000},
				{-99960.423,-17591.980,10.000,0.000},
				{-101727.371,-17746.976,10.000,0.000},
				{-103509.818,-17901.971,10.000,0.000},
				{-105307.765,-18056.967,10.000,0.000},
				{-107121.211,-18211.962,10.000,0.000},
				{-108950.157,-18366.958,10.000,0.000},
				{-110794.049,-18510.882,10.000,0.000},
				{-112651.780,-18643.735,10.000,0.000},
				{-114522.243,-18765.517,10.000,0.000},
				{-116404.330,-18876.228,10.000,0.000},
				{-118296.935,-18975.868,10.000,0.000},
				{-120198.950,-19064.437,10.000,0.000},
				{-122109.269,-19141.935,10.000,0.000},
				{-124026.783,-19208.361,10.000,0.000},
				{-125950.387,-19263.717,10.000,0.000},
				{-127878.973,-19308.001,10.000,0.000},
				{-129811.434,-19341.214,10.000,0.000},
				{-131746.662,-19363.357,10.000,0.000},
				{-133683.552,-19374.428,10.000,0.000},
				{-135620.995,-19374.428,10.000,0.000},
				{-137558.437,-19374.428,10.000,0.000},
				{-139495.880,-19374.428,10.000,0.000},
				{-141433.323,-19374.428,10.000,0.000},
				{-143370.766,-19374.428,10.000,0.000},
				{-145308.208,-19374.428,10.000,0.000},
				{-147245.651,-19374.428,10.000,0.000},
				{-149183.094,-19374.428,10.000,0.000},
				{-151120.537,-19374.428,10.000,0.000},
				{-153057.980,-19374.428,10.000,0.000},
				{-154995.422,-19374.428,10.000,0.000},
				{-156932.865,-19374.428,10.000,0.000},
				{-158870.308,-19374.428,10.000,0.000},
				{-160807.751,-19374.428,10.000,0.000},
				{-162745.193,-19374.428,10.000,0.000},
				{-164682.636,-19374.428,10.000,0.000},
				{-166620.079,-19374.428,10.000,0.000},
				{-168557.522,-19374.428,10.000,0.000},
				{-170494.965,-19374.428,10.000,0.000},
				{-172432.407,-19374.428,10.000,0.000},
				{-174369.850,-19374.428,10.000,0.000},
				{-176307.293,-19374.428,10.000,0.000},
				{-178244.736,-19374.428,10.000,0.000},
				{-180182.178,-19374.428,10.000,0.000},
				{-182119.621,-19374.428,10.000,0.000},
				{-184057.064,-19374.428,10.000,0.000},
				{-185994.507,-19374.428,10.000,0.000},
				{-187931.950,-19374.428,10.000,0.000},
				{-189869.392,-19374.428,10.000,0.000},
				{-191806.835,-19374.428,10.000,0.000},
				{-193744.278,-19374.428,10.000,0.000},
				{-195681.721,-19374.428,10.000,0.000},
				{-197619.163,-19374.428,10.000,0.000},
				{-199556.606,-19374.428,10.000,0.000},
				{-201494.049,-19374.428,10.000,0.000},
				{-203431.492,-19374.428,10.000,0.000},
				{-205368.935,-19374.428,10.000,0.000},
				{-207306.377,-19374.428,10.000,0.000},
				{-209243.820,-19374.428,10.000,0.000},
				{-211181.263,-19374.428,10.000,0.000},
				{-213118.706,-19374.428,10.000,0.000},
				{-215056.148,-19374.428,10.000,0.000},
				{-216993.591,-19374.428,10.000,0.000},
				{-218931.034,-19374.428,10.000,0.000},
				{-220868.477,-19374.428,10.000,0.000},
				{-222805.920,-19374.428,10.000,0.000},
				{-224743.362,-19374.428,10.000,0.000},
				{-226680.805,-19374.428,10.000,0.000},
				{-228617.769,-19364.856,10.000,0.000},
				{-230553.223,-19344.212,10.000,0.000},
				{-232486.058,-19312.498,10.000,0.000},
				{-234415.169,-19269.712,10.000,0.000},
				{-236339.447,-19215.856,10.000,0.000},
				{-238257.786,-19150.928,10.000,0.000},
				{-240169.079,-19074.929,10.000,0.000},
				{-242072.219,-18987.859,10.000,0.000},
				{-243966.097,-18889.718,10.000,0.000},
				{-245849.609,-18780.506,10.000,0.000},
				{-247721.645,-18660.223,10.000,0.000},
				{-249581.100,-18528.869,10.000,0.000},
				{-251426.865,-18386.443,10.000,0.000},
				{-253257.835,-18232.947,10.000,-0.026},
				{-255073.380,-18077.951,10.000,-0.138},
				{-256873.425,-17922.956,10.000,-0.334},
				{-258657.971,-17767.960,10.000,-0.611},
				{-260427.017,-17612.965,10.000,-0.965},
				{-262180.564,-17457.970,10.000,-1.398},
				{-263918.611,-17302.974,10.000,-1.907},
				{-265641.159,-17147.979,10.000,-2.496},
				{-267348.207,-16992.983,10.000,-3.165},
				{-269039.755,-16837.988,10.000,-3.916},
				{-270715.804,-16682.993,10.000,-4.753},
				{-272376.354,-16527.997,10.000,-5.679},
				{-274021.404,-16373.002,10.000,-6.700},
				{-275650.954,-16218.006,10.000,-7.818},
				{-277265.005,-16063.011,10.000,-9.041},
				{-278863.556,-15908.015,10.000,-10.374},
				{-280446.608,-15753.020,10.000,-11.822},
				{-282014.160,-15598.025,10.000,-13.392},
				{-283566.213,-15443.029,10.000,-15.088},
				{-285102.766,-15288.034,10.000,-16.916},
				{-286623.820,-15133.038,10.000,-18.880},
				{-288129.374,-14978.043,10.000,-20.980},
				{-289619.428,-14823.047,10.000,-23.216},
				{-291093.983,-14668.052,10.000,-25.586},
				{-292553.039,-14513.057,10.000,-28.080},
				{-293996.595,-14358.061,10.000,-30.687},
				{-295424.651,-14203.066,10.000,-33.391},
				{-296837.208,-14048.070,10.000,-36.171},
				{-298234.265,-13893.075,10.000,-39.002},
				{-299615.823,-13738.079,10.000,-41.858},
				{-300981.881,-13583.084,10.000,-44.709},
				{-302332.440,-13428.089,10.000,-47.526},
				{-303667.499,-13273.093,10.000,-50.284},
				{-304987.058,-13118.098,10.000,-52.959},
				{-306291.118,-12963.102,10.000,-55.531},
				{-307579.679,-12808.107,10.000,-57.985},
				{-308852.740,-12653.112,10.000,-60.312},
				{-310110.301,-12498.116,10.000,-62.505},
				{-311352.363,-12343.121,10.000,-64.563},
				{-312578.925,-12188.125,10.000,-66.486},
				{-313789.988,-12033.130,10.000,-68.278},
				{-314985.551,-11878.134,10.000,-69.943},
				{-316165.615,-11723.139,10.000,-71.488},
				{-317330.179,-11568.144,10.000,-72.919},
				{-318479.244,-11413.148,10.000,-74.243},
				{-319612.809,-11258.153,10.000,-75.467},
				{-320730.874,-11103.157,10.000,-76.599},
				{-321833.440,-10948.162,10.000,-77.646},
				{-322920.507,-10793.166,10.000,-78.613},
				{-323992.073,-10638.171,10.000,-79.506},
				{-325048.141,-10483.176,10.000,-80.332},
				{-326088.709,-10328.180,10.000,-81.095},
				{-327113.777,-10173.185,10.000,-81.801},
				{-328123.346,-10018.189,10.000,-82.454},
				{-329117.415,-9863.194,10.000,-83.057},
				{-330095.984,-9708.199,10.000,-83.616},
				{-331059.054,-9553.203,10.000,-84.132},
				{-332006.625,-9398.208,10.000,-84.610},
				{-332938.696,-9243.212,10.000,-85.051},
				{-333855.267,-9088.217,10.000,-85.460},
				{-334756.339,-8933.221,10.000,-85.838},
				{-335641.912,-8778.226,10.000,-86.187},
				{-336511.984,-8623.231,10.000,-86.510},
				{-337366.558,-8468.235,10.000,-86.809},
				{-338205.632,-8313.240,10.000,-87.085},
				{-339029.206,-8158.244,10.000,-87.339},
				{-339837.280,-8003.249,10.000,-87.574},
				{-340629.855,-7848.253,10.000,-87.791},
				{-341406.931,-7693.258,10.000,-87.991},
				{-342168.507,-7538.263,10.000,-88.175},
				{-342914.584,-7383.267,10.000,-88.345},
				{-343645.161,-7228.272,10.000,-88.501},
				{-344360.238,-7073.276,10.000,-88.644},
				{-345059.816,-6918.281,10.000,-88.775},
				{-345743.894,-6763.285,10.000,-88.896},
				{-346412.473,-6608.290,10.000,-89.006},
				{-347065.552,-6453.295,10.000,-89.107},
				{-347703.132,-6298.299,10.000,-89.199},
				{-348325.212,-6143.304,10.000,-89.283},
				{-348931.793,-5988.308,10.000,-89.360},
				{-349522.874,-5833.313,10.000,-89.429},
				{-350098.455,-5678.318,10.000,-89.493},
				{-350658.537,-5523.322,10.000,-89.550},
				{-351203.120,-5368.327,10.000,-89.602},
				{-351732.203,-5213.331,10.000,-89.648},
				{-352245.786,-5058.336,10.000,-89.690},
				{-352743.870,-4903.340,10.000,-89.728},
				{-353226.454,-4748.345,10.000,-89.762},
				{-353693.539,-4593.350,10.000,-89.792},
				{-354145.124,-4438.354,10.000,-89.819},
				{-354581.210,-4283.359,10.000,-89.843},
				{-355001.796,-4128.363,10.000,-89.864},
				{-355406.882,-3973.368,10.000,-89.883},
				{-355796.469,-3818.372,10.000,-89.899},
				{-356170.557,-3663.377,10.000,-89.913},
				{-356529.145,-3508.382,10.000,-89.926},
				{-356872.233,-3353.386,10.000,-89.937},
				{-357199.822,-3198.391,10.000,-89.946},
				{-357511.911,-3043.395,10.000,-89.954},
				{-357808.501,-2888.400,10.000,-89.961},
				{-358089.591,-2733.405,10.000,-89.966},
				{-358355.182,-2578.409,10.000,-89.971},
				{-358605.273,-2423.414,10.000,-89.975},
				{-358839.865,-2268.418,10.000,-89.979},
				{-359058.957,-2113.423,10.000,-89.981},
				{-359262.549,-1958.427,10.000,-89.983},
				{-359450.642,-1803.432,10.000,-89.985},
				{-359623.236,-1648.437,10.000,-89.986},
				{-359780.329,-1493.441,10.000,-89.988},
				{-359921.924,-1338.446,10.000,-89.988},
				{-360048.019,-1183.450,10.000,-89.989},
				{-360158.614,-1028.455,10.000,-89.989},
				{-360254.188,-883.032,10.000,-89.990},
				{-360335.774,-748.680,10.000,-89.990},
				{-360404.478,-625.399,10.000,-89.990},
				{-360461.407,-513.189,10.000,-89.990},
				{-360507.669,-412.050,10.000,-89.990},
				{-360544.370,-321.982,10.000,-89.990},
				{-360572.619,-242.985,10.000,-89.990},
				{-360593.521,-175.060,10.000,-89.990},
				{-360608.184,-118.206,10.000,-89.990},
				{-360617.716,-72.422,10.000,-89.990},
				{-360623.222,-37.710,10.000,-89.990},
				{-360625.811,-14.069,10.000,-89.990},
				{-360626.590,-1.499,10.000,-89.990},
				{-360626.665,-0.000,10.000,-89.990},
				{-360626.665,-0.000,10.000,-89.990}		};

}