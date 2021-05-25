import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTT 
{
	Node root;
  public static void main(String args[])
  {
	  BTT bt = new BTT();                         //           
	  bt.root = new Node(6);                      //           6
	                                              //         /   \
	  bt.root.left = new Node(3);                 //        3     8
	  bt.root.right = new Node(8);                //       / \   / \
	                                              //      2   4 5   9
	  bt.root.left.left = new Node(2);            //
	  bt.root.left.right = new Node(4);           //    InOrder   ----> left root right 2 3 4 6 5 8 9
	                                              //    PreOrder  ----> root left right 6 3 2 4 8 5 9
	  bt.root.right.left = new Node(5);           //    PostOrder ----> left right root 2 4 3 5 9 8 6
	  bt.root.right.right = new Node(9);
	  
//	  System.out.print("InOder : ");  InOrder(bt.root);
//	  System.out.print("\n");
//	  System.out.print("PreOrder : "); PreOrder(bt.root);
//	  System.out.print("\n");
//	  System.out.print("PostOrder : "); PostOrder(bt.root);
	
	  //leftView(bt.root);
 
	  
  }
  static void OutLine(Node node,int lev)
  {
	  if(node == null)
		  return;
//	  OutLine(node.left);
//	  Syste
  }
  static void leftView(Node node)
  {
	  if(node == null)
		  return;
	  leftView(node.left);
	  System.out.print(" "+node.data);
  }
  static void InOrder(Node node)
  {
	 if(node != null)
	  {
		 // System.out.println("root : "+node.data);
		  InOrder(node.left);
		  System.out.print(node.data+" ");
		  InOrder(node.right);
	  }
	 else
		 return;
  }
  static void PreOrder(Node node)
  {
     if(node == null)
    	 return;
     System.out.print(node.data+" ");
     PreOrder(node.left);
     PreOrder(node.right);
     
  }
  
  static void PostOrder(Node node)
  {
	  if(node==null)
		  return;
	  PostOrder(node.left);
	  PostOrder(node.right);
	  System.out.print(node.data+" ");
  }
}
class Node
{
    int data;	
	Node left,right;
	
	public Node(int data) 
	{
		this.data = data;
		right = left = null;
	}
}

//Node a = new Node(6);
//Node b = new Node(3);
//Node c = new Node(8);
//Node d = new Node(2);
//Node e = new Node(4);
//Node f = new Node(5);
//Node g = new Node(9);
//
//a.left = b;
//a.right = c;
//b.left = d;
//b.right = e;
//c.left = f;
//c.right = g;
