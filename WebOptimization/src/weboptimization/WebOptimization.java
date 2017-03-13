/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weboptimization;

import gui.ava.html.image.generator.HtmlImageGenerator;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author James
 */
public class WebOptimization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
        imageGenerator.loadHtml("<html><head><meta charset=\"UTF-8\"></head><h1>Hello World!</h1> <p>Please goto <a title=\"Goto Google\" href=\"http://www.google.com\">Google</a>.</p></body></html>"); 
        imageGenerator.saveAsImage("hello-world.png"); 
        imageGenerator.saveAsHtmlWithMap("hello-world.html", "hello-world.png");
        
        BufferedImage image = ImageIO.read(new File("hello-world.png"));    
        int w = image.getWidth();
        int h = image.getHeight();
        
        int white = 0;
        int non_white = 0;
        float whitespace = 0.0f;
        
        for(int x = 0; x < w; x++) 
        {
            for(int y = 0; y < h; y++)
            {
                Color c = new Color(image.getRGB(x, y));
                System.out.println("Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
                
                if (c.getRed() == 255 && c.getGreen() == 255 && c.getBlue() == 255)
                    white++;
                else
                    non_white++;
            }
        }
        
        whitespace = (float) non_white / white;
        
        System.out.println("white pixels: " + white);
        System.out.println("non_white pixels: " + non_white);
        System.out.println("Whitespace ratio(non_white vs. white): " + whitespace);
    }
    
}
