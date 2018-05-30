package controller;

public class PlayerMover implements Runnable { // Create the class PlayerMover wich is implements by Runable

	public void PlayerMover() {
        /*
		Point pos = this.hero.getPos();
        this.hero.move(order, tileMap, this.view);
        this.tileMap[pos.x][pos.y] = model.element(' ', pos.getLocation());

        pos = this.hero.getPos();
        String elementName = this.tileMap[pos.x][pos.y].getClass().getSimpleName();
        if(elementName.contains("Monster")) {
            this.dead = true;
        } else if (elementName.contains("Crystal") && this.posDoor != null) {
            this.tileMap[this.posDoor.x][this.posDoor.y] = model.element('O', this.posDoor);
            this.score += 100;
        } else if (elementName.contains("OpenDoor")) {
            this.level++;
            if(this.level > 9) {
                this.model.upNameAndScore(this.score, this.pseudo);
                this.view.printMessage(String.format("WELL DONE %s! Your score is : %d\nPress OK to restart the game", this.pseudo, this.score));
                this.score = 0;
                this.level = 1;
            }
            this.model.loadMap(String.format("MAP%d", this.level));
            return;
        } else if (elementName.contains("Purse")) {
            this.score += 250;
        }
        this.tileMap[pos.x][pos.y] = this.hero;
        this.view.repaint();
        */
		//ID move for player
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
