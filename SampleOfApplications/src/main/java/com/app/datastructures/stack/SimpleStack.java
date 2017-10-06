/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.datastructures.stack;

/**
 *
 * @author prokopiukd
 */
public interface SimpleStack {

    public boolean isEmpty();

    public int size();

    //add to top
    public void push(Object object);

    //get last item and removes it
    public Object pop();

}
