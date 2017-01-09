import java.util.Set;

public class problemGRASP {
	
	static int GRASP(int max_iterations, int set[], int seed){
		int best_solution;
		int[] C;
		
		for (int k = 1; k < max_iterations; k++) {
			best_solution = ConstructGreedyRandomizedSolution(seed);
			best_solution = local_search(solution);
		}
	}
	
	static void ConstructGreedyRandomizedSolution(int solution[], int seed){
		
		for (int i = 0; i < solution.length; i++) {
			
		}
			
		
	}
	
	static int local_search(int solution[]){
		return solution;
		
	}
	
	static int update_solution(int sum, int solution, int best_solution){
		if (sum - best_solution<sum-solution){
			solution = best_solution;
		}else{
			return solution;
		}
		return solution;
	}
}
