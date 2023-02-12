/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author CJ
 */
public class Stack {

  private String arr[];
  private int top;
  private int capacity;

  Stack(int size) {
    arr = new String[size];
    capacity = size;
    top = -1;
  }

  public void push(String x) {
    arr[++top] = x;
  }
  
  public void pop() {
    top=top-1;
  }
  
  public Boolean isEmpty() {
    return top == -1;
  }

  public String printStack() {
    
      return arr[top];
      
  }
  

  public String[] getData()
  {
      
      return arr;
      
  }
    
}
