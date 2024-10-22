package graph;

import java.util.HashMap;
import java.util.HashSet;


public class graphCreation {
    HashMap<Integer,HashMap<Integer,Integer>> map;

        public  graphCreation(int v){
            this.map=new HashMap<>();
            for (int i = 1; i <=v ; i++) {
                map.put(i,new HashMap<>());
            }
        }

        public void AddEdge(int v1,int v2,int cost){
            map.get(v1).put(v2,cost);
            map.get(v2).put(v1,cost);
        }

        public boolean ContainsEdge(int v1,int v2){
            return map.get(v1).containsKey(v2)&&map.get(v2).containsKey(v1);
        }

        public boolean ContainsVertex(int v1){
            return map.containsKey(v1);
        }

        public int Nbr_of_edge(){
            int sum=0;
            for(int key:map.keySet()){
                sum=sum+map.get(key).size();
            }
            return sum/2;
        }

        public void RemoveEdge(int v1,int v2){
            if(ContainsEdge(v1,v2)){
                map.get(v1).remove(v2);
                map.get(v2).remove(v1);
            }
        }

        public void RemoveVertex(int v1){
            for(int key:map.get(v1).keySet()){
                map.get(key).remove(v1);
            }
            map.remove(v1);
        }

        public void Display(){
            for(int key: map.keySet()){
                System.out.println(key+"--->"+map.get(key));
            }
        }

        //has path btween src and destination
        public boolean hasPath(int src, int dest, HashSet<Integer> visited){
            if(src==dest){
                return true;
            }
            visited.add(src);
            for(int neighbrs:map.get(src).keySet()){
                if(!visited.contains(neighbrs)){
                    boolean ans=hasPath(neighbrs,dest,visited);
                    if(ans){
                        return ans;

                }

                }
            }
            visited.remove(src);
            return false;
        }
    public void printAllPath(int src, int dest, HashSet<Integer> visited,String ans){
        if(src==dest){
            System.out.println(ans+src);
            return ;
        }
        visited.add(src);
        for(int neighbrs:map.get(src).keySet()){
            if(!visited.contains(neighbrs)){
                printAllPath(neighbrs,dest,visited,ans+src+" ");
            }
        }
        visited.remove(src);

    }




    }

