/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listpractice;

/**
 *
 * @author Tatha
 */
public class ListNode<T>
{
    T data;
    ListNode<T> nextNode;

    public ListNode(T item) {
        this(item,null);
    }

    public ListNode(T item, ListNode<T> node) {
        this.data = item;
        this.nextNode = node;
    }
    
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode<T> nextNode) {
        this.nextNode = nextNode;
    }
    
}
