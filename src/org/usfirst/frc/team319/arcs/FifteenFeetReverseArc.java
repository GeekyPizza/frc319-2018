package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class FifteenFeetReverseArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (15.00,0.00,0.00)
	
    public FifteenFeetReverseArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public FifteenFeetReverseArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.428,-8.568,10.000,0.000},
				{-2.142,-25.703,10.000,0.000},
				{-5.997,-51.407,10.000,0.000},
				{-12.852,-85.678,10.000,0.000},
				{-23.561,-128.517,10.000,0.000},
				{-38.984,-179.924,10.000,0.000},
				{-59.975,-239.899,10.000,0.000},
				{-87.392,-308.441,10.000,0.000},
				{-122.091,-385.551,10.000,0.000},
				{-164.930,-471.230,10.000,0.000},
				{-216.766,-565.476,10.000,0.000},
				{-278.454,-668.289,10.000,0.000},
				{-350.852,-779.671,10.000,0.000},
				{-434.816,-899.620,10.000,0.000},
				{-530.776,-1019.569,10.000,0.000},
				{-638.730,-1139.519,10.000,0.000},
				{-758.680,-1259.468,10.000,0.000},
				{-890.624,-1379.418,10.000,0.000},
				{-1034.563,-1499.367,10.000,0.000},
				{-1190.497,-1619.316,10.000,0.000},
				{-1358.426,-1739.266,10.000,0.000},
				{-1538.350,-1859.215,10.000,0.000},
				{-1730.269,-1979.164,10.000,0.000},
				{-1934.183,-2099.114,10.000,0.000},
				{-2150.092,-2219.063,10.000,0.000},
				{-2377.996,-2339.012,10.000,0.000},
				{-2617.895,-2458.962,10.000,0.000},
				{-2869.788,-2578.911,10.000,0.000},
				{-3133.677,-2698.860,10.000,0.000},
				{-3409.560,-2818.810,10.000,0.000},
				{-3697.439,-2938.759,10.000,0.000},
				{-3997.312,-3058.708,10.000,0.000},
				{-4309.180,-3178.658,10.000,0.000},
				{-4633.044,-3298.607,10.000,0.000},
				{-4968.902,-3418.557,10.000,0.000},
				{-5316.755,-3538.506,10.000,0.000},
				{-5676.603,-3658.455,10.000,0.000},
				{-6048.446,-3778.405,10.000,0.000},
				{-6432.284,-3898.354,10.000,0.000},
				{-6828.117,-4018.303,10.000,0.000},
				{-7235.945,-4138.253,10.000,0.000},
				{-7655.767,-4258.202,10.000,0.000},
				{-8087.585,-4378.151,10.000,0.000},
				{-8531.398,-4498.101,10.000,0.000},
				{-8987.205,-4618.050,10.000,0.000},
				{-9455.008,-4737.999,10.000,0.000},
				{-9934.805,-4857.949,10.000,0.000},
				{-10426.597,-4977.898,10.000,0.000},
				{-10930.385,-5097.847,10.000,0.000},
				{-11446.167,-5217.797,10.000,0.000},
				{-11973.944,-5337.746,10.000,0.000},
				{-12513.716,-5457.695,10.000,0.000},
				{-13065.483,-5577.645,10.000,0.000},
				{-13629.245,-5697.594,10.000,0.000},
				{-14205.002,-5817.544,10.000,0.000},
				{-14792.754,-5937.493,10.000,0.000},
				{-15392.500,-6057.442,10.000,0.000},
				{-16004.242,-6177.392,10.000,0.000},
				{-16627.979,-6297.341,10.000,0.000},
				{-17263.710,-6417.290,10.000,0.000},
				{-17911.437,-6537.240,10.000,0.000},
				{-18571.158,-6657.189,10.000,0.000},
				{-19242.875,-6777.138,10.000,0.000},
				{-19926.586,-6897.088,10.000,0.000},
				{-20622.292,-7017.037,10.000,0.000},
				{-21329.993,-7136.986,10.000,0.000},
				{-22049.689,-7256.936,10.000,0.000},
				{-22781.380,-7376.885,10.000,0.000},
				{-23525.066,-7496.834,10.000,0.000},
				{-24280.747,-7616.784,10.000,0.000},
				{-25048.423,-7736.733,10.000,0.000},
				{-25828.094,-7856.682,10.000,0.000},
				{-26619.760,-7976.632,10.000,0.000},
				{-27423.420,-8096.581,10.000,0.000},
				{-28239.076,-8216.531,10.000,0.000},
				{-29066.726,-8336.480,10.000,0.000},
				{-29906.372,-8456.429,10.000,0.000},
				{-30758.012,-8576.379,10.000,0.000},
				{-31621.648,-8696.328,10.000,0.000},
				{-32497.278,-8816.277,10.000,0.000},
				{-33384.903,-8936.227,10.000,0.000},
				{-34284.523,-9056.176,10.000,0.000},
				{-35196.138,-9176.125,10.000,0.000},
				{-36119.748,-9296.075,10.000,0.000},
				{-37055.353,-9416.024,10.000,0.000},
				{-38002.953,-9535.973,10.000,0.000},
				{-38962.548,-9655.923,10.000,0.000},
				{-39934.138,-9775.872,10.000,0.000},
				{-40917.722,-9895.821,10.000,0.000},
				{-41913.302,-10015.771,10.000,0.000},
				{-42920.877,-10135.720,10.000,0.000},
				{-43940.446,-10255.670,10.000,0.000},
				{-44972.010,-10375.619,10.000,0.000},
				{-46015.570,-10495.568,10.000,0.000},
				{-47071.124,-10615.518,10.000,0.000},
				{-48138.673,-10735.467,10.000,0.000},
				{-49218.217,-10855.416,10.000,0.000},
				{-50309.757,-10975.366,10.000,0.000},
				{-51413.291,-11095.315,10.000,0.000},
				{-52528.820,-11215.264,10.000,0.000},
				{-53656.343,-11335.214,10.000,0.000},
				{-54795.862,-11455.163,10.000,0.000},
				{-55947.376,-11575.112,10.000,0.000},
				{-57110.885,-11695.062,10.000,0.000},
				{-58286.388,-11815.011,10.000,0.000},
				{-59473.887,-11934.960,10.000,0.000},
				{-60673.380,-12054.910,10.000,0.000},
				{-61884.869,-12174.859,10.000,0.000},
				{-63108.352,-12294.808,10.000,0.000},
				{-64343.831,-12414.758,10.000,0.000},
				{-65591.304,-12534.707,10.000,0.000},
				{-66850.772,-12654.657,10.000,0.000},
				{-68122.235,-12774.606,10.000,0.000},
				{-69405.693,-12894.555,10.000,0.000},
				{-70701.146,-13014.505,10.000,0.000},
				{-72008.594,-13134.454,10.000,0.000},
				{-73328.037,-13254.403,10.000,0.000},
				{-74659.475,-13374.353,10.000,0.000},
				{-76002.908,-13494.302,10.000,0.000},
				{-77358.335,-13614.251,10.000,0.000},
				{-78725.758,-13734.201,10.000,0.000},
				{-80105.175,-13854.150,10.000,0.000},
				{-81496.588,-13974.099,10.000,0.000},
				{-82899.995,-14094.049,10.000,0.000},
				{-84315.398,-14213.998,10.000,0.000},
				{-85742.366,-14325.380,10.000,0.000},
				{-87180.045,-14428.193,10.000,0.000},
				{-88627.577,-14522.439,10.000,0.000},
				{-90084.105,-14608.117,10.000,0.000},
				{-91548.772,-14685.228,10.000,0.000},
				{-93020.722,-14753.770,10.000,0.000},
				{-94499.097,-14813.745,10.000,0.000},
				{-95983.042,-14865.152,10.000,0.000},
				{-97471.699,-14907.991,10.000,0.000},
				{-98964.212,-14942.262,10.000,0.000},
				{-100459.723,-14967.965,10.000,0.000},
				{-101957.377,-14985.101,10.000,0.000},
				{-103456.315,-14993.669,10.000,0.000},
				{-104955.682,-14993.669,10.000,0.000},
				{-106455.049,-14993.669,10.000,0.000},
				{-107954.416,-14993.669,10.000,0.000},
				{-109453.783,-14993.669,10.000,0.000},
				{-110953.150,-14993.669,10.000,0.000},
				{-112452.517,-14993.669,10.000,0.000},
				{-113951.883,-14993.669,10.000,0.000},
				{-115451.250,-14993.669,10.000,0.000},
				{-116950.617,-14993.669,10.000,0.000},
				{-118449.984,-14993.669,10.000,0.000},
				{-119949.351,-14993.669,10.000,0.000},
				{-121448.718,-14993.669,10.000,0.000},
				{-122947.656,-14985.101,10.000,0.000},
				{-124445.310,-14967.965,10.000,0.000},
				{-125940.821,-14942.262,10.000,0.000},
				{-127433.334,-14907.991,10.000,0.000},
				{-128921.991,-14865.152,10.000,0.000},
				{-130405.936,-14813.745,10.000,0.000},
				{-131884.311,-14753.770,10.000,0.000},
				{-133356.261,-14685.228,10.000,0.000},
				{-134820.929,-14608.117,10.000,0.000},
				{-136277.456,-14522.439,10.000,0.000},
				{-137724.988,-14428.193,10.000,0.000},
				{-139162.667,-14325.380,10.000,0.000},
				{-140589.636,-14213.998,10.000,0.000},
				{-142005.038,-14094.049,10.000,0.000},
				{-143408.445,-13974.099,10.000,0.000},
				{-144799.858,-13854.150,10.000,0.000},
				{-146179.275,-13734.201,10.000,0.000},
				{-147546.698,-13614.251,10.000,0.000},
				{-148902.126,-13494.302,10.000,0.000},
				{-150245.558,-13374.353,10.000,0.000},
				{-151576.996,-13254.403,10.000,0.000},
				{-152896.439,-13134.454,10.000,0.000},
				{-154203.887,-13014.505,10.000,0.000},
				{-155499.340,-12894.555,10.000,0.000},
				{-156782.798,-12774.606,10.000,0.000},
				{-158054.261,-12654.657,10.000,0.000},
				{-159313.729,-12534.707,10.000,0.000},
				{-160561.203,-12414.758,10.000,0.000},
				{-161796.681,-12294.808,10.000,0.000},
				{-163020.164,-12174.859,10.000,0.000},
				{-164231.653,-12054.910,10.000,0.000},
				{-165431.146,-11934.960,10.000,0.000},
				{-166618.645,-11815.011,10.000,0.000},
				{-167794.148,-11695.062,10.000,0.000},
				{-168957.657,-11575.112,10.000,0.000},
				{-170109.171,-11455.163,10.000,0.000},
				{-171248.690,-11335.214,10.000,0.000},
				{-172376.214,-11215.264,10.000,0.000},
				{-173491.743,-11095.315,10.000,0.000},
				{-174595.277,-10975.366,10.000,0.000},
				{-175686.816,-10855.416,10.000,0.000},
				{-176766.360,-10735.467,10.000,0.000},
				{-177833.909,-10615.518,10.000,0.000},
				{-178889.463,-10495.568,10.000,0.000},
				{-179933.023,-10375.619,10.000,0.000},
				{-180964.587,-10255.670,10.000,0.000},
				{-181984.157,-10135.720,10.000,0.000},
				{-182991.731,-10015.771,10.000,0.000},
				{-183987.311,-9895.821,10.000,0.000},
				{-184970.895,-9775.872,10.000,0.000},
				{-185942.485,-9655.923,10.000,0.000},
				{-186902.080,-9535.973,10.000,0.000},
				{-187849.680,-9416.024,10.000,0.000},
				{-188785.285,-9296.075,10.000,0.000},
				{-189708.895,-9176.125,10.000,0.000},
				{-190620.510,-9056.176,10.000,0.000},
				{-191520.130,-8936.227,10.000,0.000},
				{-192407.755,-8816.277,10.000,0.000},
				{-193283.386,-8696.328,10.000,0.000},
				{-194147.021,-8576.379,10.000,0.000},
				{-194998.661,-8456.429,10.000,0.000},
				{-195838.307,-8336.480,10.000,0.000},
				{-196665.957,-8216.531,10.000,0.000},
				{-197481.613,-8096.581,10.000,0.000},
				{-198285.273,-7976.632,10.000,0.000},
				{-199076.939,-7856.682,10.000,0.000},
				{-199856.610,-7736.733,10.000,0.000},
				{-200624.286,-7616.784,10.000,0.000},
				{-201379.967,-7496.834,10.000,0.000},
				{-202123.653,-7376.885,10.000,0.000},
				{-202855.344,-7256.936,10.000,0.000},
				{-203575.040,-7136.986,10.000,0.000},
				{-204282.741,-7017.037,10.000,0.000},
				{-204978.447,-6897.088,10.000,0.000},
				{-205662.159,-6777.138,10.000,0.000},
				{-206333.875,-6657.189,10.000,0.000},
				{-206993.596,-6537.240,10.000,0.000},
				{-207641.323,-6417.290,10.000,0.000},
				{-208277.054,-6297.341,10.000,0.000},
				{-208900.791,-6177.392,10.000,0.000},
				{-209512.533,-6057.442,10.000,0.000},
				{-210112.279,-5937.493,10.000,0.000},
				{-210700.031,-5817.544,10.000,0.000},
				{-211275.788,-5697.594,10.000,0.000},
				{-211839.550,-5577.645,10.000,0.000},
				{-212391.317,-5457.695,10.000,0.000},
				{-212931.089,-5337.746,10.000,0.000},
				{-213458.866,-5217.797,10.000,0.000},
				{-213974.649,-5097.847,10.000,0.000},
				{-214478.436,-4977.898,10.000,0.000},
				{-214970.228,-4857.949,10.000,0.000},
				{-215450.026,-4737.999,10.000,0.000},
				{-215917.828,-4618.050,10.000,0.000},
				{-216373.636,-4498.101,10.000,0.000},
				{-216817.448,-4378.151,10.000,0.000},
				{-217249.266,-4258.202,10.000,0.000},
				{-217669.089,-4138.253,10.000,0.000},
				{-218076.916,-4018.303,10.000,0.000},
				{-218472.749,-3898.354,10.000,0.000},
				{-218856.587,-3778.405,10.000,0.000},
				{-219228.430,-3658.455,10.000,0.000},
				{-219588.278,-3538.506,10.000,0.000},
				{-219936.131,-3418.557,10.000,0.000},
				{-220271.989,-3298.607,10.000,0.000},
				{-220595.853,-3178.658,10.000,0.000},
				{-220907.721,-3058.708,10.000,0.000},
				{-221207.594,-2938.759,10.000,0.000},
				{-221495.473,-2818.810,10.000,0.000},
				{-221771.356,-2698.860,10.000,0.000},
				{-222035.245,-2578.911,10.000,0.000},
				{-222287.139,-2458.962,10.000,0.000},
				{-222527.037,-2339.012,10.000,0.000},
				{-222754.941,-2219.063,10.000,0.000},
				{-222970.850,-2099.114,10.000,0.000},
				{-223174.764,-1979.164,10.000,0.000},
				{-223366.683,-1859.215,10.000,0.000},
				{-223546.607,-1739.266,10.000,0.000},
				{-223714.536,-1619.316,10.000,0.000},
				{-223870.470,-1499.367,10.000,0.000},
				{-224014.409,-1379.418,10.000,0.000},
				{-224146.354,-1259.468,10.000,0.000},
				{-224266.303,-1139.519,10.000,0.000},
				{-224374.257,-1019.569,10.000,0.000},
				{-224470.217,-899.620,10.000,0.000},
				{-224554.181,-779.671,10.000,0.000},
				{-224626.579,-668.289,10.000,0.000},
				{-224688.268,-565.476,10.000,0.000},
				{-224740.103,-471.230,10.000,0.000},
				{-224782.942,-385.551,10.000,0.000},
				{-224817.642,-308.441,10.000,0.000},
				{-224845.059,-239.899,10.000,0.000},
				{-224866.050,-179.924,10.000,0.000},
				{-224881.472,-128.517,10.000,0.000},
				{-224892.181,-85.678,10.000,0.000},
				{-224899.036,-51.407,10.000,0.000},
				{-224902.891,-25.703,10.000,0.000},
				{-224904.605,-8.568,10.000,0.000},
				{-224905.033,-0.000,10.000,0.000},
				{-224905.033,-0.000,10.000,0.000}		};

}