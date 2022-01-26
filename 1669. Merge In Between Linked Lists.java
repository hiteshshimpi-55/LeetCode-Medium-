//C++
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeInBetween(ListNode* list1, int a, int b, ListNode* list2) {
        
        int count = 1;
        ListNode *curr = list1;
        ListNode *start , *end;
        
        while(curr!=nullptr)
        {
            if(count==a)
            {
                start=curr;
            }
            if(count==b)
            {
                end=curr->next->next;
            }
            count++;
            curr=curr->next;
        }
        start->next = list2;
        curr = list2;
        while(curr->next!=nullptr)
        {
            curr=curr->next;
        }
        curr->next = end;
        
        return list1;
    }
};

//JAVA
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        int count = 1;
        ListNode cur = list1;
        ListNode start=list1,end=list1; 
        while(cur!=null)
        {
            if(count==a)
            {
                start = cur;
            }
            
            if(count==b)
            {
                end = cur.next.next;
            }
            count++;
            cur = cur.next;
        }
        start.next = list2;
        cur        = list2;
        while(cur.next!=null)
        {
            cur = cur.next;
        }
        cur.next = end;
        
        return list1;
    }
}
