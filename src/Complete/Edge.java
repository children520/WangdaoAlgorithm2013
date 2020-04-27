package Complete;

public class Edge implements Comparable<Edge>{
    private int start;
    private int end;
    private float cost;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Edge(int start, int end, float cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return (int)(this.getCost()-o.getCost());
    }
}
