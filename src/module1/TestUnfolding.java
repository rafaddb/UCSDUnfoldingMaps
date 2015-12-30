package module1;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

/** HelloWorld
 * Testando a biblioteca unfolding para criar mapas. 
 * Neste caso estou criando sem usar o applet (Metodo Main)
 * @author Rafael Braga Pereira
 * Date: Dezembro 23, 2015
 * */
public class TestUnfolding extends PApplet {
    
	UnfoldingMap map;
	
    public void setup() {
        size(800, 600);
        map = new UnfoldingMap(this);
        
        // Show map around the location in the given zoom level.
        map.zoomAndPanTo(3, new Location(32.9f, -117.2f));
        
        // Add mouse and keyboard interactions
        MapUtils.createDefaultEventDispatcher(this, map);
    }	
	
    public void draw() {
    	map.draw();
    }	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[] { "module1.TestUnfolding" });
	}
	
	
	
	

}
