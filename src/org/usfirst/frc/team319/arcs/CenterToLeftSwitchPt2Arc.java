package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (10.00,18.08,0.00)
	// (3.63,13.08,0.00)
	
    public CenterToLeftSwitchPt2Arc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftSwitchPt2Arc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{-0.445,-8.895,10.000,0.000},
				{-2.224,-17.789,10.000,0.000},
				{-6.227,-40.028,10.000,0.000},
				{-13.343,-71.169,10.000,0.000},
				{-24.465,-111.219,10.000,0.000},
				{-40.485,-160.195,10.000,0.000},
				{-62.297,-218.118,10.000,0.000},
				{-90.799,-285.019,10.000,0.000},
				{-126.892,-360.937,10.000,0.001},
				{-171.485,-445.924,10.000,0.001},
				{-225.489,-540.045,10.000,0.002},
				{-289.827,-643.378,10.000,0.003},
				{-365.428,-756.014,10.000,0.005},
				{-453.235,-878.064,10.000,0.007},
				{-554.200,-1009.653,10.000,0.011},
				{-669.293,-1150.927,10.000,0.016},
				{-799.498,-1302.048,10.000,0.022},
				{-945.818,-1463.200,10.000,0.031},
				{-1109.276,-1634.588,10.000,0.043},
				{-1290.920,-1816.437,10.000,0.057},
				{-1491.364,-2004.435,10.000,0.076},
				{-1710.784,-2194.207,10.000,0.100},
				{-1949.374,-2385.900,10.000,0.129},
				{-2207.340,-2579.659,10.000,0.164},
				{-2484.903,-2775.626,10.000,0.206},
				{-2782.297,-2973.945,10.000,0.257},
				{-3099.773,-3174.758,10.000,0.316},
				{-3437.594,-3378.209,10.000,0.386},
				{-3796.039,-3584.446,10.000,0.466},
				{-4175.401,-3793.619,10.000,0.559},
				{-4575.989,-4005.884,10.000,0.666},
				{-4998.129,-4221.403,10.000,0.788},
				{-5442.164,-4440.348,10.000,0.925},
				{-5908.454,-4662.901,10.000,1.081},
				{-6397.380,-4889.254,10.000,1.255},
				{-6909.341,-5119.616,10.000,1.450},
				{-7444.762,-5354.209,10.000,1.668},
				{-8004.089,-5593.275,10.000,1.910},
				{-8587.797,-5837.076,10.000,2.177},
				{-9196.387,-6085.895,10.000,2.473},
				{-9830.391,-6340.040,10.000,2.799},
				{-10490.375,-6599.843,10.000,3.157},
				{-11176.941,-6865.665,10.000,3.550},
				{-11890.730,-7137.891,10.000,3.980},
				{-12632.424,-7416.936,10.000,4.450},
				{-13402.748,-7703.241,10.000,4.963},
				{-14202.475,-7997.270,10.000,5.522},
				{-15032.426,-8299.505,10.000,6.129},
				{-15893.470,-8610.443,10.000,6.790},
				{-16786.528,-8930.581,10.000,7.506},
				{-17712.000,-9254.721,10.000,8.282},
				{-18669.729,-9577.288,10.000,9.120},
				{-19659.537,-9898.078,10.000,10.024},
				{-20681.210,-10216.734,10.000,10.995},
				{-21734.482,-10532.716,10.000,12.037},
				{-22819.007,-10845.256,10.000,13.151},
				{-23934.340,-11153.322,10.000,14.339},
				{-25079.897,-11455.572,10.000,15.603},
				{-26254.929,-11750.323,10.000,16.943},
				{-27458.481,-12035.523,10.000,18.358},
				{-28689.356,-12308.745,10.000,19.849},
				{-29946.075,-12567.194,10.000,21.411},
				{-31226.851,-12807.757,10.000,23.042},
				{-32529.559,-13027.078,10.000,24.736},
				{-33851.726,-13221.677,10.000,26.488},
				{-35190.536,-13388.097,10.000,28.290},
				{-36542.845,-13523.091,10.000,30.133},
				{-37905.226,-13623.811,10.000,32.007},
				{-39274.027,-13688.001,10.000,33.902},
				{-40645.442,-13714.156,10.000,35.804},
				{-42016.291,-13708.486,10.000,37.705},
				{-43384.092,-13678.010,10.000,39.593},
				{-44746.449,-13623.571,10.000,41.460},
				{-46101.110,-13546.615,10.000,43.297},
				{-47446.020,-13449.095,10.000,45.095},
				{-48779.355,-13333.354,10.000,46.847},
				{-50099.554,-13201.985,10.000,48.547},
				{-51405.324,-13057.700,10.000,50.191},
				{-52695.645,-12903.209,10.000,51.773},
				{-53969.755,-12741.108,10.000,53.292},
				{-55227.136,-12573.810,10.000,54.744},
				{-56467.484,-12403.482,10.000,56.130},
				{-57690.686,-12232.018,10.000,57.447},
				{-58896.789,-12061.025,10.000,58.697},
				{-60085.972,-11891.830,10.000,59.880},
				{-61258.521,-11725.491,10.000,60.998},
				{-62414.804,-11562.827,10.000,62.051},
				{-63555.247,-11404.438,10.000,63.042},
				{-64680.321,-11250.740,10.000,63.972},
				{-65790.520,-11101.990,10.000,64.843},
				{-66886.352,-10958.312,10.000,65.658},
				{-67968.324,-10819.726,10.000,66.418},
				{-69036.940,-10686.163,10.000,67.125},
				{-70092.689,-10557.490,10.000,67.782},
				{-71136.041,-10433.518,10.000,68.389},
				{-72167.444,-10314.024,10.000,68.950},
				{-73187.319,-10198.754,10.000,69.464},
				{-74196.062,-10087.433,10.000,69.935},
				{-75194.040,-9979.777,10.000,70.364},
				{-76181.589,-9875.489,10.000,70.751},
				{-77159.016,-9774.273,10.000,71.098},
				{-78126.599,-9675.828,10.000,71.407},
				{-79084.585,-9579.856,10.000,71.677},
				{-80033.191,-9486.061,10.000,71.911},
				{-80972.606,-9394.149,10.000,72.108},
				{-81902.989,-9303.831,10.000,72.269},
				{-82824.471,-9214.819,10.000,72.396},
				{-83737.154,-9126.831,10.000,72.488},
				{-84641.112,-9039.586,10.000,72.545},
				{-85536.393,-8952.804,10.000,72.568},
				{-86423.014,-8866.209,10.000,72.557},
				{-87300.966,-8779.523,10.000,72.511},
				{-88170.213,-8692.468,10.000,72.432},
				{-89030.689,-8604.768,10.000,72.317},
				{-89882.304,-8516.141,10.000,72.168},
				{-90724.934,-8426.305,10.000,71.983},
				{-91558.431,-8334.974,10.000,71.762},
				{-92382.618,-8241.861,10.000,71.505},
				{-93197.285,-8146.672,10.000,71.209},
				{-94002.196,-8049.111,10.000,70.876},
				{-94797.084,-7948.883,10.000,70.502},
				{-95581.653,-7845.686,10.000,70.088},
				{-96355.575,-7739.221,10.000,69.632},
				{-97118.494,-7629.193,10.000,69.133},
				{-97870.025,-7515.312,10.000,68.589},
				{-98609.755,-7397.299,10.000,67.998},
				{-99337.245,-7274.893,10.000,67.358},
				{-100052.030,-7147.856,10.000,66.669},
				{-100753.629,-7015.989,10.000,65.927},
				{-101441.543,-6879.135,10.000,65.132},
				{-102115.263,-6737.203,10.000,64.280},
				{-102774.281,-6590.178,10.000,63.371},
				{-103418.095,-6438.147,10.000,62.401},
				{-104046.227,-6281.316,10.000,61.370},
				{-104658.231,-6120.045,10.000,60.275},
				{-105253.718,-5954.865,10.000,59.114},
				{-105832.369,-5786.516,10.000,57.888},
				{-106393.967,-5615.971,10.000,56.594},
				{-106938.413,-5444.463,10.000,55.232},
				{-107465.763,-5273.499,10.000,53.803},
				{-107976.250,-5104.875,10.000,52.307},
				{-108470.317,-4940.668,10.000,50.746},
				{-108948.638,-4783.210,10.000,49.123},
				{-109412.142,-4635.043,10.000,47.442},
				{-109862.027,-4498.849,10.000,45.707},
				{-110299.763,-4377.354,10.000,43.924},
				{-110727.083,-4273.208,10.000,42.100},
				{-111145.969,-4188.858,10.000,40.243},
				{-111558.610,-4126.407,10.000,38.361},
				{-111967.359,-4087.490,10.000,36.463},
				{-112374.676,-4073.167,10.000,34.560},
				{-112782.927,-4082.515,10.000,32.662},
				{-113194.241,-4113.140,10.000,30.780},
				{-113610.553,-4163.122,10.000,28.925},
				{-114033.598,-4230.449,10.000,27.108},
				{-114464.844,-4312.455,10.000,25.338},
				{-114905.445,-4406.011,10.000,23.623},
				{-115356.216,-4507.709,10.000,21.969},
				{-115817.622,-4614.060,10.000,20.383},
				{-116289.786,-4721.647,10.000,18.868},
				{-116772.513,-4827.263,10.000,17.426},
				{-117265.312,-4927.996,10.000,16.060},
				{-117767.441,-5021.289,10.000,14.770},
				{-118277.937,-5104.958,10.000,13.556},
				{-118795.657,-5177.196,10.000,12.416},
				{-119319.311,-5236.547,10.000,11.350},
				{-119847.499,-5281.874,10.000,10.355},
				{-120378.731,-5312.324,10.000,9.428},
				{-120911.459,-5327.281,10.000,8.567},
				{-121444.092,-5326.331,10.000,7.770},
				{-121975.014,-5309.220,10.000,7.033},
				{-122502.818,-5278.036,10.000,6.354},
				{-123026.453,-5236.351,10.000,5.728},
				{-123545.032,-5185.789,10.000,5.153},
				{-124057.717,-5126.846,10.000,4.624},
				{-124563.718,-5060.012,10.000,4.140},
				{-125062.294,-4985.758,10.000,3.696},
				{-125552.747,-4904.533,10.000,3.290},
				{-126034.423,-4816.762,10.000,2.920},
				{-126506.707,-4722.840,10.000,2.584},
				{-126969.021,-4623.137,10.000,2.278},
				{-127420.820,-4517.995,10.000,2.000},
				{-127861.593,-4407.731,10.000,1.750},
				{-128290.857,-4292.635,10.000,1.524},
				{-128708.154,-4172.977,10.000,1.321},
				{-129113.055,-4049.005,10.000,1.140},
				{-129505.150,-3920.950,10.000,0.978},
				{-129884.052,-3789.023,10.000,0.834},
				{-130249.395,-3653.423,10.000,0.707},
				{-130600.828,-3514.335,10.000,0.595},
				{-130938.021,-3371.934,10.000,0.498},
				{-131260.660,-3226.386,10.000,0.413},
				{-131568.445,-3077.848,10.000,0.339},
				{-131861.092,-2926.473,10.000,0.277},
				{-132138.333,-2772.409,10.000,0.223},
				{-132399.913,-2615.800,10.000,0.178},
				{-132645.592,-2456.792,10.000,0.140},
				{-132875.145,-2295.525,10.000,0.109},
				{-133088.359,-2132.142,10.000,0.084},
				{-133285.038,-1966.789,10.000,0.064},
				{-133464.999,-1799.610,10.000,0.048},
				{-133628.360,-1633.609,10.000,0.035},
				{-133775.694,-1473.346,10.000,0.025},
				{-133907.750,-1320.560,10.000,0.018},
				{-134025.297,-1175.462,10.000,0.012},
				{-134129.121,-1038.243,10.000,0.008},
				{-134220.028,-909.074,10.000,0.006},
				{-134298.839,-788.106,10.000,0.004},
				{-134366.386,-675.470,10.000,0.002},
				{-134423.514,-571.283,10.000,0.001},
				{-134471.079,-475.643,10.000,0.001},
				{-134509.942,-388.632,10.000,0.000},
				{-134540.974,-310.319,10.000,0.000},
				{-134565.050,-240.760,10.000,0.000},
				{-134583.050,-180.000,10.000,0.000},
				{-134595.857,-128.072,10.000,0.000},
				{-134604.357,-85.000,10.000,0.000},
				{-134609.437,-50.803,10.000,0.000},
				{-134611.986,-25.490,10.000,0.000},
				{-134612.893,-9.069,10.000,-0.000},
				{-134613.047,-1.540,10.000,-0.000},
				{-134613.047,-0.000,10.000,-0.000}		};

}