public class ErdosRenyi {

	
	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("Usage: <probabiblity of edge> <number of nodes>");
			return;
		}
		double prob = Double.parseDouble(args[0]);
		int N = Integer.parseInt(args[1]);
		if (prob <= 0 || prob > 1) {
			System.out.println("Edge probability = " + prob + ": must be in (0, 1]");
			return;
		}
		if (N <= 0) {
			System.out.println("Number of nodes: " + N + ": must be positive");
			return;
		}
		
		int[][] graph = new int[N][N];
	
		
		// Generate an undirected random graph with N nodes
		// and probability p of any two nodes to be connected. 
		for(int i=0; i < N; i++){
			for(int j=i+1; j< N; j++){
				double rand = Math.random();
				if(rand <= prob){
					graph[i][j]=1;
					graph[j][i]= 1;
				}
				
			}
			
		}
		
		// Print out the resulting graph as NxN matrix of 0's and 1's
		// Use nested loops and a combination of System.print and System.pritln.
		// For example, a possible output for an 3x3 matrix may looks as follows:
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.print(graph[i][j]);
				}
			System.out.println();
		}
		
		
	}

}
