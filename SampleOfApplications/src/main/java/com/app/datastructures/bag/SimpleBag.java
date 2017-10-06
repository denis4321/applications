/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.datastructures.bag;

/**
 *
 * @author prokopiukd
 * 
 * Bag only store data.
 * No way to get item or remove.
 * 
 */
public interface SimpleBag {

    public boolean isEmpty();

    public int size();

    public void add(Object item);

}
