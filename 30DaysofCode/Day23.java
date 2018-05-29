import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
	static void levelOrder(Node root){
      //Write your code here
      Node node[]=new Node[100];
          int f=0,l=1;
          if(root!=null)
          {
              node[f]=root;
              while(true){
                  System.out.print(node[f].data+" ");
                  if(node[f].left!=null)
                     node[l++]=node[f].left;
                  if(node[f].right!=null)
                     node[l++]=node[f].right;
                  f++;
                  if(f==l)
                    return;
                }
          }
    }
    public static Node insert(Node root,int data){
   	    if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}