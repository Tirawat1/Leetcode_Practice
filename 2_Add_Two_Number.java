class Solution {

        public class ListNode {
                int val;
                ListNode next;
                ListNode() {}
                ListNode(int val) { this.val = val; }
                ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        public ListNode initListNode(int[] arr){
                ListNode head = new ListNode(arr[0]);
                ListNode temp = head;
                for(int i=1; i<arr.length; i++){
                        temp.next = new ListNode(arr[i]);
                        temp = temp.next;
                }
                return head;
        }

        public ListNode addTwoNumbers(ListNode l1 , ListNode l2){
                
                ListNode dummyHead = new ListNode(0);
                ListNode p = l1, q = l2 , curr = dummyHead;
                int carry = 0 ;
                while(p != null || q != null){
                        int x = (p != null) ? p.val : 0;
                        int y = (q != null) ? q.val : 0;
                        int sum = carry + x + y;
                        // result += ( sum % 10 ) * Math.pow(10,i);
                        // System.out.println(result + " " + sum);
                        carry = sum / 10;

                        curr.next = new ListNode(sum % 10);
                        curr = curr.next;
                        if(p != null) p = p.next;
                        if(q != null) q = q.next;
                }

                if(carry > 0){
                        curr.next = new ListNode(carry);
                }

                return dummyHead.next;
        }


        public static void main(String args[]){
                Solution solution = new Solution();
                // Creating the first number 243 (2 -> 4 -> 3)
                int[] arr1 = {2,4,3} ;
                int[] arr2 = {5,6,4} ;
                ListNode l1 = solution.initListNode(arr1);
                ListNode l2 = solution.initListNode(arr2);

                ListNode result = solution.addTwoNumbers(l1,l2);
                // System.out.println(result);
                
                while (result != null) {
                        System.out.print(result.val + " ");
                        result = result.next;
                }


        }
}

// class Solution {

//         public class ListNode {
//             int val;
//             ListNode next;
//             ListNode() {}
//             ListNode(int val) { this.val = val; }
//             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//         }
    
//         public ListNode initListNode(int[] arr) {
//                 if (arr == null || arr.length == 0) {
//                     return null;  // Handle empty or null array input
//                 }
        
//                 ListNode head = new ListNode(arr[0]);  // Initialize the first node
//                 ListNode temp = head;
//                 for (int i = 1; i < arr.length; i++) {
//                     temp.next = new ListNode(arr[i]);
//                     temp = temp.next;
//                 }
//                 return head;
//             }
    
//         // Function to add two numbers represented by linked lists
//         public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//             ListNode dummyHead = new ListNode(0);
//             ListNode p = l1, q = l2, curr = dummyHead;
//             int carry = 0;
    
//             while (p != null || q != null) {
//                 int x = (p != null) ? p.val : 0;
//                 int y = (q != null) ? q.val : 0;
//                 int sum = carry + x + y;
//                 carry = sum / 10;  // Update carry
//                 curr.next = new ListNode(sum % 10);  // Create new node with the remainder
//                 curr = curr.next;  // Move the current pointer
    
//                 if (p != null) p = p.next;
//                 if (q != null) q = q.next;
//             }
    
//             // If there's a carry left after the loop, add a new node for it
//             if (carry > 0) {
//                 curr.next = new ListNode(carry);
//             }
    
//             return dummyHead.next;  // Return the head of the result list
//         }
    
//         public static void main(String args[]) {
//             Solution solution = new Solution();
//             // Creating the first number 243 (2 -> 4 -> 3)
//             int[] arr1 = {2, 4, 3};
//             int[] arr2 = {5, 6, 4};
    
//             // Initialize the linked lists
//             ListNode l1 = solution.initListNode(arr1);
//             ListNode l2 = solution.initListNode(arr2);
    
//             // Add the two numbers represented by the linked lists
//             ListNode result = solution.addTwoNumbers(l1, l2);
    
//             // Print the result
//             while (result != null) {
//                 System.out.print(result.val + " ");
//                 result = result.next;
//             }

            
//         }
//     }
    