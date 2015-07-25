package us.terracraft.sqc.objects;

import java.awt.event.KeyEvent;

import KTech.components.*;
import KTech.core.*;
import KTech.core.*;
import KTech.graphics.Image;

public class Player extends GameObject {

	Image Player = new Image("/characters/Player.png");
	
	int x, y;
	
	public Player(int x, int y) {
		setName("Player"); 
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void update(KTech kt, float time) {
		if (kt.getInput().isKeyHeld(KeyEvent.VK_W))
			y -= 3;
		if (kt.getInput().isKeyHeld(KeyEvent.VK_S))
			y += 3;
		if (kt.getInput().isKeyHeld(KeyEvent.VK_A))
			x -= 3;
		if (kt.getInput().isKeyHeld(KeyEvent.VK_D))
			x += 3;
	}

	@Override
	public void render(KTech kt, Renderer r) {
		r.drawImage(Player, x, y);
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void componentEvent(String name, GameObject object) {
		
	}

}
