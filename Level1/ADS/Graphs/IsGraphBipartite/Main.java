package Level1.ADS.Graphs.IsGraphBipartite;

import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      // write your code here
      int[] visited = new int[vtces];
      Arrays.fill(visited, -1);
      for(int v = 0 ; v < vtces ; v++){
         if(visited[v] == -1){
            if(isbipartite(graph, v, visited) == false){
               System.out.println(false);
               return;
            }
         }
      }
      System.out.println(true);
   }
   public static boolean isbipartite(ArrayList<Edge>[] graph, int src, int[] visited){
      ArrayDeque<Pair> q = new ArrayDeque<>();
      q.add(new Pair(src,src+"",0));
      while(q.size()>0){
         Pair rp = q.remove();
         if(visited[rp.vtx] != -1){
            if(rp.level != visited[rp.vtx])
               return false;
         }
         else visited[rp.vtx] = rp.level; 
         for(Edge e : graph[rp.vtx]){
            if(visited[e.nbr]==-1){
               q.add(new Pair(e.nbr, rp.psf + e.nbr , rp.level + 1));
            }
         }
      }
      return true;
   }
   static class Pair{
      int vtx;
      String psf;
      int level;
      Pair(int vtx, String psf, int level){
         this.vtx = vtx;
         this.psf = psf;
         this.level = level;
      }
   }
}