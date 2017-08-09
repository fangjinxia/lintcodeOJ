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
     * @return: True if the binary tree is BST, or false
     */
    bool isValidBST(TreeNode *root) {
        return isVal(root, LONG_MIN, LONG_MAX);
    }
    
    bool isVal(TreeNode *root, long low, long high){
        if(!root)
            return true;
        
        int tmp = root->val;
        if(tmp >= high || tmp <= low){
            return false;
        }
        return isVal(root->left, low, tmp) && isVal(root->right, tmp, high);
    }
};