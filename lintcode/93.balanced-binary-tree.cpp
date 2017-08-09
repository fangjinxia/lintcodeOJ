/**
 * Definition of TreeNode:
 * class TreeNode {
 * public:
 *     int val;
 *     TreeNode *left, *right;
 *     TreeNode(int val) {
 *         this->val = val;
 *         this->left = this->right = NULL;
 *     }
 * }
 */
class Solution {
public:
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    bool isBalanced(TreeNode *root) {
        if(!root)
            return true;
        
        if(!isBalanced(root->left) || !isBalanced(root->right))
            return false;
        if(abs(depth(root->left) - depth(root->right)) <= 1)
            return true;
        return false;
    }
    
    int depth(TreeNode *root){
        if(root == NULL)
            return 0;
        return 1+max(depth(root->left), depth(root->right));
    }
};