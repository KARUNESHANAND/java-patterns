class Pattern3 {

    void printTriangle(int n) {
        for(int i = 0 ; i<= (n-1); i++) {
            for(int j= 1; j<=i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
