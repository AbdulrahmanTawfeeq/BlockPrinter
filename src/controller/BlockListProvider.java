package controller;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The BlockListProvider class is responsible for providing a list of blocks
 * based on a given string. It utilizes the Block class to retrieve blocks based
 * on the initial characters of names.
 */
public class BlockListProvider {
	/**
	 * Retrieves a list of blocks based on a given string.
	 *
	 * @param str The string containing names separated by whitespace.
	 * @return The list of blocks as a List of String arrays.
	 */
	public List<String[]> getBlockList(String str) {
		List<String[]> blockList = new ArrayList<>();
		if (str != null && str.length() > 0) {
			for (String name : str.split("\\s+")) {
				char initial = name.charAt(0);
				String[] block = Block.getBlock(initial);
				if (block != null) {
					blockList.add(block);
				}
			}
		}
		return blockList;
	}
}
