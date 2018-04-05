package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (10.00,9.08,0.00)
	// (3.63,13.08,0.00)
	
    public CenterToRightSwitchPt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchPt2Arc(boolean flipped) {
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
				{-157.763,-498.200,10.000,-0.001},
				{-213.119,-608.911,10.000,-0.001},
				{-280.099,-730.693,10.000,-0.002},
				{-359.811,-863.546,10.000,-0.003},
				{-453.362,-1007.470,10.000,-0.005},
				{-561.858,-1162.466,10.000,-0.008},
				{-685.855,-1317.461,10.000,-0.012},
				{-825.351,-1472.457,10.000,-0.018},
				{-980.346,-1627.452,10.000,-0.025},
				{-1150.841,-1782.447,10.000,-0.034},
				{-1336.836,-1937.443,10.000,-0.046},
				{-1538.330,-2092.438,10.000,-0.061},
				{-1755.323,-2247.434,10.000,-0.079},
				{-1987.816,-2402.429,10.000,-0.101},
				{-2235.809,-2557.424,10.000,-0.127},
				{-2499.301,-2712.420,10.000,-0.159},
				{-2778.293,-2867.415,10.000,-0.196},
				{-3072.784,-3022.411,10.000,-0.239},
				{-3382.775,-3177.406,10.000,-0.289},
				{-3708.265,-3332.402,10.000,-0.346},
				{-4049.255,-3487.397,10.000,-0.411},
				{-4405.745,-3642.392,10.000,-0.486},
				{-4777.734,-3797.388,10.000,-0.569},
				{-5165.222,-3952.383,10.000,-0.663},
				{-5568.211,-4107.379,10.000,-0.769},
				{-5986.698,-4262.374,10.000,-0.886},
				{-6420.685,-4417.370,10.000,-1.016},
				{-6870.172,-4572.365,10.000,-1.160},
				{-7335.158,-4727.360,10.000,-1.318},
				{-7815.644,-4882.356,10.000,-1.492},
				{-8311.630,-5037.351,10.000,-1.683},
				{-8823.114,-5192.347,10.000,-1.892},
				{-9350.099,-5347.342,10.000,-2.119},
				{-9892.583,-5502.337,10.000,-2.366},
				{-10450.566,-5657.333,10.000,-2.634},
				{-11024.049,-5812.328,10.000,-2.924},
				{-11613.032,-5967.324,10.000,-3.237},
				{-12217.514,-6122.319,10.000,-3.575},
				{-12837.496,-6277.315,10.000,-3.939},
				{-13472.977,-6432.310,10.000,-4.331},
				{-14123.958,-6587.305,10.000,-4.751},
				{-14790.438,-6742.301,10.000,-5.201},
				{-15472.418,-6897.296,10.000,-5.683},
				{-16169.897,-7052.292,10.000,-6.198},
				{-16882.876,-7207.287,10.000,-6.748},
				{-17611.355,-7362.283,10.000,-7.334},
				{-18355.333,-7517.278,10.000,-7.959},
				{-19114.810,-7672.273,10.000,-8.622},
				{-19889.788,-7827.269,10.000,-9.327},
				{-20680.264,-7982.264,10.000,-10.074},
				{-21486.240,-8137.260,10.000,-10.865},
				{-22307.716,-8292.255,10.000,-11.702},
				{-23144.691,-8447.251,10.000,-12.585},
				{-23997.166,-8602.246,10.000,-13.517},
				{-24865.141,-8757.241,10.000,-14.496},
				{-25748.615,-8912.237,10.000,-15.525},
				{-26647.588,-9067.232,10.000,-16.604},
				{-27562.061,-9222.228,10.000,-17.732},
				{-28492.034,-9377.223,10.000,-18.909},
				{-29437.506,-9532.218,10.000,-20.135},
				{-30398.477,-9687.214,10.000,-21.407},
				{-31374.948,-9842.209,10.000,-22.724},
				{-32366.919,-9997.205,10.000,-24.084},
				{-33374.389,-10152.200,10.000,-25.482},
				{-34397.359,-10307.196,10.000,-26.914},
				{-35435.828,-10462.191,10.000,-28.378},
				{-36489.797,-10617.186,10.000,-29.866},
				{-37558.712,-10761.111,10.000,-31.373},
				{-38641.466,-10893.964,10.000,-32.891},
				{-39736.951,-11015.746,10.000,-34.413},
				{-40844.062,-11126.457,10.000,-35.930},
				{-41961.689,-11226.097,10.000,-37.434},
				{-43088.727,-11314.666,10.000,-38.917},
				{-44224.069,-11392.164,10.000,-40.374},
				{-45366.607,-11458.590,10.000,-41.796},
				{-46515.233,-11513.946,10.000,-43.179},
				{-47668.842,-11558.230,10.000,-44.518},
				{-48826.326,-11591.443,10.000,-45.807},
				{-49986.577,-11613.586,10.000,-47.043},
				{-51148.489,-11624.657,10.000,-48.224},
				{-52310.955,-11624.657,10.000,-49.348},
				{-53473.421,-11624.657,10.000,-50.413},
				{-54635.886,-11624.657,10.000,-51.421},
				{-55798.352,-11624.657,10.000,-52.371},
				{-56960.818,-11624.657,10.000,-53.264},
				{-58123.283,-11624.657,10.000,-54.102},
				{-59285.749,-11624.657,10.000,-54.884},
				{-60448.215,-11624.657,10.000,-55.613},
				{-61610.680,-11624.657,10.000,-56.290},
				{-62773.146,-11624.657,10.000,-56.915},
				{-63935.612,-11624.657,10.000,-57.490},
				{-65098.077,-11624.657,10.000,-58.016},
				{-66260.543,-11624.657,10.000,-58.495},
				{-67423.009,-11624.657,10.000,-58.927},
				{-68585.474,-11624.657,10.000,-59.314},
				{-69747.940,-11624.657,10.000,-59.656},
				{-70910.406,-11624.657,10.000,-59.955},
				{-72072.871,-11624.657,10.000,-60.210},
				{-73235.337,-11624.657,10.000,-60.423},
				{-74397.803,-11624.657,10.000,-60.595},
				{-75560.268,-11624.657,10.000,-60.725},
				{-76722.734,-11624.657,10.000,-60.815},
				{-77885.200,-11624.657,10.000,-60.864},
				{-79047.665,-11624.657,10.000,-60.872},
				{-80210.131,-11624.657,10.000,-60.840},
				{-81372.597,-11624.657,10.000,-60.767},
				{-82535.062,-11624.657,10.000,-60.654},
				{-83697.528,-11624.657,10.000,-60.499},
				{-84859.994,-11624.657,10.000,-60.303},
				{-86022.459,-11624.657,10.000,-60.065},
				{-87184.925,-11624.657,10.000,-59.785},
				{-88347.391,-11624.657,10.000,-59.461},
				{-89509.856,-11624.657,10.000,-59.092},
				{-90672.322,-11624.657,10.000,-58.679},
				{-91834.788,-11624.657,10.000,-58.220},
				{-92997.253,-11624.657,10.000,-57.713},
				{-94159.719,-11624.657,10.000,-57.158},
				{-95322.185,-11624.657,10.000,-56.554},
				{-96484.650,-11624.657,10.000,-55.899},
				{-97647.116,-11624.657,10.000,-55.192},
				{-98809.582,-11624.657,10.000,-54.432},
				{-99972.047,-11624.657,10.000,-53.617},
				{-101134.513,-11624.657,10.000,-52.747},
				{-102296.979,-11624.657,10.000,-51.821},
				{-103459.444,-11624.657,10.000,-50.837},
				{-104621.910,-11624.657,10.000,-49.795},
				{-105784.376,-11624.657,10.000,-48.695},
				{-106946.517,-11618.161,10.000,-47.538},
				{-108107.454,-11600.594,10.000,-46.324},
				{-109266.082,-11571.956,10.000,-45.057},
				{-110421.292,-11532.246,10.000,-43.739},
				{-111571.977,-11481.466,10.000,-42.374},
				{-112717.032,-11419.615,10.000,-40.967},
				{-113855.347,-11346.692,10.000,-39.524},
				{-114985.816,-11262.698,10.000,-38.051},
				{-116107.333,-11167.634,10.000,-36.555},
				{-117218.790,-11061.498,10.000,-35.042},
				{-118319.079,-10944.291,10.000,-33.522},
				{-119407.094,-10816.013,10.000,-32.002},
				{-120481.728,-10676.664,10.000,-30.489},
				{-121541.873,-10526.243,10.000,-28.993},
				{-122586.748,-10371.248,10.000,-27.518},
				{-123616.123,-10216.253,10.000,-26.072},
				{-124629.998,-10061.257,10.000,-24.659},
				{-125628.374,-9906.262,10.000,-23.284},
				{-126611.251,-9751.266,10.000,-21.949},
				{-127578.628,-9596.271,10.000,-20.658},
				{-128530.505,-9441.275,10.000,-19.413},
				{-129466.883,-9286.280,10.000,-18.215},
				{-130387.761,-9131.285,10.000,-17.066},
				{-131293.140,-8976.289,10.000,-15.967},
				{-132183.019,-8821.294,10.000,-14.918},
				{-133057.398,-8666.298,10.000,-13.918},
				{-133916.279,-8511.303,10.000,-12.966},
				{-134759.659,-8356.308,10.000,-12.063},
				{-135587.540,-8201.312,10.000,-11.208},
				{-136399.921,-8046.317,10.000,-10.398},
				{-137196.803,-7891.321,10.000,-9.632},
				{-137978.186,-7736.326,10.000,-8.910},
				{-138744.069,-7581.330,10.000,-8.230},
				{-139494.452,-7426.335,10.000,-7.589},
				{-140229.336,-7271.340,10.000,-6.987},
				{-140948.720,-7116.344,10.000,-6.423},
				{-141652.604,-6961.349,10.000,-5.893},
				{-142340.989,-6806.353,10.000,-5.398},
				{-143013.875,-6651.358,10.000,-4.934},
				{-143671.261,-6496.362,10.000,-4.502},
				{-144313.148,-6341.367,10.000,-4.099},
				{-144939.534,-6186.372,10.000,-3.723},
				{-145550.422,-6031.376,10.000,-3.375},
				{-146145.810,-5876.381,10.000,-3.051},
				{-146725.698,-5721.385,10.000,-2.752},
				{-147290.087,-5566.390,10.000,-2.475},
				{-147838.976,-5411.395,10.000,-2.219},
				{-148372.366,-5256.399,10.000,-1.984},
				{-148890.256,-5101.404,10.000,-1.768},
				{-149392.646,-4946.408,10.000,-1.570},
				{-149879.537,-4791.413,10.000,-1.389},
				{-150350.929,-4636.417,10.000,-1.224},
				{-150806.821,-4481.422,10.000,-1.074},
				{-151247.213,-4326.427,10.000,-0.939},
				{-151672.106,-4171.431,10.000,-0.816},
				{-152081.500,-4016.436,10.000,-0.706},
				{-152475.393,-3861.440,10.000,-0.607},
				{-152853.788,-3706.445,10.000,-0.519},
				{-153216.682,-3551.449,10.000,-0.441},
				{-153564.078,-3396.454,10.000,-0.372},
				{-153895.973,-3241.459,10.000,-0.312},
				{-154212.369,-3086.463,10.000,-0.259},
				{-154513.266,-2931.468,10.000,-0.213},
				{-154798.663,-2776.472,10.000,-0.174},
				{-155068.560,-2621.477,10.000,-0.140},
				{-155322.958,-2466.481,10.000,-0.112},
				{-155561.857,-2311.486,10.000,-0.088},
				{-155785.255,-2156.491,10.000,-0.068},
				{-155993.155,-2001.495,10.000,-0.052},
				{-156185.554,-1846.500,10.000,-0.039},
				{-156362.455,-1691.504,10.000,-0.029},
				{-156523.855,-1536.509,10.000,-0.020},
				{-156669.756,-1381.514,10.000,-0.014},
				{-156800.158,-1226.518,10.000,-0.010},
				{-156915.060,-1071.523,10.000,-0.006},
				{-157014.787,-923.023,10.000,-0.004},
				{-157100.218,-785.595,10.000,-0.003},
				{-157172.460,-659.238,10.000,-0.002},
				{-157232.619,-543.951,10.000,-0.001},
				{-157281.804,-439.736,10.000,-0.000},
				{-157321.120,-346.592,10.000,-0.000},
				{-157351.676,-264.519,10.000,-0.000},
				{-157374.578,-193.518,10.000,-0.000},
				{-157390.933,-133.587,10.000,-0.000},
				{-157401.848,-84.727,10.000,-0.000},
				{-157408.432,-46.939,10.000,-0.000},
				{-157411.790,-20.221,10.000,-0.000},
				{-157413.030,-4.575,10.000,-0.000},
				{-157413.258,-0.000,10.000,0.000},
				{-157413.258,-0.000,10.000,0.000}		};

}