/**
 * @author clayblake - csblake
 * CIS175 - Fall 2021
 * Jan 25, 2022
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CharacterLogic;
import model.Character;

public class TestLevelUp {
	// initialize the objects needed for the test
	CharacterLogic chaL = new CharacterLogic();
	Character player = new Character("Clay", 23, 5, 10, 10, 20);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCharacterLevelUp() {
		// call the level up method from the character logic class on character
		chaL.levelUp(player);
		
		// assert to make sure the values are leveled up
		assertEquals(6, player.getLvl());
		assertEquals(11, player.getStrength());
		assertEquals(11, player.getCharisma());
		assertEquals(21, player.getHealthPoints());
	}

}
