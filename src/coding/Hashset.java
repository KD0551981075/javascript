package coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
	private static final Node node  = null;

	public static void main(String args[])
	{
		Set<Integer> firstSet = new HashSet<Integer>();
		firstSet.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
		
		Set<Integer> secondSet = new HashSet<Integer>();
		secondSet.addAll(Arrays.asList(new Integer[] {3,4,7,8}));
		
		//System.out.println("firstSet"+firstSet);
		//System.out.println("secondSet"+secondSet);
		
		//testing the access-specifier
		BinaryTree binaryTreeObj = new BinaryTree();
		binaryTreeObj.printInorder();
		binaryTreeObj.printPostorder(node);
		binaryTreeObj.printPreorder(node);
		
		//union
		Set<Integer> union = new HashSet<Integer>(firstSet);
		union.addAll(secondSet);
		System.out.println("firstSet.addAll(secondSet)"+union);
		//intersection
		Set<Integer> intersection = new HashSet<Integer>(firstSet);
		intersection.retainAll(secondSet);
		System.out.println("firstSet.retainAll(secondSet)"+intersection);
		//deletion
		Set<Integer> deletionWhichAreCommon = new HashSet<Integer>(firstSet);
		deletionWhichAreCommon.removeAll(secondSet);
		System.out.println("firstSet.removeAll(secondSet)"+deletionWhichAreCommon);
		
		
	}

}
