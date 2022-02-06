import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   static class Pair{
      int vtx;
      String psf;
      Pair(int vtx, String psf){
         this.vtx = vtx;
         this.psf = psf;
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      Queue<Pair> q = new ArrayDeque<>();
      q.add(new Pair(src, src + ""));
      boolean visited[] = new boolean[vtces];
      while(q.size()>0){
         // remove, mark*, work(printing here), add neighbours*
         Pair rp = q.remove();
         if(visited[rp.vtx] == true) continue;
         visited[rp.vtx] =  true;
         System.out.println(rp.vtx + "@" + rp.psf);
         for(Edge e : graph[rp.vtx]){
            if(visited[e.nbr] == false){
               q.add(new Pair(e.nbr, rp.psf + e.nbr));
            }
         }
      } 
   }
}