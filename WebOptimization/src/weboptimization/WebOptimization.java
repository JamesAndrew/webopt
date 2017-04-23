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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        Site webpage = new Site();
        
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
        imageGenerator.loadHtml(webpage.getHTMLString()); 
        
        imageGenerator.saveAsImage("hello-world.png");
        
        
        int max_steps = 50;
        for(int i = 0; i < max_steps; i++)
        {
            int constraints = webpage.checkConstraints();
            if(constraints > 0)
            {
                System.out.println(constraints + " constraints violated");
                if(webpage.getP_font() == false)
                {
                    webpage.adjustP_font();
                }
                
                if(webpage.getChars() == false)
                {
                    webpage.adjustChars();
                }
                
                if(webpage.getSpace() == false)
                {
                    webpage.adjustSpace();
                }
            }
            else
                i = max_steps;
            
            webpage.setHTMLString();
            imageGenerator.loadHtml(webpage.getHTMLString()); 
            imageGenerator.saveAsImage("hello-world.png"); 
        }
    }
    
}
