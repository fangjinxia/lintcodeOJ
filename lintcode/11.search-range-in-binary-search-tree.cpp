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
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    vector<int> res;
    vector<int> searchRange(TreeNode* root, int k1, int k2) {
        // write your code here
        todoSearch(root, k1, k2);
        sort(res.begin(), res.end());
        return res;
    }
    
    void todoSearch(TreeNode* root, int k1, int k2){
        if(!root)
            return ;
        if(root->val >= k1 && root->val <= k2)
            res.push_back(root->val);
        
        todoSearch(root->left, k1, k2);
        todoSearch(root->right, k1, k2);
    }
};