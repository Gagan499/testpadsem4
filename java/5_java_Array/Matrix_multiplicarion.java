class Result {
    // Print the resultant matrix after (A * B)
    static void multiplyMatrix(int A[][],int B[][], int R1, int C1, int R2, int C2) {
      // Write your code here
       int[][] result = new int[R1][C2];
      for(int i=0;i<R1;i++){
          for(int j=0;j<C2;j++){
              for(int k=0;k<C1;k++){
                  result[i][j] += A[i][k] * B[k][j];
              }
          }
      }
        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
  }