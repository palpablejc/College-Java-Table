
public class Table {
	public static void main(String[] args){
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		
		int numRows = Integer.parseInt(args[0]);
		int numColumn = Integer.parseInt(args[1]);
		
		if(args.length < 2){
		System.out.println("java Table row column [initial value]");
		System.exit(0);
		}

		

		int[][] table = new int[numRows][numColumn];
		for (int i = 0; i < table.length; i++){
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(args[2] + " ");
			}
			System.out.println();
		}
		
	}

}
