package roadgraph;

import geography.GeographicPoint;
import java.util.*;

public class MapNode implements Comparable<MapNode>{

	private GeographicPoint location;
	private List<MapEdge> edges;
	private double shortestDistance;
	
	public MapNode(double latitude, double longitude) {
		location = new GeographicPoint(latitude, longitude);
		edges = new ArrayList<>();
		shortestDistance = Double.MAX_VALUE;
	}
	
	public void addEdge(MapEdge newEdge){
		edges.add(newEdge);
	}
	
	public GeographicPoint getLocation() {
		return location;
	}
	
	public List<MapEdge> getEdges() {
		return edges;
	}
	
	public double getShortestDistance() {
		return shortestDistance;
	}
	
	public void setShortestDistance(double dist) {
		shortestDistance = dist;
	}

	@Override
	public int compareTo(MapNode o) {
		if (shortestDistance < o.getShortestDistance()) return -1;
		if (shortestDistance > o.getShortestDistance()) return 1;
		return 0;
	}
}
