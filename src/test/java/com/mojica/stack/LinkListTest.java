package com.mojica.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {

    @Test
    void linkList_isEmpty_ShouldReturnTrue(){

        LinkList linkList = new LinkList();

        boolean actual = linkList.isEmpty();

        assertTrue(actual);
    }

    @Test
    void linkList_isEmpty_ShouldReturnFalse(){
        //setup
        LinkList linkList = new LinkList();
        Object object = "Asahi";
        linkList.add(object);
        System.out.println(object);

        //exercise

        boolean actual = linkList.isEmpty();
        System.out.println(linkList);

        //assert

        assertFalse(actual);

    }

}
