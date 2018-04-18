package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SwitchCubeToScaleLeftSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (19.13,16.65,0.00)
	// (24.13,17.15,-15.00)
	
    public SwitchCubeToScaleLeftSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SwitchCubeToScaleLeftSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.426,-8.512,10.000,0.000},
				{-2.128,-25.537,10.000,0.000},
				{-5.959,-51.074,10.000,0.000},
				{-12.769,-85.124,10.000,0.000},
				{-23.409,-127.686,10.000,0.000},
				{-38.731,-178.760,10.000,0.000},
				{-59.587,-238.347,10.000,0.000},
				{-86.826,-306.446,10.000,0.000},
				{-121.302,-383.057,10.000,0.001},
				{-163.863,-468.181,10.000,0.002},
				{-215.363,-561.818,10.000,0.003},
				{-276.653,-663.966,10.000,0.005},
				{-348.582,-774.627,10.000,0.008},
				{-432.004,-893.801,10.000,0.012},
				{-527.342,-1012.974,10.000,0.017},
				{-634.598,-1132.147,10.000,0.025},
				{-753.772,-1251.321,10.000,0.035},
				{-884.863,-1370.494,10.000,0.048},
				{-1027.871,-1489.668,10.000,0.064},
				{-1182.796,-1608.841,10.000,0.085},
				{-1349.639,-1728.015,10.000,0.110},
				{-1528.399,-1847.188,10.000,0.140},
				{-1719.077,-1966.361,10.000,0.176},
				{-1921.671,-2085.535,10.000,0.219},
				{-2136.184,-2204.708,10.000,0.269},
				{-2362.613,-2323.882,10.000,0.327},
				{-2600.960,-2443.055,10.000,0.393},
				{-2851.224,-2562.229,10.000,0.469},
				{-3113.406,-2681.402,10.000,0.555},
				{-3387.504,-2800.575,10.000,0.652},
				{-3673.521,-2919.749,10.000,0.761},
				{-3971.454,-3038.922,10.000,0.881},
				{-4281.305,-3158.096,10.000,1.015},
				{-4603.073,-3277.269,10.000,1.162},
				{-4936.759,-3396.442,10.000,1.323},
				{-5282.362,-3515.616,10.000,1.500},
				{-5639.882,-3634.789,10.000,1.691},
				{-6009.320,-3753.963,10.000,1.899},
				{-6390.675,-3873.136,10.000,2.122},
				{-6783.947,-3992.310,10.000,2.363},
				{-7189.137,-4111.483,10.000,2.621},
				{-7606.244,-4230.656,10.000,2.896},
				{-8035.268,-4349.830,10.000,3.189},
				{-8476.209,-4469.003,10.000,3.499},
				{-8929.068,-4588.177,10.000,3.827},
				{-9393.845,-4707.350,10.000,4.173},
				{-9870.539,-4826.524,10.000,4.536},
				{-10359.150,-4945.697,10.000,4.917},
				{-10859.678,-5064.870,10.000,5.314},
				{-11372.124,-5184.044,10.000,5.727},
				{-11896.487,-5303.217,10.000,6.156},
				{-12432.767,-5422.391,10.000,6.600},
				{-12980.965,-5541.564,10.000,7.057},
				{-13541.080,-5660.737,10.000,7.528},
				{-14113.112,-5779.911,10.000,8.010},
				{-14697.062,-5899.084,10.000,8.502},
				{-15292.929,-6018.258,10.000,9.003},
				{-15900.714,-6137.431,10.000,9.511},
				{-16520.415,-6256.605,10.000,10.025},
				{-17152.034,-6375.778,10.000,10.542},
				{-17795.571,-6494.951,10.000,11.061},
				{-18451.025,-6614.125,10.000,11.580},
				{-19118.396,-6733.298,10.000,12.096},
				{-19797.684,-6852.472,10.000,12.608},
				{-20488.890,-6971.645,10.000,13.112},
				{-21192.013,-7090.818,10.000,13.607},
				{-21907.054,-7209.992,10.000,14.090},
				{-22634.012,-7329.165,10.000,14.559},
				{-23372.887,-7448.339,10.000,15.011},
				{-24123.680,-7567.512,10.000,15.444},
				{-24886.389,-7686.686,10.000,15.854},
				{-25661.017,-7805.859,10.000,16.240},
				{-26447.561,-7925.032,10.000,16.599},
				{-27246.023,-8044.206,10.000,16.928},
				{-28055.977,-8154.867,10.000,17.225},
				{-28876.571,-8257.016,10.000,17.486},
				{-29706.954,-8350.652,10.000,17.710},
				{-30546.276,-8435.776,10.000,17.893},
				{-31393.684,-8512.387,10.000,18.034},
				{-32248.327,-8580.486,10.000,18.130},
				{-33109.355,-8640.073,10.000,18.180},
				{-33975.916,-8691.147,10.000,18.182},
				{-34847.159,-8733.709,10.000,18.134},
				{-35722.233,-8767.759,10.000,18.036},
				{-36600.285,-8793.296,10.000,17.887},
				{-37480.466,-8810.321,10.000,17.686},
				{-38361.862,-8817.596,10.000,17.432},
				{-39243.134,-8807.846,10.000,17.125},
				{-40123.006,-8789.584,10.000,16.767},
				{-41000.625,-8762.809,10.000,16.358},
				{-41875.142,-8727.522,10.000,15.898},
				{-42745.704,-8683.723,10.000,15.389},
				{-43611.461,-8631.411,10.000,14.833},
				{-44471.561,-8570.587,10.000,14.232},
				{-45325.153,-8501.251,10.000,13.588},
				{-46171.385,-8423.402,10.000,12.903},
				{-47009.408,-8337.041,10.000,12.182},
				{-47838.368,-8242.167,10.000,11.427},
				{-48657.415,-8138.781,10.000,10.643},
				{-49465.699,-8026.883,10.000,9.833},
				{-50262.428,-7907.709,10.000,9.001},
				{-51047.240,-7788.536,10.000,8.153},
				{-51820.135,-7669.363,10.000,7.291},
				{-52581.113,-7550.189,10.000,6.419},
				{-53330.173,-7431.016,10.000,5.540},
				{-54067.316,-7311.842,10.000,4.660},
				{-54792.542,-7192.669,10.000,3.779},
				{-55505.850,-7073.495,10.000,2.903},
				{-56207.241,-6954.322,10.000,2.035},
				{-56896.714,-6835.149,10.000,1.176},
				{-57574.270,-6715.975,10.000,0.331},
				{-58239.909,-6596.802,10.000,-0.499},
				{-58893.631,-6477.628,10.000,-1.312},
				{-59535.435,-6358.455,10.000,-2.104},
				{-60165.322,-6239.282,10.000,-2.875},
				{-60783.291,-6120.108,10.000,-3.622},
				{-61389.343,-6000.935,10.000,-4.346},
				{-61983.478,-5881.761,10.000,-5.043},
				{-62565.696,-5762.588,10.000,-5.715},
				{-63135.996,-5643.414,10.000,-6.359},
				{-63694.379,-5524.241,10.000,-6.976},
				{-64240.844,-5405.068,10.000,-7.565},
				{-64775.392,-5285.894,10.000,-8.126},
				{-65298.023,-5166.721,10.000,-8.660},
				{-65808.736,-5047.547,10.000,-9.166},
				{-66307.532,-4928.374,10.000,-9.644},
				{-66794.411,-4809.201,10.000,-10.096},
				{-67269.372,-4690.027,10.000,-10.522},
				{-67732.417,-4570.854,10.000,-10.921},
				{-68183.543,-4451.680,10.000,-11.296},
				{-68622.753,-4332.507,10.000,-11.646},
				{-69050.045,-4213.333,10.000,-11.973},
				{-69465.419,-4094.160,10.000,-12.276},
				{-69868.877,-3974.987,10.000,-12.558},
				{-70260.417,-3855.813,10.000,-12.818},
				{-70640.039,-3736.640,10.000,-13.058},
				{-71007.745,-3617.466,10.000,-13.279},
				{-71363.532,-3498.293,10.000,-13.481},
				{-71707.403,-3379.119,10.000,-13.665},
				{-72039.356,-3259.946,10.000,-13.833},
				{-72359.392,-3140.773,10.000,-13.985},
				{-72667.511,-3021.599,10.000,-14.122},
				{-72963.712,-2902.426,10.000,-14.245},
				{-73247.996,-2783.252,10.000,-14.355},
				{-73520.363,-2664.079,10.000,-14.453},
				{-73780.812,-2544.906,10.000,-14.539},
				{-74029.344,-2425.732,10.000,-14.615},
				{-74265.958,-2306.559,10.000,-14.681},
				{-74490.655,-2187.385,10.000,-14.738},
				{-74703.435,-2068.212,10.000,-14.788},
				{-74904.298,-1949.038,10.000,-14.830},
				{-75093.243,-1829.865,10.000,-14.865},
				{-75270.271,-1710.692,10.000,-14.895},
				{-75435.381,-1591.518,10.000,-14.919},
				{-75588.574,-1472.345,10.000,-14.939},
				{-75729.850,-1353.171,10.000,-14.955},
				{-75859.209,-1233.998,10.000,-14.967},
				{-75976.650,-1114.824,10.000,-14.977},
				{-76082.174,-995.651,10.000,-14.984},
				{-76175.780,-876.478,10.000,-14.989},
				{-76257.531,-758.542,10.000,-14.993},
				{-76327.914,-649.118,10.000,-14.996},
				{-76387.780,-548.207,10.000,-14.997},
				{-76437.981,-455.808,10.000,-14.998},
				{-76479.367,-371.921,10.000,-14.999},
				{-76512.791,-296.547,10.000,-15.000},
				{-76539.102,-229.685,10.000,-15.000},
				{-76559.154,-171.336,10.000,-15.000},
				{-76573.795,-121.499,10.000,-15.000},
				{-76583.879,-80.174,10.000,-15.000},
				{-76590.256,-47.362,10.000,-15.000},
				{-76593.777,-23.062,10.000,-15.000},
				{-76595.294,-7.275,10.000,-15.000},
				{-76595.658,-0.000,10.000,-15.000},
				{-76595.658,-0.000,10.000,-15.000}		};

}