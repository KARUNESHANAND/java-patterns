class Pattern2 {

    void printTriangle(int n) {
        for(int i = 0; i<=(n-1); i++ ) {
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// *
// * *
// * * *
// * * * *
// * * * * *
