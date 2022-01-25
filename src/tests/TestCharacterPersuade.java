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

public class TestCharacterPersuade {
	// initialize the objects needed for the test
	CharacterLogic chaL = new CharacterLogic();
	Character player = new Character("Clay", 23, 2, 5, 5, 10);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCharacterPersuasionFalse() {
		assertFalse(chaL.canPersuadeAI(player));
	}
	
	@Test
	public void testCharacterPersuasionTrue() {
		// change the character charisma to be above 6 so this test passes
		player.setCharisma(7);
		
		assertTrue(chaL.canPersuadeAI(player));
	}

}
