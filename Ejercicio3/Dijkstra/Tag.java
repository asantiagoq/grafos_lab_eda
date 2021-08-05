public class Tag {

    private final NodeDijkstra node;

    private final Integer weight;

    private Tag(NodeDijkstra node, Integer weight) {
        this.node = node;
        this.weight = weight;
    }

    public static Tag of(final NodeDijkstra node, final Integer weight) {
        return new Tag(node,weight);
    }

    public NodeDijkstra getNode() {
        return node;
    }

    public Integer getWeight() {
        return weight;
    }

}
