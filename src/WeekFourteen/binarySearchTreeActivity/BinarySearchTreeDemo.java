package WeekFourteen.binarySearchTreeActivity;

public class BinarySearchTreeDemo {
    private Node root;

    // add a node to the tree
    public void addNode(char key) {
        Node newNode = new Node(key); // create and initialize a new Node
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parent;
            while (true) {
                parent = currentNode;
                if (key < currentNode.getKey()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    // inorder traversal: all nodes are visited in ascending order
    // recursion is used to visit a node and then its child nodes
    public void inOrderTraverse(Node currentNode) {
        if (currentNode != null) {
            inOrderTraverse(currentNode.getLeftChild()); // traverse the left side
            System.out.print(currentNode.getKey() + " "); // print the current node visited
            inOrderTraverse(currentNode.getRightChild()); // traverse the right side
        }
    }

    public void preOrderTraverse(Node currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.getKey() + " "); // print the current node visited
            preOrderTraverse(currentNode.getLeftChild()); // traverse the left side
            preOrderTraverse(currentNode.getRightChild()); // traverse the right side
        }
    }

    public void postOrderTraverse(Node currentNode) {
        if (currentNode != null) {
            postOrderTraverse(currentNode.getLeftChild()); // traverse the left side
            postOrderTraverse(currentNode.getRightChild()); // traverse the right side
            System.out.print(currentNode.getKey() + " "); // print the current node visited
        }
    }

    public String findNode(char key) {
        Node currentNode = root; // start at the root node
        while (currentNode.getKey() != key) {
            if (key < currentNode.getKey()) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) {
                return String.format("%c not found", key);
            }
        }
        return String.format("%c was found", currentNode.getKey());
    }

    public Node getRoot() {
        return root;
    }

    public String removeNode(char key) {
        Node currentNode = root; // start at top of tree
        Node parent = root;
        boolean isLeftChild = true; // we use this to tell us whether to search right or left
        while (currentNode.getKey() != key) {
            parent = currentNode;
            if (key < currentNode.getKey()) {
                isLeftChild = true;
                currentNode = currentNode.getLeftChild();
            } else {
                isLeftChild = false;
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) {
                return String.format("%c not found", key);
            }
        }

        // if node has no children, remove it
        if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
            if (currentNode == root) {
                root = null;
            } else if (isLeftChild) {
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }
        } else if (currentNode.getRightChild() == null) {
            if (currentNode == root) {
                root = currentNode.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(currentNode.getLeftChild());
            } else {
                parent.setRightChild(currentNode.getLeftChild());
            }
        } else if (currentNode.getLeftChild() == null) {
            if (currentNode == root) {
                root = currentNode.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(currentNode.getRightChild());
            } else {
                parent.setRightChild(currentNode.getRightChild());
            }
        } else {
            Node replacement = getReplacementNode(currentNode);
            if (currentNode == root) {
                root = replacement;
            } else if (isLeftChild) {
                parent.setLeftChild(replacement);
            } else {
                parent.setRightChild(replacement);
            }
            replacement.setLeftChild(currentNode.getLeftChild());
        }
        return String.format("%c was removed", key);
    }

    public Node getReplacementNode(Node replacedNode) {
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;
        Node currentNode = replacedNode.getRightChild();
        while (currentNode != null) {
            replacementParent = replacement;
            replacement = currentNode;
            currentNode = currentNode.getLeftChild();
        }
        if (replacement != replacedNode.getRightChild()) {
            replacementParent.setLeftChild(replacement.getRightChild());
            replacement.setRightChild(replacedNode.getRightChild());
        }
        return replacement;
    }
}



