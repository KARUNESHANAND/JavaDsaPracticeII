import java.util.*;
public class shortestpath {
    public static float ShortestRoute(String str){
        int x=0,y=0;
        for(int i=0; i< str.length();i++){
            if (str.charAt(i)=='N') {
                y++;
            }
            else if (str.charAt(i)=='S') {
                y--;
            }
            else if (str.charAt(i)=='W') {
                x--;
            }
            else if (str.charAt(i)=='E') {
                x++;
            }
        }
        
        int X2 = x*x;
        int Y2 = y*y;
        float distance = (float)Math.sqrt(X2+Y2);
        return distance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the route to find the shortest route : ");
        String str = sc.nextLine();
        System.out.println("The shortest path is : " + ShortestRoute(str));
    }

    
}
