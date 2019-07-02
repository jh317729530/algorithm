public class Test {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        ListNode leftFirst = new ListNode(2);
        ListNode leftSecond = new ListNode(4);
        ListNode leftThird = new ListNode(3);
        leftFirst.next = leftSecond;
        leftSecond.next = leftThird;

        ListNode rightFirst = new ListNode(5);
        ListNode rightSecond = new ListNode(6);
        ListNode rightThrid = new ListNode(4);
        rightFirst.next = rightSecond;
        rightSecond.next = rightThrid;


        ListNode leftNode = leftFirst;
        ListNode rightNode = rightFirst;
        int carry = 0;
        ListNode resultNode = new ListNode(0);
        ListNode currNode = resultNode;
        while (null != leftNode || null != rightNode) {

            int leftVal = null == leftNode ? 0 : leftNode.val;
            int rightVal = null == rightNode ? 0 : rightNode.val;
            int result = leftVal + rightVal + carry;

            carry = result / 10;
            currNode.next = new ListNode(carry % 10);
            currNode = currNode.next;

            leftNode = leftNode == null ? null : leftNode.next;
            rightNode = rightNode == null ? null : rightNode.next;
        }
        if (carry > 0) {
            currNode.next = new ListNode(carry);
        }
    }
}
