class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
              k=k+2;
                
            }
           // k=k+2;
          
            System.out.println();
        }
    }
}
OUTPUT:
1 
3 5 
7 9 11 
13 15 17 19 
21 23 25 27 29 
