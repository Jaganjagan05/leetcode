class Solution {
    public int gcd(int a,int b){
       if(b==0) return a;
       return gcd(b,a%b);
    }
   public ListNode insertGreatestCommonDivisors(ListNode head) {
           var temp=head;
           while(temp.next!=null){
               var newNode=new ListNode(gcd(temp.val,temp.next.val),temp.next);
               temp.next=newNode;
               temp=newNode.next;
   
           }
           return head;
           
       }
   }