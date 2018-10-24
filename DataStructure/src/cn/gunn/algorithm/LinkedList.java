package cn.gunn.algorithm;

/**
 * 链表
 * @author gjh31
 */
public class LinkedList<T> {

    private Node head;

    public static class Node<T> {

        private T t;

        private Node next;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * 反转链表 迭代
     * @return
     */
    public LinkedList iterativeReverse() {
        if (null == head) {
            return this;
        }
        Node currentNode = head;
        Node prevNode = null;
        while (currentNode != null) {
            Node next = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = next;
        }
        this.setHead(prevNode);
        return this;
    }

    /**
     * 反转链表 递归
     * @return
     */
    public Node recursiveReverse(Node currentNode) {
        if (currentNode == null) {
            return null;
        }
        Node prevNode = recursiveReverse(currentNode.next);
        currentNode.next = prevNode;
        return currentNode.next;
    }

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Node<Integer> head = new Node<>();
        head.setT(1);
        Node<Integer> secondeNode = new Node<>();
        secondeNode.setT(2);
        head.setNext(secondeNode);

        Node<Integer> thirdNode = new Node<>();
        thirdNode.setT(3);
        secondeNode.setNext(thirdNode);
        integerLinkedList.setHead(head);

        LinkedList reversedLinkedList = integerLinkedList.iterativeReverse();
        Node reversedHead = reversedLinkedList.getHead();
        while (reversedHead != null) {
            System.out.println(reversedHead.getT());
            reversedHead = reversedHead.next;
        }

        System.out.println("---------------reverse again----------------");
        Node node = integerLinkedList.recursiveReverse(integerLinkedList.getHead());
        while (node != null) {
            System.out.println(node.getT());
            node = node.next;
        }
    }
}
