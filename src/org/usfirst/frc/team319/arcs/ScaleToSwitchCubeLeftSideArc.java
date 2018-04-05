package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ScaleToSwitchCubeLeftSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (24.13,17.65,-10.00)
	// (19.13,16.40,0.00)
	
    public ScaleToSwitchCubeLeftSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleToSwitchCubeLeftSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.553,11.067,10.000,-10.000},
				{2.767,33.200,10.000,-10.000},
				{7.747,66.401,10.000,-10.000},
				{16.600,110.668,10.000,-10.000},
				{30.434,166.002,10.000,-10.000},
				{50.354,232.402,10.000,-10.000},
				{77.467,309.870,10.000,-10.000},
				{112.881,398.404,10.000,-9.999},
				{157.701,498.005,10.000,-9.999},
				{213.035,608.672,10.000,-9.998},
				{279.989,730.407,10.000,-9.997},
				{359.670,863.208,10.000,-9.994},
				{453.184,1007.076,10.000,-9.991},
				{561.638,1162.011,10.000,-9.986},
				{685.586,1316.945,10.000,-9.980},
				{825.028,1471.880,10.000,-9.970},
				{979.962,1626.815,10.000,-9.958},
				{1150.391,1781.750,10.000,-9.943},
				{1336.312,1936.684,10.000,-9.923},
				{1537.727,2091.619,10.000,-9.898},
				{1754.636,2246.554,10.000,-9.868},
				{1987.038,2401.489,10.000,-9.832},
				{2234.934,2556.424,10.000,-9.788},
				{2498.323,2711.358,10.000,-9.736},
				{2777.206,2866.293,10.000,-9.675},
				{3071.582,3021.228,10.000,-9.604},
				{3381.451,3176.163,10.000,-9.523},
				{3706.814,3331.097,10.000,-9.429},
				{4047.671,3486.032,10.000,-9.323},
				{4404.020,3640.967,10.000,-9.202},
				{4775.864,3795.902,10.000,-9.066},
				{5163.201,3950.836,10.000,-8.915},
				{5566.031,4105.771,10.000,-8.745},
				{5984.355,4260.706,10.000,-8.558},
				{6418.172,4415.641,10.000,-8.350},
				{6867.483,4570.575,10.000,-8.122},
				{7332.287,4725.510,10.000,-7.871},
				{7812.585,4880.445,10.000,-7.597},
				{8308.376,5035.380,10.000,-7.299},
				{8819.661,5190.314,10.000,-6.974},
				{9346.439,5345.249,10.000,-6.623},
				{9888.711,5500.184,10.000,-6.243},
				{10446.476,5655.119,10.000,-5.834},
				{11019.735,5810.053,10.000,-5.394},
				{11608.487,5964.988,10.000,-4.922},
				{12212.732,6119.923,10.000,-4.418},
				{12832.471,6274.858,10.000,-3.879},
				{13467.704,6429.792,10.000,-3.305},
				{14118.430,6584.727,10.000,-2.696},
				{14784.649,6739.662,10.000,-2.050},
				{15466.362,6894.597,10.000,-1.367},
				{16163.569,7049.531,10.000,-0.646},
				{16876.268,7204.466,10.000,0.113},
				{17604.462,7359.401,10.000,0.909},
				{18348.149,7514.336,10.000,1.743},
				{19107.329,7669.271,10.000,2.614},
				{19882.003,7824.205,10.000,3.521},
				{20672.170,7979.140,10.000,4.463},
				{21477.831,8134.075,10.000,5.438},
				{22298.985,8289.010,10.000,6.445},
				{23135.633,8443.944,10.000,7.481},
				{23987.774,8598.879,10.000,8.542},
				{24855.409,8753.814,10.000,9.627},
				{25738.537,8908.749,10.000,10.730},
				{26637.158,9063.683,10.000,11.849},
				{27551.273,9218.618,10.000,12.979},
				{28480.882,9373.553,10.000,14.114},
				{29425.984,9528.488,10.000,15.251},
				{30386.579,9683.422,10.000,16.384},
				{31362.668,9838.357,10.000,17.508},
				{32354.251,9993.292,10.000,18.618},
				{33361.327,10148.227,10.000,19.708},
				{34383.896,10303.161,10.000,20.774},
				{35421.959,10458.096,10.000,21.810},
				{36475.515,10613.031,10.000,22.811},
				{37544.012,10756.899,10.000,23.773},
				{38626.342,10889.700,10.000,24.690},
				{39721.399,11011.435,10.000,25.559},
				{40828.075,11122.102,10.000,26.373},
				{41945.266,11221.703,10.000,27.131},
				{43071.863,11310.237,10.000,27.830},
				{44206.760,11387.705,10.000,28.466},
				{45348.850,11454.105,10.000,29.038},
				{46497.027,11509.439,10.000,29.544},
				{47650.185,11553.706,10.000,29.983},
				{48807.215,11586.907,10.000,30.354},
				{49967.013,11609.040,10.000,30.658},
				{51128.470,11620.107,10.000,30.892},
				{52290.096,11612.404,10.000,31.059},
				{53450.398,11593.635,10.000,31.157},
				{54608.269,11563.798,10.000,31.188},
				{55762.604,11522.895,10.000,31.152},
				{56912.295,11470.926,10.000,31.051},
				{58056.236,11407.889,10.000,30.885},
				{59193.319,11333.786,10.000,30.657},
				{60322.439,11248.616,10.000,30.367},
				{61442.489,11152.379,10.000,30.018},
				{62552.362,11045.075,10.000,29.613},
				{63650.951,10926.705,10.000,29.153},
				{64737.150,10797.268,10.000,28.641},
				{65809.851,10656.764,10.000,28.080},
				{66867.949,10505.193,10.000,27.475},
				{67910.721,10350.258,10.000,26.827},
				{68938.001,10195.323,10.000,26.142},
				{69949.786,10040.389,10.000,25.421},
				{70946.078,9885.454,10.000,24.669},
				{71926.877,9730.519,10.000,23.889},
				{72892.182,9575.584,10.000,23.085},
				{73841.994,9420.650,10.000,22.260},
				{74776.312,9265.715,10.000,21.419},
				{75695.137,9110.780,10.000,20.564},
				{76598.468,8955.845,10.000,19.701},
				{77486.306,8800.911,10.000,18.832},
				{78358.650,8645.976,10.000,17.962},
				{79215.501,8491.041,10.000,17.093},
				{80056.859,8336.106,10.000,16.230},
				{80882.722,8181.172,10.000,15.375},
				{81693.093,8026.237,10.000,14.532},
				{82487.970,7871.302,10.000,13.704},
				{83267.353,7716.367,10.000,12.893},
				{84031.243,7561.433,10.000,12.101},
				{84779.640,7406.498,10.000,11.331},
				{85512.543,7251.563,10.000,10.585},
				{86229.952,7096.628,10.000,9.863},
				{86931.868,6941.694,10.000,9.168},
				{87618.291,6786.759,10.000,8.501},
				{88289.220,6631.824,10.000,7.861},
				{88944.656,6476.889,10.000,7.251},
				{89584.598,6321.955,10.000,6.670},
				{90209.047,6167.020,10.000,6.118},
				{90818.002,6012.085,10.000,5.596},
				{91411.464,5857.150,10.000,5.103},
				{91989.432,5702.216,10.000,4.640},
				{92551.907,5547.281,10.000,4.205},
				{93098.888,5392.346,10.000,3.798},
				{93630.376,5237.411,10.000,3.418},
				{94146.371,5082.476,10.000,3.065},
				{94646.871,4927.542,10.000,2.738},
				{95131.879,4772.607,10.000,2.436},
				{95601.393,4617.672,10.000,2.158},
				{96055.413,4462.737,10.000,1.903},
				{96493.940,4307.803,10.000,1.670},
				{96916.974,4152.868,10.000,1.458},
				{97324.514,3997.933,10.000,1.266},
				{97716.560,3842.998,10.000,1.093},
				{98093.114,3688.064,10.000,0.938},
				{98454.173,3533.129,10.000,0.799},
				{98799.739,3378.194,10.000,0.676},
				{99129.812,3223.259,10.000,0.568},
				{99444.391,3068.325,10.000,0.473},
				{99743.477,2913.390,10.000,0.390},
				{100027.069,2758.455,10.000,0.318},
				{100295.168,2603.520,10.000,0.257},
				{100547.773,2448.586,10.000,0.205},
				{100784.885,2293.651,10.000,0.161},
				{101006.503,2138.716,10.000,0.125},
				{101212.628,1983.781,10.000,0.095},
				{101403.260,1828.847,10.000,0.071},
				{101578.398,1673.912,10.000,0.052},
				{101738.042,1518.977,10.000,0.037},
				{101882.193,1364.042,10.000,0.026},
				{102010.851,1209.108,10.000,0.018},
				{102124.015,1054.173,10.000,0.012},
				{102222.070,906.941,10.000,0.007},
				{102305.956,770.775,10.000,0.005},
				{102376.779,645.677,10.000,0.003},
				{102435.645,531.645,10.000,0.002},
				{102483.661,428.680,10.000,0.001},
				{102521.934,336.782,10.000,0.000},
				{102551.571,255.951,10.000,0.000},
				{102573.678,186.186,10.000,0.000},
				{102589.361,127.488,10.000,0.000},
				{102599.729,79.857,10.000,0.000},
				{102605.886,43.292,10.000,0.000},
				{102608.940,17.795,10.000,0.000},
				{102609.998,3.364,10.000,0.000},
				{102610.167,0.000,10.000,-0.000},
				{102610.167,0.000,10.000,-0.000}		};

}