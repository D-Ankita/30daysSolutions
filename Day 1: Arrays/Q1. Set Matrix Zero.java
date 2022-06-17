class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        
        int col0 = 1, row=matrix.length, col = matrix[0].length;
        for(int i =0;i<row;i++)
        {
            //check if any value in first col is zero; if yes make col0 as 0
            if(matrix[i][0] == 0)
                col0 = 0;
            for(int j = 1;j<col;j++)
            {
                //if a[i][j] is zero then make the corresponding 1strow 1st col valur as 0
                if(matrix[i][j]==0)
                    matrix[i][0] = matrix[0][j] =  0; //[i][0]:1st col of i row ; [0][j]:1st row of j col 
            }
        }
       //index vala column chodke traverse karo
        for(int i =1;i<row;i++)
        {
            for(int j=1;j<col;j++)  
            {
                //if either row or col corr is 0 make the value 0
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j]=0;
                
            }
        }
        //check if 0,0 is zero, if yes matlab originally 0,0 pe zero tha so we should make the whole row 0
        if (matrix[0][0] == 0)
        {
            for (int j = 0; j < col; j++) 
            {
                matrix[0][j] = 0;
            }
        }
        //check if col0 is toggled, if yes there was some row i of first column jo 0 tha so we need to make whole first column 0
        if(col0 == 0)
        for (int i = 0; i < row; i++)
        {
            matrix[i][0] = 0;
        }
        
    }
}
