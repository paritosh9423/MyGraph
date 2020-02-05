import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
//sample for Undirected-Unweighted Graph
public class MyGraph{

int nodesCount =0 ;
Map<Integer,List<Integer>> adjacentList = new HashMap<>();

public MyGraph(){
  this.nodesCount=0;
  this.adjacentList = new HashMap<>();
}

public boolean addVertex(Integer val){

    this.adjacentList.put(val , new ArrayList<>());
    this.nodesCount++;
    return true;

    }


public void addEdge(Integer node1 , Integer node2){
  //connect node2 and node 1
  List<Integer> list = this.adjacentList.get(node1);
  list.add(node2);
  this.adjacentList.put(node1,list);
  //connect node1 and node2
  list=null;
  list = this.adjacentList.get(node2);
  list.add(node1);
  this.adjacentList.put(node2, list);
}

public void printGraph(){
  if(this.nodesCount > 0){
    for(Integer key : this.adjacentList.keySet()){
      List l = adjacentList.get(key);
      System.out.println(key+" --> "+l.toString());
    }
  }
}

}