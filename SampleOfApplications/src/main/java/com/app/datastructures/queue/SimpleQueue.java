/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.datastructures.queue;

/**
 *
 * @author prokopiukd
 */
public interface SimpleQueue {
    
    public int size();
    
    public boolean isEmpty();
    
    //add
    public void enqueue(Object object);
    
    //removes and returns the first item
    public Object dequeue();
    
}
