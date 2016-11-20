package roadgraph;

import geography.GeographicPoint;
import java.util.*;

public class MapNode {

	private GeographicPoint location;
	private List<MapEdge> edges;
	
	public MapNode(double latitude, double longitude) {
		location = new GeographicPoint(latitude, longitude);
		edges = new ArrayList<>();
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
	
}
