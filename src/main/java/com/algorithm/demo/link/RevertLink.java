package com.algorithm.demo.link;

/**
 * Created by IntelliJ IDEA.
 *
 * @author huacy
 * @since 2017/08/01
 */
public class RevertLink {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // 构造链表
        int len = 10;
        SingleNode[] nodes = new SingleNode[len];
        for(int i = 0; i < len; i++) {
            nodes[i] = new SingleNode(i);
        }
        for(int i = 0; i < len - 1; i++) {
            nodes[i].setNextSingleNode(nodes[i+1]);
        }

        // 结果
        SingleNode result = recursion(nodes[0]);
        do {
            System.out.print(result.getRecord() + "->");
            result = result.getNextSingleNode();
        }while(result != null);
        System.out.println();
        System.out.println("timeUse = " + (System.currentTimeMillis() - start));
    }

    /**
     * 递归反转链表
     * 传入头节点
     *
     */
    private static SingleNode recursion(SingleNode head) {
        // 当为空或者本节点为末尾节点的时候
        if (head == null || head.getNextSingleNode() == null) {
            return head;
        }

        SingleNode reversedHead = recursion(head.getNextSingleNode());
        // 获取先前的下一个节点，让该节点指向自身
        head.getNextSingleNode().setNextSingleNode(head);
        // 破坏以前自己指向下一个节点
        head.setNextSingleNode(null);
        // 层层传递给最上面的
        return reversedHead;
    }
}
