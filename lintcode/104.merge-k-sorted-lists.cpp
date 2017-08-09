/**
 * Definition of ListNode
 * class ListNode {
 * public:
 *     int val;
 *     ListNode *next;
 *     ListNode(int val) {
 *         this->val = val;
 *         this->next = NULL;
 *     }
 * }
 */
class Solution {
public:
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    ListNode *mergeKLists(vector<ListNode *> &lists) {
        int n = lists.size();
        if(n == 0)
            return NULL;
        
        ListNode *res = lists[0];
        for(int i = 1; i < n; ++i){
            res = mergeTwo(res, lists[i]);
        }
        
        return res;
    }
    
    ListNode *mergeTwo(ListNode *list1, ListNode *list2){
        if(!list1)
            return list2;
        if(!list2)
            return list1;
            
        if(list1->val <= list2->val){
            list1->next = mergeTwo(list1->next, list2);
            return list1;
        }
        
        list2->next = mergeTwo(list1, list2->next);
        return list2;
        
    }
};


