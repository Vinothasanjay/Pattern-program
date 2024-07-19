class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
         
        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
