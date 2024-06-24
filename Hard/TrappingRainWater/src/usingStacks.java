import java.util.Stack;

public class usingStacks {
    public static int trap(int[] height){
        int ans = 0;
        int n = height.length;

        // Case of empty height array
        if (n == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++){
            
        }
        
        return ans;
    }

    public static void main (String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
        int[] height1 = {4,2,0,3,2,5};
        System.out.println(trap(height1));
    }
}
