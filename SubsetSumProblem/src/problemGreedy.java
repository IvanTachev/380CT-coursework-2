import java.util.Arrays;


public class problemGreedy {
	
	static boolean isSubsetSum(int set[], int n, int sum, int currentSum){
		
		Arrays.sort(set);
		
		if (sum - currentSum <= 0) {

			System.out.println(sum-currentSum);
			return true;
		}
		if (n == 0 && sum != 0 ){
			//System.out.println(sum-currentSum);
			return false;
		}
		if (set[n-1] > sum) {
			return isSubsetSum(set, n-1, sum, currentSum);
		}
		
		//System.out.println(sum-currentSum);



		return isSubsetSum(set, n-1, sum, currentSum) ||
				isSubsetSum(set, n-1, sum, currentSum+set[n-1]);
		
		
		
		
	}
	
	public static void main (String args[])
    {
        int set[] ={619,799,938,298,165,482,646,762,433,158,748,307,114,483,198,242,384,408,883,366,818,689,372,330,829,340,367,927,161,267,120,749,222,219,327,126,103,627,841,547,124,562,481,305,149,355,459,523,398,106,756,268,884,773,224,922,850,215,672,276,665,273,354,746,532,868,427,496,155,775,898,315,334,791,774,950,632,316,208,686,508,700,604,935,723,331,275,544,591,357,457,431,757,162,900,923,364,599,973,784,871,225,929,527,130,176,351,332,630,232,211,874,329,781,677,174,835,577,233,516,743,320,335,991,857,151,443,360,474,244,363,141,116,707,902,362,580,808,565,815,207,832,564,928,517,913,590,809,555,942,418,262,703,197,521,144,440,405,994,414,739,145,551,150,388,368,226,170,618,514,282,571,236,909,199,794,499,503,820,434,152,188,451,133,239,728,595,171,524,404,621,139,870,195,323,616,805,281,602,341,651,231,132,661,968,891,290,895,761,129,678,480,589,402,512,710,886,910,657,109,789,534,679,885,278,157,321,494,647,662,819,227,519,163,429,489,945,603,936,249,214,123,304,131,266,729,247,803,336,878,998,358,732,685,828,638,614,866,804,110,867,470,353,823,623,419,191,702,848,660,970,778,699,822,989,579,395,473,192,184,695,455,520,377,640,977,491,403,371,322,572,416,125,235,102,337,169,240,947,680,537,888,979,526,352,825,610,148,985,786,920,897,980,119,536,539,423,586,400,401,932,453,107,504,593,277,462,487,348,969,667,812,987,464,308,943,409,788,588,993,975,415,153,644,740,641,506,648,995,238,978,893,445,731,734,727,752,210,763,583,999,437,389,345,490,393,957,631,827,556,182,311,666,880,166,113,258,264,887,550,863,369,844,230,664,782,538,397,280,272,792,410,569,629,507,800,842,760,185,263,486,787,535,961,931,454,688,744,549,726,428,386,477,142,813,879,890,466,741,654,540,212,967,642,953,861,387,500,785,159,560,279,314,908,990,669,714,855,140,834,653,981,608,156,860,216,154,312,509,793,201,615,899,971,745,634,684,697,382,974,522,612,711,930,501,518,365,310,704,302,545,203,118,306,220,693,575,918,313,658,811,853,712,349,105,426,449,801,876,452,896,956,186,460,173,296,513,605,865,960,875,206,713,691,663,250,607,295,747,675,529,256,554,694,721,584,254,594,246,510,407,200,177,300,859,724,698,128,257,342,877,982,965,561,531,488,202,478,873,180,673,645,179,753,444,115,862,378,557,294,949,709,438,846,912,472,303,370,318,676,764,759,456,622,722,447,738,772,769,881,421,838,596,463,299,270,542,253,383,461,229,926,939,984,625,767,255,872,934,525,122,628,324,430,797,652,392,505,946,574,567,869,213,135,261,450,988,546,286,637,905,146,167,228,190,779,446,911,350,412,189,346,976,479,187,725,543,319,492,578,718,469,701,655,770,417,391,948,570,843,435,940,317,755,839,274,624,917,958,193,390,325,223,856,339,134,291,297,963,914,515,117,269,817,687,498,559,852,613,172,552,681,448,333,284,601,983,717,904,576,160,137,381,777,840,598,587,901,907,259,432,682,563,650,996,671,497,234,951,992,394,882,837,765,359,954,955,379,735,716,168,750,326,705,606,328,209,683,495,758,708,147,754,581,309,243,143,986,441,465,293,919,175,292,854,289,108,568,730,245,742,780,659,600,944,807,373,889,205,356,104,287,635,265,396,783,849,511,420,830,178,892,283,101,814,436,181,766,633,548,620,442,609,439,260,112,204,100,476,380,816,833,966,413,715,903,668,611,972,251,218,138,338,858,649,343,528,751,915,933,217,597,719,252,422,411,573,271,485,964,458,385,826,406,127,237,795,906,221,790,921,285,111,952,196,475,361,399,851,696,344,288,425,894,301,776,626,690,720,468,248,733,502,376,558,636,566,847,582,585,962,592,796,736,706,467,553,617,824,836,941,541,164,656,471,533,136,925,484,183,806,121,194,864,692,916,821,845,802,997,639,937,530,924,493,959,347,798,670,771,241,768,737,374,643,424,674,375,831,810, 1000000, 1000001};

          int sum = 90000;
          int n = set.length;
          if (isSubsetSum(set, n, sum, 0) == true)
              System.out.println("Found a subset with given sum");
           else
              System.out.println("No subset which equals exactly the given given sum");
          
          
    }
	
}
