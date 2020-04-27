package Dijkstra;

public class Edge {
    private String id;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Complete.Edge{" +
                "source=" + source +
                ", destination=" + destination +
                '}';
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    private Vertex source;
    private Vertex destination;
    private int weight;

    public Edge(String id, Vertex source, Vertex destination, int weight) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}
