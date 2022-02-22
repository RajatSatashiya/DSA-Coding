class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // if(image[sr][sc] == newColor) return image;
        boolean[][] arr = new boolean[image.length][image[0].length];
        kardoBeta(image, sr, sc, image[sr][sc], newColor, arr);
        return image;
    }
    
    public static void kardoBeta(int[][] image, int sr, int sc, int color, int newColor, boolean[][] arr){
        if(sr < 0 || sr == image.length || sc < 0 || sc == image[0].length || image[sr][sc] != color || arr[sr][sc] == true){
            return;
        }
        image[sr][sc] = newColor;
        arr[sr][sc] = true;
        
        kardoBeta(image, sr + 1, sc, color, newColor, arr);
        kardoBeta(image, sr - 1, sc, color, newColor, arr);
        kardoBeta(image, sr, sc + 1, color, newColor, arr);
        kardoBeta(image, sr, sc - 1, color, newColor, arr);
    }
}

// 0 0 0
// 0 1 1