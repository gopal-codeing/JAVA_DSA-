class Countnumbernode {
    public int countNodes(TreeNode root) {
        // jay shree ram 
  
      if(root == null){
       return 0;
    }
      
     return 1+ countNodes(root.left) + countNodes(root.right);
    }
}
