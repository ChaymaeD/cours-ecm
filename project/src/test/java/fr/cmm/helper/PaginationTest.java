package fr.cmm.helper;

import fr.cmm.tags.Functions;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * Created by pomme on 18/12/2015.
 */
public class PaginationTest {




    @Test
    public void getPageCountMultiple() {
        Pagination pagination = new Pagination();
        pagination.setCount(40);
        pagination.setPageSize(20);
        assertEquals(2, pagination.getPageCount());
        // pas la peine de tester pageSize = 0 puique la taille de la page ne peut pas etre nulle


    }

    @Test
    public void getPageCountNonMultiple() {
        Pagination pagination = new Pagination();
        pagination.setCount(50);
        pagination.setPageSize(20);
        assertEquals(3, pagination.getPageCount());
        // pas la peine de tester pageSize = 0 puique la taille de la page ne peut pas etre nulle


    }
    @Test
    public void getPageCountNull() {
        Pagination pagination = new Pagination();
        pagination.setCount(0);
        pagination.setPageSize(20);
        assertEquals(1, pagination.getPageCount());
        // pas la peine de tester pageSize = 0 puique la taille de la page ne peut pas etre nulle


    }

    @Test
    public void getPageCountInfPageSize() {
        Pagination pagination = new Pagination();
        pagination.setCount(20);
        pagination.setPageSize(50);
        assertEquals(1, pagination.getPageCount());
        // pas la peine de tester pageSize = 0 puique la taille de la page ne peut pas etre nulle

    }
    @Test
    public void getPagesCountNonMultiple(){

        Pagination pagination = new Pagination();
        pagination.setCount(50);
        pagination.setPageSize(20);
        List<Integer> result = asList(1,2,3);
        assertEquals(result, pagination.getPages());

        }
    @Test
    public void getPagesMultiple(){

        Pagination pagination = new Pagination();
        pagination.setCount(40);
        pagination.setPageSize(20);
        List<Integer> result = asList(1,2);
        assertEquals(result, pagination.getPages());

    }

    @Test
    public void getPagesCountNull(){

        Pagination pagination = new Pagination();
        pagination.setCount(0);
        pagination.setPageSize(20);
        List<Integer> result = asList(1);
        assertEquals(result, pagination.getPages());

    }

    @Test
    public void getPagesWithPageIndex(){

        Pagination pagination = new Pagination();
        pagination.setCount(20);
        pagination.setPageSize(1);
        pagination.setPageIndex(10);
        List<Integer> result = asList(6, 7, 8 ,9, 10, 11, 12, 13 ,14, 15);
        assertEquals(result, pagination.getPages());

    }



}