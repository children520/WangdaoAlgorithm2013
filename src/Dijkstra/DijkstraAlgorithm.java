package Dijkstra;

import java.util.*;

public class DijkstraAlgorithm {
    private List<Vertex> nodes;
    private List<Edge> edges;
    private Set<Vertex> settledNodes;
    private Set<Vertex> unSettledNodes;
    private Map<Vertex,Vertex> predecessors;
    private Map<Vertex,Integer> distance;
    public DijkstraAlgorithm(Graph graph){
        this.nodes=new ArrayList<Vertex>(graph.getVertexes());
        this.edges=new ArrayList<Edge>(graph.getEdges());
    }
    public void execute(Vertex source){
        settledNodes=new HashSet<>();
        unSettledNodes=new HashSet<>();
        distance=new HashMap<>();
        predecessors=new HashMap<>();
        distance.put(source,0);
        unSettledNodes.add(source);
        while (unSettledNodes.size()>0){
            Vertex node=getMinimym(unSettledNodes);
            settledNodes.add(node);
            unSettledNodes.remove(node);

        }
    }
    private void findMinimalDistances(Vertex node){
        List<Vertex> adjacentNodes=getNeighbors(node);
        for(Vertex target:adjacentNodes){
            if(getShortestDistance(target)>getShortestDistance(node)+getDistance(node,target)){
                distance.put(target,getShortestDistance(node)+getDistance(node,target));
                predecessors.put(target,node);
                unSettledNodes.add(target);
            }
        }
    }
    private Vertex getMinimym(Set<Vertex> vertexes){
        Vertex minimum=null;
        for(Vertex vertex:vertexes){
            if(minimum==null){
                minimum=vertex;
            }else{
                if(getShortestDistance(vertex)<getShortestDistance(minimum)){
                    minimum=vertex;
                }
            }
        }
        return minimum;
    }
    private int getDistance(Vertex node,Vertex target){
        for(Edge edge:edges){
            if(edge.getSource().equals(node)&&edge.getDestination().equals(target)){
                return edge.getWeight();
            }
        }
        throw new RuntimeException("should not happen");
    }
    private int getShortestDistance(Vertex destination){
        Integer d=distance.get(destination);
        if(d==null){
            return Integer.MAX_VALUE;
        }else {
            return d;
        }
    }
    private List<Vertex> getNeighbors(Vertex node){
        List<Vertex> neighbors=new ArrayList<>();
        for(Edge edge:edges){
            if(edge.getSource().equals(node)&&!isSettled(edge.getDestination())){
                neighbors.add(edge.getDestination());
            }
        }
        return neighbors;
    }
    private boolean isSettled(Vertex vertex){
        return settledNodes.contains(vertex);
    }
    public LinkedList<Vertex> getPath(Vertex target) {
        LinkedList<Vertex> path = new LinkedList<Vertex>();
        Vertex step = target;
        // check if a path exists
        if (predecessors.get(step) == null) {
            return null;
        }
        path.add(step);
        while (predecessors.get(step) != null) {
            step = predecessors.get(step);
            path.add(step);
        }
        // Put it into the correct order
        Collections.reverse(path);
        return path;
    }

    //private void

}
