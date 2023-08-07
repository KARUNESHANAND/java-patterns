class Pattern9 {

    void printDiamond(int n) {
        for(int i=1; i<=n ; i++) {
            for(int j=0; j <(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<n ; i++) {
            for(int j=0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<(n-i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
