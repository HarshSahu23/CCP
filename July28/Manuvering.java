package July28;
public class Manuvering {
    public static int path(int r, int c)
    {
        int rows=2,cols=3;
        if (r==rows-1||c==cols-1) {
            return 1;
        }
        return path(r+1, c)+path(r, c+1);
    }

    public static int path2(int r, int c)
    {
        if (r==0||c==0) {
            return 1;
        }
        return path(r-1, c)+path(r, c-1);
    }

    public static void main(String[] args) {
        int ans = path(0,0);
        System.out.println(ans);
    }
}
