/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weboptimization;

import gui.ava.html.image.generator.HtmlImageGenerator;

/**
 *
 * @author James
 */
public class WebOptimization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator(); 
        imageGenerator.loadHtml("<html><head><meta charset=\"UTF-8\"></head><h1>Hello World!</h1> <p>Please goto <a title=\"Goto Google\" href=\"http://www.google.com\">Google</a>.</p></body></html>"); 
        imageGenerator.saveAsImage("hello-world.png"); 
        imageGenerator.saveAsHtmlWithMap("hello-world.html", "hello-world.png");
    }
    
}
