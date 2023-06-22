package controller;

import java.util.Map;

import model.BlocksMap;

/**
 * 
 * The Block class provides a method for retrieving a block based on its initial
 * character. It utilizes the BlocksMap class to access the mapping between
 * characters and blocks.
 */
public class Block {
	/**
	 * Retrieves a block based on its initial character.
	 *
	 * @param initial The initial character of the block.
	 * @return The block as an array of strings.
	 */
	public static String[] getBlock(char initial) {
		Map<Character, String[]> blocksMap = BlocksMap._MAP;
		return blocksMap.get(Character.toUpperCase(initial));
	}
}