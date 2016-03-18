package net.largepixels.interviewstructures.nodes.graph;

/**
 * Created by johnminchuk on 2/16/16.
 */
public class Node {

    public String value;
    public Node[] nodes;
    public boolean visited;

    public Node(String v) {
        value = v;
    }

    public Node(String v, Node[] n) {
        value = v;
        nodes = n;
    }

}
