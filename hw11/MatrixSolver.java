public class MatrixSolver{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();//build 3d array
    show(mat3d);//print matrix
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));//find min in array
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);//sort 3rd matrix
    show(mat3d);//print matrix
   }
   
   
   
   public static int[][][] buildMat3d(){ //build the matrix
     int[] s1r1 = new int[1];
     int[] s1r2 = new int[2];
     int[] s1r3 = new int[3];
     int[][]slab1 = {s1r1,s1r2,s1r3};//first slab
     
     int[] s2r1 = new int[2];
     int[] s2r2 = new int[3];
     int[] s2r3 = new int[4];
     int[] s2r4 = new int[5];
     int[] s2r5 = new int[6];
     int[][]slab2 = {s2r1,s2r2,s2r3,s2r4,s2r5};//second slab
     
     int[] s3r1 = new int[3];
     int[] s3r2 = new int[4];
     int[] s3r3 = new int[5];
     int[] s3r4 = new int[6];
     int[] s3r5 = new int[7];
     int[] s3r6 = new int[8];
     int[] s3r7 = new int[9];
     int[][]slab3 = {s3r1,s3r2,s3r3,s3r4,s3r5,s3r6,s3r7};//third slab
     
     int[][][] Matrix = {slab1,slab2,slab3};//combine slabs for matrix
     
     for(int i = 0; i < Matrix.length; i++){
       for(int j = 0; j < Matrix[i].length; j++){
         for(int k = 0; k < Matrix[i][j].length; k++){
           Matrix[i][j][k] = randomNumber();//set random number in each index
         }
       }
     }
     return Matrix;
   }
   
   public static int findMin(int[][][] Matrix){//find min
     int min = Matrix[0][0][0];//fisrt set to min
       for(int i = 0; i < Matrix.length; i++){
       for(int j = 0; j < Matrix[i].length; j++){
         for(int k = 0; k < Matrix[i][j].length; k++){
           if(Matrix[i][j][k] < min){//if current value is less than min
             min = Matrix[i][j][k];//current value is min
           }
         }
       }
     }
     return min;
   }
   
   
   public static int randomNumber(){ //method to create random number
     return (int)Math.random()*99;
   }
   
   public static void show(int[][][] x){//print out array
     for(int i = 0; i < x.length; i++){
       for(int j = 0; j < x[i].length; j++){
         for(int k = 0; k < x[i][j].length; k++){
           System.out.print(x[i][j][k]);//print out item
         }
         System.out.println("");
       }
       System.out.println("");
       System.out.println("");
     }
   }
   
   public static void sort(int[][] x){ //sort a slab
     for(int i = 0; i < x.length; i++){
       for(int j = 0; j < x[i].length; j++){
           if(x[i][j] > x[i][j+1]){//if value is greater than value after
             int temp = x[i][j];//swap values
             x[i][j] = x[i][j+1];
             x[i][j+1] = temp;
           }
           
         }
         
       }
      
     }
   
   
   
   
}
