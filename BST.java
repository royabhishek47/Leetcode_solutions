package TutorOps;

public class BST {
    public static class node{
        int data;
        node root;
        node left;
        node right;
        node(int data){
            this.data = data;
        }
    }
    public static node insertNode(node root, int val){
        if(root==null){
            root = new node(val);
            return root;
        }
        else if(val<root.data){
            root.left = insertNode(root.left,val);
        }
        else{
            root.right = insertNode(root.right,val);
        }
        return root;
    }
    public static void inorder(node root){
        if(root!=null){
            inorder(root.left);    
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int a[] = {5,3,6,2,7,1};
        node root = null;
        for(int i =0; i<a.length; i++){
            root = insertNode(root,a[i]);
        }
        inorder(root);
        System.out.println();
    }
}
