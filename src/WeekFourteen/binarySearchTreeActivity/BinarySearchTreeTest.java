package WeekFourteen.binarySearchTreeActivity;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTreeDemo tree = new BinarySearchTreeDemo();

        // add characters A through G in the correct order
        tree.addNode('D');
        tree.addNode('B');
        tree.addNode('F');
        tree.addNode('A');
        tree.addNode('C');
        tree.addNode('E');
        tree.addNode('G');

        // print out the traversals
        System.out.println("Inorder Traversal:");
        tree.inOrderTraverse(tree.getRoot());
        System.out.println("\nPreorder Traversal:");
        tree.preOrderTraverse(tree.getRoot());
        System.out.println("\nPostorder Traversal:");
        tree.postOrderTraverse(tree.getRoot());
    }
}
