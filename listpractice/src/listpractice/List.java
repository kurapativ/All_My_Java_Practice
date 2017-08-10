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
public class List<T> 
{
    ListNode<T> firstNode;
    ListNode<T> lastNode;
    private String name;
    
    public List()
    {
        name="list";
    }
    public List(String name)
    {
        this.name=name;
    }
    public boolean isEmpty()
    {
        if(firstNode==null)
        {
            return true;
        }
        return false;
    }
    
    public void print()
    {
        if(isEmpty())
        {
            System.out.println("The list is empty");
        }
        else
        {
            ListNode<T> curr=firstNode;
            while(curr==null)
            {
                System.out.print(curr.data);
                System.out.print("\t");
                curr=curr.nextNode;
            }
        }
    }
    public void insertAtFront(T item)
    {
        if(isEmpty())
        {
            firstNode=lastNode=new ListNode<T>(item);
        }
        else
        {
            ListNode<T> newOne= new ListNode<T>(item,firstNode);
            firstNode=newOne;
        }
    }
    public void insertAtBack(T item)
    {
        if(isEmpty())
        {
            firstNode=lastNode=new ListNode<T>(item);
        }
        else
        {
            ListNode<T> newOne= new ListNode<T>(item);
            lastNode.nextNode=newOne;
            lastNode=newOne;
        }
    }
            
    
}
