/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    // TODO
    public void userWithMostLikes(){
        Map<Integer,Integer> userLikesCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        for(User user : users.values()){
            for(Comment comment : user.getComments())
            {
                int likes = 0;
                if(userLikesCount.containsKey(user.getId())){
                    likes = userLikesCount.get(user.getId());
                }
                likes+=comment.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for(int id : userLikesCount.keySet()){
            if(userLikesCount.get(id)>max){
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: "+max+"\n"+ users.get(maxId));
       
    }
    
    // find 5 comments which have the most likes
    // TODO
    
    public void getFiveMostLikedComment(){
         Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        Collections.sort(commentList, new Comparator<Comment>(){
            @Override
            public int compare(Comment c1, Comment c2){
                return c2.getLikes()-c1.getLikes();
            }
        });
        System.out.println("5 most liked comments: ");
        for(int i=0; i<commentList.size() && i<5; i++){
            System.out.println(commentList.get(i));
        }
    }
    
    public void getAvgNoOfLikesPerComment(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
       List<Comment> commentList = new ArrayList<>(comments.values());
       int sum=0;
        for (Comment comment : commentList) {
            if(comment!=null){
                sum = sum+comment.getLikes();
            }
        }
        double avg = sum/commentList.size();
        System.out.println("Average Number of Likes Per Comment : "+avg);
    }
    
    public void getPostWithMostLikedComments(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int postId = 0;
        int id = 0;
        int max = 0;
        List<Comment> commentList = new ArrayList<>(comments.values());
        for (Comment comment : commentList) {
            if(comment.getLikes()>max) {
                max = comment.getLikes();
                postId = comment.getPostId();
                id = comment.getId();
            }
        }
        System.out.println("Post with the most liked Comments are :"+postId+"\n"+comments.get(id));
    }
    
    public void getPostWithMoreComments(){
        Map<Integer, Integer> postLikesCount = new HashMap<>();
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
            for (Comment comment : comments.values()) {
                int postCount =0;
                if(postLikesCount.containsKey(comment.getPostId())){
                    postCount = postLikesCount.get(comment.getPostId());
                }
                postCount++;
                postLikesCount.put(comment.getPostId(),postCount);
            }
        int max = 0;
        int maxId = 0;
        for(int id : postLikesCount.keySet()){
            if(postLikesCount.get(id)>max){
                max = postLikesCount.get(id);
                maxId = id;
    }
}
        System.out.println("Post with most comments :"+maxId);
    }
    
    public void inactiveUsersBasedOnTotalPostsNumber() {
        Map<Integer,List<Integer>> postsCount = new HashMap<>();
         Map<Integer,Post> posts = DataStore.getInstance().getPosts();
         Map<Integer,User> users = DataStore.getInstance().getUsers();
           for(Post post : posts.values()){
            List<Integer> list = new ArrayList<>();
               for (Comment comment : post.getComments()) {
                   if(!list.contains(comment.getPostId()))
                    list.add(comment.getPostId()); 
               }
               postsCount.put(post.getUserId(),list); 
           }    
           if(!postsCount.containsKey(users.keySet())){
               HashSet<Integer> unionKeys = new HashSet<>(postsCount.keySet());
               unionKeys.addAll(users.keySet());
               unionKeys.removeAll(postsCount.keySet()); 
               for (Integer unionKey : unionKeys) {
                   postsCount.put(unionKey, new ArrayList<Integer>());
               }
           }
          ArrayList<Map.Entry<Integer, List<Integer>>> list =  new ArrayList<>(postsCount.entrySet());
           Collections.sort(list, new Comparator<Map.Entry<Integer, List<Integer>>>(){
           @Override
        public int compare(Map.Entry<Integer, List<Integer>> left, Map.Entry<Integer, List<Integer>> right) {
         return Integer.compare(right.getValue().size(), left.getValue().size());
        }
       });
        System.out.println("Inactive User Based On Total Posts: ");
         for(int i=list.size()-1; i>0 &&i>list.size()-6;i--){
             System.out.println(users.get(list.get(i).getKey()));
         }
     }
    public void inactiveUsersBasedOnTotalComments(){
        Map<Integer,User> users = DataStore.getInstance().getUsers();
           ArrayList<User> userList = new ArrayList<>(users.values());
         Collections.sort(userList, new Comparator<User>(){
            @Override
            public int compare(User u1, User u2){
                return u1.getComments().size()-u2.getComments().size();
            }
        });
        System.out.println("Inactive User Based On Total Comments: ");
         for(int i=0; i<userList.size() && i<5 ;i++){
             System.out.println(userList.get(i));
         }
    }
    
    public void inactiveAndProcativeUsersOverall(){
         Map<Integer,List<Integer>> postsCount = new HashMap<>();
         Map<Integer,Integer> totalCount = new HashMap<>();
         Map<Integer,Integer> userLikesCount = new HashMap<>();
         Map<Integer,Post> posts = DataStore.getInstance().getPosts();
         Map<Integer,User> users = DataStore.getInstance().getUsers();
           for(Post post : posts.values()){
            List<Integer> list = new ArrayList<>();
               for (Comment comment : post.getComments()) {
                   if(!list.contains(comment.getPostId()))
                    list.add(comment.getPostId()); 
               }
               postsCount.put(post.getUserId(),list); 
               totalCount.put(post.getUserId(),list.size()+users.get(post.getUserId()).getComments().size());
           }
           for(User user : users.values()){
            for (Comment comment : user.getComments()) {
                int likes =0;
                if(userLikesCount.containsKey(user.getId())){
                    likes = userLikesCount.get(user.getId());
                }
                likes+=comment.getLikes();
                userLikesCount.put(user.getId(),likes);
            }
        }
           if(!postsCount.containsKey(users.keySet())){
               HashSet<Integer> unionKeys = new HashSet<>(postsCount.keySet());
               unionKeys.addAll(users.keySet());
               unionKeys.removeAll(postsCount.keySet()); 
               for (Integer unionKey : unionKeys) {
                   postsCount.put(unionKey, new ArrayList<Integer>());
                   totalCount.put(unionKey,0+users.get(unionKey).getComments().size());
               }
           }
           List<Map<Integer,Integer>> list = new ArrayList<>();
           list.add(totalCount);
           list.add(userLikesCount);
           Map<Integer, Integer> result = new HashMap<>();
   
           for (Map<Integer, Integer> map : list) {
               for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                   int key = entry.getKey();
                   Integer curVal = result.get(key);
                   result.put(key, curVal==null?entry.getValue():(entry.getValue()+curVal));
               }
           }
            ArrayList<Map.Entry<Integer,Integer>> resultList =  new ArrayList<>(result.entrySet());
           Collections.sort(resultList, new Comparator<Map.Entry<Integer,Integer>>(){
           @Override
        public int compare(Map.Entry<Integer,Integer> left, Map.Entry<Integer,Integer> right) {
         return Integer.compare(right.getValue(), left.getValue());
        }
       });
           System.out.println("Top 5 Inactive Users: ");
         for(int i=resultList.size()-1; i>resultList.size()-6 && i>0 ;i--){
             System.out.println(users.get(resultList.get(i).getKey()));
         }
         System.out.println("Top 5 ProActive Users: ");
         for(int i=0; i<resultList.size() && i<5 ;i++){
             System.out.println(users.get(resultList.get(i).getKey()));
         }
     }
    }
    
