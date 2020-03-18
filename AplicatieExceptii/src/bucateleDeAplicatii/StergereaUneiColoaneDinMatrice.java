package bucateleDeAplicatii;

import java.util.Arrays;

public class StergereaUneiColoaneDinMatrice {

	private static int[][] removeCol(int [][] array, int colRemove)
    {
        int row = array.length;
        int col = array[0].length;

        int [][] newArray = new int[row][col-1];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < colRemove; j++)
            {              
                newArray[i][j] = array[i][j];                
            }

            for(int j = colRemove; j < col-1; j++)
            {                          
               newArray[i][j] = array[i][j+1];
            }

        }

        return newArray;
    }
	
	
//	private static int[][] removeRow (int [][]array, int rowRemove) {
//		int row = array.length;
//		int col = array[0].length;
//		
//		int [][] new2Array = new int[row-1][col];
//		for (int i = 0; i < row -1; i++) {
//			for (int j = i; j < row; j++) {
//				new2Array[i][j] = array[j+1][0];
//			}
//			for (int j = 0; j < rowRemove; j++ ) {
//				new2Array[i][j] = array[i][j];
//			}
//		}
//		return new2Array;
//		
//	}
	
	
	
	
	public static void main(String args[]) {
		int[][] arrayOriginal = new int[][]{{1,2,3,4},
			                                {1,2,3,4},
			                                {1,2,3,4}};
        int[][] arrayNew = removeCol(arrayOriginal, 2);
        System.out.println(Arrays.deepToString(arrayNew));
        System.out.println();
        
//        int[][] array2New = removeRow(arrayOriginal,1);
//        System.out.println(Arrays.deepToString(array2New));
//        System.out.println();
        
        
	}
}
