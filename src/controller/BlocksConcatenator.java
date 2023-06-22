package controller;

import java.util.List;

/**
 * 
 * The BlocksConcatenator class implements the ConcatBlocksListener interface
 * and is responsible for concatenating blocks based on the provided full name.
 * It uses the BlockListProvider class to retrieve the list of blocks and
 * performs the concatenation operation.
 */
public class BlocksConcatenator implements ConcatBlocksListener {
	BlockListProvider blockListProvider;

	public BlocksConcatenator(BlockListProvider blockListProvider) {
		this.blockListProvider = blockListProvider;
	}

	@Override
	public StringBuilder concatPerformed(FormEvent fromEvent) {
		List<String[]> blockList = blockListProvider.getBlockList(fromEvent.getFullname());
		if (blockList.size() > 0) {
			int blockLength = blockList.get(0).length;
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < blockLength; i++) {
				for (String[] block : blockList) {
					stringBuilder.append(block[i]);
				}
				stringBuilder.append("\n");
			}
			return stringBuilder;
		}
		return null;
	}
}
