package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class TripleCubeRightSwitchToFirstCubePt1Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (10.00,9.08,0.00)
	// (3.63,13.08,0.00)
	
    public TripleCubeRightSwitchToFirstCubePt1Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TripleCubeRightSwitchToFirstCubePt1Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.427,-8.545,10.000,-0.000},
				{-2.136,-25.635,10.000,-0.000},
				{-5.982,-51.270,10.000,-0.000},
				{-12.818,-85.450,10.000,-0.000},
				{-23.499,-128.175,10.000,-0.000},
				{-38.880,-179.446,10.000,-0.000},
				{-59.815,-239.261,10.000,-0.000},
				{-87.159,-307.621,10.000,-0.000},
				{-121.767,-384.526,10.000,-0.001},
				{-164.492,-469.976,10.000,-0.001},
				{-216.189,-563.972,10.000,-0.002},
				{-277.713,-666.512,10.000,-0.003},
				{-349.919,-777.597,10.000,-0.005},
				{-433.660,-897.228,10.000,-0.008},
				{-529.364,-1016.858,10.000,-0.012},
				{-637.032,-1136.488,10.000,-0.018},
				{-756.662,-1256.119,10.000,-0.025},
				{-888.255,-1375.749,10.000,-0.034},
				{-1031.812,-1495.379,10.000,-0.046},
				{-1187.331,-1615.010,10.000,-0.060},
				{-1354.814,-1734.640,10.000,-0.079},
				{-1534.259,-1854.270,10.000,-0.100},
				{-1725.668,-1973.901,10.000,-0.127},
				{-1929.039,-2093.531,10.000,-0.158},
				{-2144.374,-2213.161,10.000,-0.195},
				{-2371.671,-2332.792,10.000,-0.238},
				{-2610.932,-2452.422,10.000,-0.287},
				{-2862.156,-2572.052,10.000,-0.344},
				{-3125.343,-2691.683,10.000,-0.409},
				{-3400.492,-2811.313,10.000,-0.483},
				{-3687.605,-2930.943,10.000,-0.566},
				{-3986.681,-3050.574,10.000,-0.660},
				{-4297.720,-3170.204,10.000,-0.765},
				{-4620.722,-3289.834,10.000,-0.881},
				{-4955.687,-3409.465,10.000,-1.011},
				{-5302.615,-3529.095,10.000,-1.154},
				{-5661.506,-3648.725,10.000,-1.312},
				{-6032.360,-3768.356,10.000,-1.485},
				{-6415.177,-3887.986,10.000,-1.675},
				{-6809.957,-4007.616,10.000,-1.882},
				{-7216.700,-4127.247,10.000,-2.108},
				{-7635.406,-4246.877,10.000,-2.353},
				{-8066.075,-4366.507,10.000,-2.620},
				{-8508.708,-4486.138,10.000,-2.908},
				{-8963.303,-4605.768,10.000,-3.220},
				{-9429.861,-4725.398,10.000,-3.557},
				{-9908.383,-4845.029,10.000,-3.919},
				{-10398.867,-4964.659,10.000,-4.308},
				{-10901.314,-5084.289,10.000,-4.726},
				{-11415.725,-5203.920,10.000,-5.174},
				{-11942.098,-5323.550,10.000,-5.653},
				{-12480.435,-5443.180,10.000,-6.166},
				{-13030.734,-5562.811,10.000,-6.713},
				{-13592.997,-5682.441,10.000,-7.296},
				{-14167.223,-5802.071,10.000,-7.917},
				{-14753.411,-5921.702,10.000,-8.577},
				{-15351.563,-6041.332,10.000,-9.278},
				{-15961.678,-6160.962,10.000,-10.021},
				{-16583.755,-6280.593,10.000,-10.808},
				{-17217.796,-6400.223,10.000,-11.641},
				{-17863.800,-6519.853,10.000,-12.519},
				{-18521.767,-6639.484,10.000,-13.446},
				{-19191.697,-6759.114,10.000,-14.421},
				{-19873.590,-6878.744,10.000,-15.444},
				{-20567.446,-6998.375,10.000,-16.518},
				{-21273.265,-7118.005,10.000,-17.641},
				{-21991.047,-7237.635,10.000,-18.812},
				{-22720.792,-7357.266,10.000,-20.033},
				{-23462.500,-7476.896,10.000,-21.299},
				{-24216.171,-7596.526,10.000,-22.611},
				{-24981.805,-7716.157,10.000,-23.965},
				{-25759.402,-7835.787,10.000,-25.358},
				{-26548.962,-7955.417,10.000,-26.786},
				{-27350.486,-8075.048,10.000,-28.245},
				{-28163.972,-8194.678,10.000,-29.729},
				{-28989.421,-8314.308,10.000,-31.233},
				{-29826.834,-8433.939,10.000,-32.752},
				{-30676.209,-8553.569,10.000,-34.278},
				{-31537.548,-8673.199,10.000,-35.804},
				{-32410.849,-8792.830,10.000,-37.325},
				{-33296.113,-8912.460,10.000,-38.834},
				{-34193.341,-9032.090,10.000,-40.323},
				{-35102.532,-9151.721,10.000,-41.787},
				{-36023.685,-9271.351,10.000,-43.219},
				{-36956.802,-9390.981,10.000,-44.615},
				{-37901.881,-9510.612,10.000,-45.969},
				{-38858.924,-9630.242,10.000,-47.277},
				{-39827.930,-9749.872,10.000,-48.535},
				{-40808.899,-9869.503,10.000,-49.741},
				{-41801.830,-9989.133,10.000,-50.890},
				{-42806.725,-10108.763,10.000,-51.982},
				{-43823.583,-10228.394,10.000,-53.014},
				{-44852.404,-10348.024,10.000,-53.986},
				{-45893.188,-10467.654,10.000,-54.895},
				{-46945.508,-10578.740,10.000,-55.741},
				{-48008.509,-10681.280,10.000,-56.524},
				{-49081.336,-10775.275,10.000,-57.242},
				{-50163.136,-10860.726,10.000,-57.895},
				{-51253.054,-10937.631,10.000,-58.482},
				{-52350.235,-11005.991,10.000,-59.005},
				{-53453.825,-11065.806,10.000,-59.462},
				{-54562.969,-11117.076,10.000,-59.855},
				{-55676.813,-11159.801,10.000,-60.184},
				{-56794.502,-11193.982,10.000,-60.448},
				{-57915.182,-11219.617,10.000,-60.649},
				{-59037.998,-11236.707,10.000,-60.786},
				{-60162.096,-11245.252,10.000,-60.860},
				{-61286.622,-11245.252,10.000,-60.870},
				{-62410.861,-11239.532,10.000,-60.818},
				{-63534.101,-11225.267,10.000,-60.701},
				{-64655.487,-11202.457,10.000,-60.522},
				{-65774.165,-11171.101,10.000,-60.278},
				{-66889.280,-11131.201,10.000,-59.971},
				{-67999.978,-11082.756,10.000,-59.600},
				{-69105.404,-11025.766,10.000,-59.163},
				{-70204.704,-10960.231,10.000,-58.662},
				{-71297.023,-10886.151,10.000,-58.096},
				{-72381.507,-10803.525,10.000,-57.465},
				{-73457.301,-10712.355,10.000,-56.769},
				{-74523.550,-10612.640,10.000,-56.008},
				{-75579.401,-10504.380,10.000,-55.183},
				{-76623.999,-10387.574,10.000,-54.294},
				{-77656.775,-10267.944,10.000,-53.343},
				{-78677.588,-10148.314,10.000,-52.331},
				{-79686.438,-10028.683,10.000,-51.259},
				{-80683.324,-9909.053,10.000,-50.129},
				{-81668.248,-9789.423,10.000,-48.942},
				{-82641.209,-9669.792,10.000,-47.701},
				{-83602.207,-9550.162,10.000,-46.409},
				{-84551.241,-9430.532,10.000,-45.069},
				{-85488.313,-9310.901,10.000,-43.687},
				{-86413.422,-9191.271,10.000,-42.266},
				{-87326.567,-9071.641,10.000,-40.812},
				{-88227.750,-8952.010,10.000,-39.331},
				{-89116.969,-8832.380,10.000,-37.828},
				{-89994.226,-8712.750,10.000,-36.310},
				{-90859.519,-8593.119,10.000,-34.785},
				{-91712.850,-8473.489,10.000,-33.258},
				{-92554.217,-8353.859,10.000,-31.736},
				{-93383.621,-8234.228,10.000,-30.227},
				{-94201.063,-8114.598,10.000,-28.735},
				{-95006.541,-7994.968,10.000,-27.267},
				{-95800.056,-7875.337,10.000,-25.829},
				{-96581.608,-7755.707,10.000,-24.424},
				{-97351.197,-7636.077,10.000,-23.056},
				{-98108.824,-7516.446,10.000,-21.730},
				{-98854.487,-7396.816,10.000,-20.449},
				{-99588.187,-7277.186,10.000,-19.213},
				{-100309.924,-7157.555,10.000,-18.025},
				{-101019.698,-7037.925,10.000,-16.886},
				{-101717.509,-6918.295,10.000,-15.796},
				{-102403.357,-6798.664,10.000,-14.756},
				{-103077.242,-6679.034,10.000,-13.765},
				{-103739.163,-6559.404,10.000,-12.822},
				{-104389.122,-6439.773,10.000,-11.928},
				{-105027.118,-6320.143,10.000,-11.080},
				{-105653.151,-6200.512,10.000,-10.278},
				{-106267.221,-6080.882,10.000,-9.521},
				{-106869.327,-5961.252,10.000,-8.806},
				{-107459.471,-5841.621,10.000,-8.132},
				{-108037.652,-5721.991,10.000,-7.498},
				{-108603.869,-5602.361,10.000,-6.903},
				{-109158.124,-5482.730,10.000,-6.344},
				{-109700.415,-5363.100,10.000,-5.820},
				{-110230.744,-5243.470,10.000,-5.330},
				{-110749.109,-5123.839,10.000,-4.872},
				{-111255.512,-5004.209,10.000,-4.444},
				{-111749.951,-4884.579,10.000,-4.045},
				{-112232.427,-4764.948,10.000,-3.674},
				{-112702.941,-4645.318,10.000,-3.330},
				{-113161.491,-4525.688,10.000,-3.010},
				{-113608.078,-4406.057,10.000,-2.714},
				{-114042.703,-4286.427,10.000,-2.440},
				{-114465.364,-4166.797,10.000,-2.187},
				{-114876.062,-4047.166,10.000,-1.955},
				{-115274.797,-3927.536,10.000,-1.742},
				{-115661.569,-3807.906,10.000,-1.546},
				{-116036.378,-3688.275,10.000,-1.368},
				{-116399.224,-3568.645,10.000,-1.205},
				{-116750.107,-3449.015,10.000,-1.057},
				{-117089.027,-3329.384,10.000,-0.923},
				{-117415.984,-3209.754,10.000,-0.802},
				{-117730.978,-3090.124,10.000,-0.694},
				{-118034.009,-2970.493,10.000,-0.597},
				{-118325.077,-2850.863,10.000,-0.510},
				{-118604.181,-2731.233,10.000,-0.433},
				{-118871.323,-2611.602,10.000,-0.365},
				{-119126.502,-2491.972,10.000,-0.305},
				{-119369.718,-2372.342,10.000,-0.254},
				{-119600.970,-2252.711,10.000,-0.209},
				{-119820.260,-2133.081,10.000,-0.170},
				{-120027.586,-2013.451,10.000,-0.137},
				{-120222.950,-1893.820,10.000,-0.109},
				{-120406.351,-1774.190,10.000,-0.085},
				{-120577.788,-1654.560,10.000,-0.066},
				{-120737.262,-1534.929,10.000,-0.050},
				{-120884.774,-1415.299,10.000,-0.038},
				{-121020.322,-1295.669,10.000,-0.028},
				{-121143.908,-1176.038,10.000,-0.020},
				{-121255.530,-1056.408,10.000,-0.014},
				{-121355.189,-936.778,10.000,-0.009},
				{-121442.885,-817.147,10.000,-0.006},
				{-121518.905,-703.237,10.000,-0.004},
				{-121583.960,-597.872,10.000,-0.002},
				{-121638.906,-501.051,10.000,-0.001},
				{-121684.598,-412.776,10.000,-0.001},
				{-121721.889,-333.046,10.000,-0.000},
				{-121751.634,-261.861,10.000,-0.000},
				{-121774.688,-199.221,10.000,-0.000},
				{-121791.905,-145.125,10.000,-0.000},
				{-121804.141,-99.575,10.000,-0.000},
				{-121812.248,-62.570,10.000,-0.000},
				{-121817.082,-34.110,10.000,-0.000},
				{-121819.497,-14.195,10.000,-0.000},
				{-121820.348,-2.825,10.000,-0.000},
				{-121820.489,-0.000,10.000,0.000},
				{-121820.489,-0.000,10.000,0.000}		};

}