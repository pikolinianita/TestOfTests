/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.luccasso.testoftests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author piko
 */
public class FirstTest {
    
    public FirstTest() {
    }

    @Test
    public void testSomeMethod() {
        var x = new First();
       
    }
    
    @ParameterizedTest
    @ValueSource( strings = {"a","b","c"})
    public void testParam(String s){
            var ds = new First(s);
        }
}
