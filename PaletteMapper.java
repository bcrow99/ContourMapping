import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PaletteMapper
{
	public static void main(String[] args)
	{
		
		PaletteMapper mapper = new PaletteMapper();
	}
    
	public PaletteMapper()
	{ 	
        try
        {
            PrintWriter output  = new PrintWriter("C:/Users/Brian Crowley/Desktop/palette.txt");
            
            int red   = 0;
            int green = 0;
            int blue  = 0;
            
            int number_of_colors = 0;
            
            
            output.write(red + "\t" + green + "\t" + blue + "\n");
            number_of_colors++;
            
            while(blue < 255)
            {
            	blue++;
            	output.write(red + "\t" + green + "\t" + blue + "\n");
                number_of_colors++;
            }
            
            while(blue > 128)
            {
            	blue--;
            	green++;
            	output.write(red + "\t" + green + "\t" + blue + "\n");
                number_of_colors++;
            }
            
            while(blue > 85)
            {
            	blue--;
            	red++;
            	output.write(red + "\t" + green + "\t" + blue + "\n");
                number_of_colors++;
            	
            }
            
            while(red < 85)
            {
            	red++;
            	green--;
            	output.write(red + "\t" + green + "\t" + blue + "\n");
                number_of_colors++;
            }
            
            while(red < 127)
            {
            	red++;
            	green++;
            	blue -= 2;
            	output.write(red + "\t" + green + "\t" + blue + "\n");
                number_of_colors++;
            }
            
            red++; blue--;
            output.write(red + "\t" + green + "\t" + blue + "\n");
            number_of_colors++;
            
            while(red < 255)
            {
            	red++; green--;
            	output.write(red + "\t" + green + "\t" + blue + "\n");
                number_of_colors++;
            }
            
            while(green < 255)
            {
            	green++; blue++;
            	output.write(red + "\t" + green + "\t" + blue + "\n");
                number_of_colors++;
            }
            
            output.close();
            
            System.out.println("Number of colors in palette is " + number_of_colors);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
	}
	
	public static ArrayList getPalette()
	{
		ArrayList palette = new ArrayList();
		
		int red   = 0; 
		int green = 0;
		int blue  = 255;
		
		int color = 0;
    	color |= red << 16;
        color |= green << 8;    
        color |= blue;	
    	palette.add(color);
    	
    	while(blue > 128)
        {
        	blue--;
        	green++;
        	color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
        }
        
        while(blue > 85)
        {
        	blue--;
        	red++;
        	color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
        	
        }
        
        while(red < 85)
        {
        	red++;
        	green--;
        	color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
        }
        
        while(red < 127)
        {
        	red++;
        	green++;
        	blue -= 2;
        	color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
        }
        
        red++; blue--;
        color = 0;
    	color |= red << 16;
        color |= green << 8;    
        color |= blue;	
    	palette.add(color);
        
        while(red < 255)
        {
        	red++; green--;
        	color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
        }
       
		return palette;
	}
	

	public static ArrayList getExtendedPalette()
	{
		ArrayList palette = new ArrayList();
		
		int red   = 0; 
		int green = 0;
		int blue  = 0;
		
		int color = 0;
    	color |=red << 16;
        color |= green << 8;    
        color |= blue;	
        
    	palette.add(color);
    	
    	while(blue < 255)
    	{
    		blue++;
    		color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
    	}
    	while(blue > 128)
        {
        	blue--;
        	green++;
        	color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
        }
        
        while(blue > 85)
        {
        	blue--;
        	red++;
        	color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
        	
        }
        
        while(red < 85)
        {
        	red++;
        	green--;
        	color = 0;
	    	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
        	palette.add(color);
        }
        
        while(red < 127)
        {
        	red++;
        	green++;
        	blue -= 2;
        	color = 0;
        	color |= red << 16;
            color |= green << 8;    
            color |= blue;
        	
        	palette.add(color);
        }
        
        red++; blue--;
        color = 0;
        color |= red << 16;
        color |= green << 8;    
        color |= blue;	
    	palette.add(color);
        
        while(red < 255)
        {
        	red++; green--;
        	
        	color = 0;
        	color |= red << 16;
            color |= green << 8;    
            color |= blue;	
            
        	palette.add(color);
        }
        
        while(green < 255)
        {
        	green++;
        	blue++;
        	
        	color = 0;
        	color |= red << 16;
            color |= green << 8;    
            color |= blue;
            
        	palette.add(color);
        }
       
		return palette;
	}
}