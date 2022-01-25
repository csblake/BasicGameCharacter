/**
 * @author clayblake - csblake
 * CIS175 - Fall 2021
 * Jan 25, 2022
 */
package model;

public class CharacterLogic {

	// methods for the character class
	public void levelUp(Character character) {
		// assign new values to the character stats
		character.setStrength(character.getStrength() + 1);
		character.setLvl(character.getLvl() + 1);
		character.setCharisma(character.getCharisma() + 1);
		character.setHealthPoints(character.getHealthPoints() + 1);
	}
	
	public boolean canPersuadeAI(Character character) {
		boolean persuade = false;
		
		if(character.getCharisma() > 6) {
			// they can persuade the AI
			persuade = true;
		} else {
			// they can't persuade the AI
			persuade = false;
		}
		
		return persuade;
	}
}
