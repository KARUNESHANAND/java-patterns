class Solution {

    void printTriangle(int n) {
        for(int i = 0 ; i <= n-1; i++){
            for(int j= 1; j<=i+1; j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}

// 1
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5
