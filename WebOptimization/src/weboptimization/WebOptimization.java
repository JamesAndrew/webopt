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
        int width = 1024;
        int height = 768;
        
        int body_sidemargin;
        int body_bmargin;
        
        int h1_tmargin;
        int h1_bmargin;
        int h1_fontsize;
        
        int p_tmargin;
        int p_bmargin;
        int p_fontsize;
        
        String html = "<html><head><meta charset=\"UTF-8\"><style>body{width: " + width + "px; max-width: " + width + 
                "px; height: " + height + "px; max-height: " + height + "px; overflow: hidden; margin-right:auto; margin-left: auto; font-family: Georgia;} h1{margin: 10px;} p{margin: 10px;}</style></head><body><h1>CHAPTER VII. A Mad Tea-Party</h1>" +
                "<p>There was a table set out under a tree in front of the house, and the" +
    "March Hare and the Hatter were having tea at it: a Dormouse was sitting " +
    "between them, fast asleep, and the other two were using it as a " +
    "cushion, resting their elbows on it, and talking over its head. ‘Very " +
    "uncomfortable for the Dormouse,’ thought Alice; ‘only, as it’s asleep, I " +
    "suppose it doesn’t mind.’</p>" +
    "<p>The table was a large one, but the three were all crowded together at\n" +
    "one corner of it: ‘No room! No room!’ they cried out when they saw Alice\n" +
    "coming. ‘There’s PLENTY of room!’ said Alice indignantly, and she sat\n" +
    "down in a large arm-chair at one end of the table.</p>" +
    "<p>‘Have some wine,’ the March Hare said in an encouraging tone.</p>" +
    "<p>Alice looked all round the table, but there was nothing on it but tea." +
    "‘I don’t see any wine,’ she remarked.</p>" +
    "<p>‘There isn’t any,’ said the March Hare.</p>" +
    "<p>‘Then it wasn’t very civil of you to offer it,’ said Alice angrily.</p>" +
    "<p>‘It wasn’t very civil of you to sit down without being invited,’ said" +
    "the March Hare.</p>" +
    "<p>‘I didn’t know it was YOUR table,’ said Alice; ‘it’s laid for a great" +
    "many more than three.’</p>" +
    "<p>‘Your hair wants cutting,’ said the Hatter. He had been looking at Alice" +
    "for some time with great curiosity, and this was his first speech.</p>" +
    "<p>‘You should learn not to make personal remarks,’ Alice said with some" +
    "severity; ‘it’s very rude.’</p>" +
    "<p>The Hatter opened his eyes very wide on hearing this; but all he SAID " +
    "was, ‘Why is a raven like a writing-desk?’</p>" +
    "<p>‘Come, we shall have some fun now!’ thought Alice. ‘I’m glad they’ve " +
    "begun asking riddles.--I believe I can guess that,’ she added aloud.</p>" +
    "<p>‘Do you mean that you think you can find out the answer to it?’ said the " +
    "March Hare.</p>" +
    "<p>‘Exactly so,’ said Alice.</p>" +
    "<p>‘Then you should say what you mean,’ the March Hare went on.</p>" +
    "<p>‘I do,’ Alice hastily replied; ‘at least--at least I mean what I " +
    "say--that’s the same thing, you know.’</p>" +
    "<p>‘Not the same thing a bit!’ said the Hatter. ‘You might just as well say " +
    "that “I see what I eat” is the same thing as “I eat what I see”!’</p>" +
    "<p>‘You might just as well say,’ added the March Hare, ‘that “I like what I " +
    "get” is the same thing as “I get what I like”!’</p>" +
    "<p>‘You might just as well say,’ added the Dormouse, who seemed to be " +
    "talking in his sleep, ‘that “I breathe when I sleep” is the same thing " +
    "as “I sleep when I breathe”!’</p>" +
    "<p>‘It IS the same thing with you,’ said the Hatter, and here the " +
    "conversation dropped, and the party sat silent for a minute, while Alice " +
    "thought over all she could remember about ravens and writing-desks, " +
    "which wasn’t much.</p>" +
    "<p>The Hatter was the first to break the silence. ‘What day of the month " +
    "is it?’ he said, turning to Alice: he had taken his watch out of his " +
    "pocket, and was looking at it uneasily, shaking it every now and then, " +
    "and holding it to his ear.</p>" +
    "<p>Alice considered a little, and then said ‘The fourth.’</p>" +
    "<p>‘Two days wrong!’ sighed the Hatter. ‘I told you butter wouldn’t suit " +
    "the works!’ he added looking angrily at the March Hare.</p>" +
    "<p>‘It was the BEST butter,’ the March Hare meekly replied.</p>" +
    "<p>‘Yes, but some crumbs must have got in as well,’ the Hatter grumbled: " +
    "‘you shouldn’t have put it in with the bread-knife.’</p>" +
    "<p>The March Hare took the watch and looked at it gloomily: then he dipped " +
    "it into his cup of tea, and looked at it again: but he could think of " +
    "nothing better to say than his first remark, ‘It was the BEST butter, " +
    "you know.’</p></body></html>";
        
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
        imageGenerator.loadHtml(html); 
        
        imageGenerator.saveAsImage("hello-world.png"); 
        imageGenerator.saveAsHtmlWithMap("hello-world.html", "hello-world.png");
        
        BufferedImage image = ImageIO.read(new File("hello-world.png"));    
        int w = image.getWidth();
        int h = image.getHeight();
        
        int white = 0;
        int non_white = 0;
        float whitespace = 0.0f;
        
//        for(int x = 0; x < w; x++) 
//        {
//            for(int y = 0; y < h; y++)
//            {
//                Color c = new Color(image.getRGB(x, y));
//                System.out.println("Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
//                
//                if (c.getRed() == 255 && c.getGreen() == 255 && c.getBlue() == 255)
//                    white++;
//                else
//                    non_white++;
//            }
//        }
//        
//        whitespace = (float) non_white / white;
        
        System.out.println("white pixels: " + white);
        System.out.println("non_white pixels: " + non_white);
        System.out.println("Whitespace ratio(non_white vs. white): " + whitespace);
    }
    
}
