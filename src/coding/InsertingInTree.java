package coding;

import java.util.LinkedList;
import java.util.Queue;

public class InsertingInTree 
{
	static class Node
	{
		int key;
		Node left,right;
		Node(int key)
		{
			this.key=key;
			left=right=null;
		}
	}
	public static void inorder(Node node)
	{
		if(node==null)
			return;
		
		inorder(node.left);
		System.out.print(node.key+" ");
		inorder(node.right);
	}
	static void insert(int key,Node node )
	{
		Node temp=null;
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		
		while(!q.isEmpty())
		{
			temp =q.peek();
			q.remove();
			if(temp.left==null)
			{
				temp.left = new Node(key);
				return;
			}
			else
				q.add(temp.left);
			
			if(temp.right==null)
			{
				temp.right = new Node(key);
				return;
			}
			else
				q.add(temp.right);
			
		}
	}
	public static void main(String args[])
	{
		Node n = new Node(10);
		n.left = new Node(11);
		n.right = new Node(9);
		n.left.left = new Node(7);
		n.right.left = new Node(15);
		n.left.right = new Node(8);
		//before the insertion
		System.out.println("before insertion");
		inorder(n);
		int keyToInsert = 12;
		insert(keyToInsert,n);
		System.out.println("after the insertion");
		inorder(n);
	}

}
