package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class TripleCubeFirstCubeToLeftSwitchPt1Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (6.73,12.58,0.00)
	// (2.63,12.58,0.00)
	
    public TripleCubeFirstCubeToLeftSwitchPt1Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TripleCubeFirstCubeToLeftSwitchPt1Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.423,-8.468,10.000,0.000},
				{-2.117,-25.404,10.000,0.000},
				{-5.928,-50.809,10.000,0.000},
				{-12.702,-84.681,10.000,0.000},
				{-23.287,-127.022,10.000,0.000},
				{-38.530,-177.831,10.000,0.000},
				{-59.277,-237.108,10.000,0.000},
				{-86.375,-304.853,10.000,0.000},
				{-120.671,-381.066,10.000,0.000},
				{-163.012,-465.747,10.000,0.000},
				{-214.244,-558.897,10.000,0.000},
				{-275.214,-660.515,10.000,0.000},
				{-346.770,-770.600,10.000,0.000},
				{-429.758,-889.154,10.000,0.000},
				{-524.601,-1007.708,10.000,0.000},
				{-631.300,-1126.262,10.000,0.000},
				{-749.853,-1244.816,10.000,0.000},
				{-880.263,-1363.370,10.000,0.000},
				{-1022.527,-1481.924,10.000,0.000},
				{-1176.648,-1600.478,10.000,0.000},
				{-1342.623,-1719.032,10.000,0.000},
				{-1520.454,-1837.586,10.000,0.000},
				{-1710.140,-1956.139,10.000,0.000},
				{-1911.682,-2074.693,10.000,0.000},
				{-2125.079,-2193.247,10.000,0.000},
				{-2350.331,-2311.801,10.000,0.000},
				{-2587.439,-2430.355,10.000,0.000},
				{-2836.402,-2548.909,10.000,0.000},
				{-3097.221,-2667.463,10.000,0.000},
				{-3369.895,-2786.017,10.000,0.000},
				{-3654.424,-2904.571,10.000,0.000},
				{-3950.809,-3023.125,10.000,0.000},
				{-4259.049,-3141.679,10.000,0.000},
				{-4579.145,-3260.232,10.000,0.000},
				{-4911.096,-3378.786,10.000,0.000},
				{-5254.902,-3497.340,10.000,0.000},
				{-5610.564,-3615.894,10.000,0.000},
				{-5978.081,-3734.448,10.000,0.000},
				{-6357.453,-3853.002,10.000,0.000},
				{-6748.681,-3971.556,10.000,0.000},
				{-7151.764,-4090.110,10.000,0.000},
				{-7566.703,-4208.664,10.000,0.000},
				{-7993.497,-4327.218,10.000,0.000},
				{-8432.147,-4445.772,10.000,0.000},
				{-8882.652,-4564.325,10.000,0.000},
				{-9345.012,-4682.879,10.000,0.000},
				{-9819.227,-4801.433,10.000,0.000},
				{-10305.298,-4919.987,10.000,0.000},
				{-10803.225,-5038.541,10.000,0.000},
				{-11313.007,-5157.095,10.000,0.000},
				{-11834.644,-5275.649,10.000,0.000},
				{-12368.136,-5394.203,10.000,0.000},
				{-12913.484,-5512.757,10.000,0.000},
				{-13470.688,-5631.311,10.000,0.000},
				{-14039.747,-5749.865,10.000,0.000},
				{-14620.661,-5868.418,10.000,0.000},
				{-15213.430,-5986.972,10.000,0.000},
				{-15818.055,-6105.526,10.000,0.000},
				{-16434.535,-6224.080,10.000,0.000},
				{-17062.871,-6342.634,10.000,0.000},
				{-17703.062,-6461.188,10.000,0.000},
				{-18355.109,-6579.742,10.000,0.000},
				{-19019.011,-6698.296,10.000,0.000},
				{-19694.768,-6816.850,10.000,0.000},
				{-20382.381,-6935.404,10.000,0.000},
				{-21081.849,-7053.958,10.000,0.000},
				{-21792.749,-7164.043,10.000,0.000},
				{-22514.234,-7265.661,10.000,0.000},
				{-23245.457,-7358.810,10.000,0.000},
				{-23985.573,-7443.492,10.000,0.000},
				{-24733.732,-7519.705,10.000,0.000},
				{-25489.090,-7587.450,10.000,0.000},
				{-26250.799,-7646.727,10.000,0.000},
				{-27018.012,-7697.536,10.000,0.000},
				{-27789.883,-7739.877,10.000,0.000},
				{-28565.564,-7773.749,10.000,0.000},
				{-29344.209,-7799.153,10.000,0.000},
				{-30124.971,-7816.090,10.000,0.000},
				{-30906.820,-7820.879,10.000,0.000},
				{-31688.300,-7808.731,10.000,0.000},
				{-32468.143,-7788.116,10.000,0.000},
				{-33245.500,-7759.032,10.000,0.000},
				{-34019.526,-7721.480,10.000,0.000},
				{-34789.373,-7675.460,10.000,0.000},
				{-35554.194,-7620.972,10.000,0.000},
				{-36313.144,-7558.016,10.000,0.000},
				{-37065.374,-7486.592,10.000,0.000},
				{-37810.039,-7406.699,10.000,0.000},
				{-38546.290,-7318.338,10.000,0.000},
				{-39273.283,-7221.510,10.000,0.000},
				{-39990.169,-7116.213,10.000,0.000},
				{-40696.102,-7002.448,10.000,0.000},
				{-41390.419,-6883.894,10.000,0.000},
				{-42072.881,-6765.340,10.000,0.000},
				{-42743.487,-6646.786,10.000,0.000},
				{-43402.238,-6528.232,10.000,0.000},
				{-44049.133,-6409.678,10.000,0.000},
				{-44684.173,-6291.124,10.000,0.000},
				{-45307.358,-6172.570,10.000,0.000},
				{-45918.688,-6054.016,10.000,0.000},
				{-46518.161,-5935.462,10.000,0.000},
				{-47105.780,-5816.909,10.000,0.000},
				{-47681.543,-5698.355,10.000,0.000},
				{-48245.451,-5579.801,10.000,0.000},
				{-48797.503,-5461.247,10.000,0.000},
				{-49337.700,-5342.693,10.000,0.000},
				{-49866.042,-5224.139,10.000,0.000},
				{-50382.528,-5105.585,10.000,0.000},
				{-50887.159,-4987.031,10.000,0.000},
				{-51379.934,-4868.477,10.000,0.000},
				{-51860.854,-4749.923,10.000,0.000},
				{-52329.919,-4631.369,10.000,0.000},
				{-52787.128,-4512.816,10.000,0.000},
				{-53232.482,-4394.262,10.000,0.000},
				{-53665.981,-4275.708,10.000,0.000},
				{-54087.624,-4157.154,10.000,0.000},
				{-54497.411,-4038.600,10.000,0.000},
				{-54895.344,-3920.046,10.000,0.000},
				{-55281.421,-3801.492,10.000,0.000},
				{-55655.642,-3682.938,10.000,0.000},
				{-56018.008,-3564.384,10.000,0.000},
				{-56368.519,-3445.830,10.000,0.000},
				{-56707.174,-3327.277,10.000,0.000},
				{-57033.974,-3208.723,10.000,0.000},
				{-57348.919,-3090.169,10.000,0.000},
				{-57652.008,-2971.615,10.000,0.000},
				{-57943.242,-2853.061,10.000,0.000},
				{-58222.620,-2734.507,10.000,0.000},
				{-58490.143,-2615.953,10.000,0.000},
				{-58745.811,-2497.399,10.000,0.000},
				{-58989.623,-2378.845,10.000,0.000},
				{-59221.580,-2260.291,10.000,0.000},
				{-59441.681,-2141.737,10.000,0.000},
				{-59649.927,-2023.184,10.000,0.000},
				{-59846.318,-1904.630,10.000,0.000},
				{-60030.853,-1786.076,10.000,0.000},
				{-60203.533,-1667.522,10.000,0.000},
				{-60364.358,-1548.968,10.000,0.000},
				{-60513.327,-1430.414,10.000,0.000},
				{-60650.440,-1311.860,10.000,0.000},
				{-60775.699,-1193.306,10.000,0.000},
				{-60889.102,-1074.752,10.000,0.000},
				{-60990.649,-956.198,10.000,0.000},
				{-61080.341,-837.644,10.000,0.000},
				{-61158.362,-722.770,10.000,0.000},
				{-61225.319,-616.363,10.000,0.000},
				{-61282.058,-518.425,10.000,0.000},
				{-61329.427,-428.955,10.000,0.000},
				{-61368.273,-347.953,10.000,0.000},
				{-61399.441,-275.419,10.000,0.000},
				{-61423.780,-211.353,10.000,0.000},
				{-61442.135,-155.755,10.000,0.000},
				{-61455.354,-108.626,10.000,0.000},
				{-61464.284,-69.964,10.000,0.000},
				{-61469.770,-39.771,10.000,0.000},
				{-61472.661,-18.046,10.000,0.000},
				{-61473.803,-4.789,10.000,0.000},
				{-61474.042,-0.000,10.000,0.000},
				{-61474.042,-0.000,10.000,0.000}		};

}