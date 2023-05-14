package overloading;

public class Vector3 {
    private int[] cost = new int[3];

    public Vector3 (int x, int y, int z) {
        this.cost[0] = x;
        this.cost[1] = y;
        this.cost[2] = z;
    }

    public void setCost (int in, int val) {
        this.cost[in] = val;
    }

    public int getCost (int in) {
        return this.cost[in];
    }

    public int increase (Vector3 vec) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(result+" + (" +this.cost[i] + "*" +this.cost[i]+ ") = " );
            result += this.getCost(i) * vec.getCost(i);
            System.out.print(result);
        }
        return result;
    }

    public void display () {
        System.out.println("(" + this.cost[0] + ","+ this.cost[1] + ","+ this.cost[2] +")");
    }

    public Vector3 increase (int skalar) {
        Vector3 result = new Vector3 (0, 0, 0);
        for (int i = 0; i < 3; i++) {
            result.setCost(i, +this.getCost(i) * skalar);
        }
        return result;
    }
}
