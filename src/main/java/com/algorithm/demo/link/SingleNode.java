package com.algorithm.demo.link;

/**
 * Created by IntelliJ IDEA.
 * <p>
 * 单链表
 *
 * @author huacy
 * @since 2017/08/01
 */
public class SingleNode {

    //变量
    private int record;
    //指向下一个对象
    private SingleNode nextSingleNode;

    public SingleNode(int record) {
        this.record = record;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public SingleNode getNextSingleNode() {
        return nextSingleNode;
    }

    public void setNextSingleNode(SingleNode nextSingleNode) {
        this.nextSingleNode = nextSingleNode;
    }
}
