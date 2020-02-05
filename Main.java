class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

  MyGraph graph = new MyGraph();

  graph.addVertex(0);
  graph.addVertex(1);
  graph.addVertex(2);
  graph.addVertex(3);

  graph.addEdge(0, 1);
  graph.addEdge(1, 2);
  graph.addEdge(2, 3);
  graph.addEdge(3,1);

  graph.printGraph();

  }
}