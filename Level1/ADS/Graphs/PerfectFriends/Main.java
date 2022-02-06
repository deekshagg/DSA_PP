import java.io.*;
import java.util.*;

public class Main {


   static class Edge{
      int v;
      int n;
      Edge(int v , int n){
         this.v = v;
         this.n = n;
      }
   }
   

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      ArrayList<Edge>[] graph = new ArrayList[n];
      for(int i = 0 ; i < n ; i++){
         graph[i] =  new ArrayList<>();
      }

      
      for(int i = 0 ; i < k ; i++){
         String s = br.readLine();
         String[] parts = s.split(" ");

         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         Edge e1 = new Edge(v1,v2);
         Edge e2 = new Edge(v2,v1);
         graph[v1].add(e1);
         graph[v2].add(e2);
      }

      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      boolean[] visited = new boolean[n];
      for(int i = 0 ; i < n ; i++){
         if(visited[i]== false){
            ArrayList<Integer> comp = new ArrayList<>();
            getcomponents(graph, i , comp , visited);
            comps.add(comp);
         }
      }
      int pairs = 0 ; 
      for(int i = 0 ; i < comps.size() ; i++){
         for(int j = i+1 ; j < comps.size() ; j++){
            pairs += (comps.get(i).size() * comps.get(j).size()); 
         }
      }
      System.out.println(pairs);
   }
   public static void getcomponents(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp , boolean[] visited){
      visited[src] =  true;
      comp.add(src);
      for(Edge e : graph[src]){
         if(visited[e.n] == false){
            getcomponents(graph, e.n, comp, visited);
         }
      }
   }

}