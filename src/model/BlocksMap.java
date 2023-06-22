package model;

import java.util.HashMap;
import java.util.Map;

public class BlocksMap {
    public static final Map<Character, String[]> _MAP = createBlocksMap();

    private static Map<Character, String[]> createBlocksMap() {
        Map<Character, String[]> blocksMap = new HashMap<>();
        blocksMap.put('A', new String[] {
                "  AAAAAAAAAAAA  ",
                " AAAAAAAAAAAAAA ",
                " AAAA      AAAA ",
                " AAAA      AAAA ",
                " AAAAAAAAAAAAAA ",
                " AAAAAAAAAAAAAA ",
                " AAAA      AAAA ",
                " AAAA      AAAA ",
                " AAAA      AAAA "
        });
    	blocksMap.put('B', new String[] {
        	    " BBBBBBBBBBBB   ",
        	    " BBBBBBBBBBBB   ",
        	    " BBB      BBB   ",
        	    " BBB      BBB   ",
        	    " BBBBBBBBBBBB   ",
        	    " BBBBBBBBBBBB   ",
        	    " BBB      BBB   ",
        	    " BBB      BBB   ",
        	    " BBBBBBBBBBBB   "
        });
        blocksMap.put('C', new String[] {
                "   CCCCCCCCC    ",
                " CCCCCCCCCCCC   ",
                "CCC        CCC  ",
                "CCC             ",
                "CCC             ",
                "CCC             ",
                "CCC        CCC  ",
                " CCCCCCCCCCCC   ",
                "   CCCCCCCCC    "
        });
    	blocksMap.put('D', new String[] {
        	    "   DDDDDDDDD    ",
        	    "  DDDDDDDDDD    ",
        	    " DDD      DDD   ",
        	    " DDD       DDD  ",
        	    " DDD       DDD  ",
        	    " DDD       DDD  ",
        	    " DDD       DDD  ",
        	    " DDD      DDD   ",
        	    " DDDDDDDDDD     ",
        	    " DDDDDDDDD      "
        });
        blocksMap.put('E', new String[] {
                " EEEEEEEEEEEE   ",
                " EEEEEEEEEEEE   ",
                " EEE            ",
                " EEE            ",
                " EEEEEEEEEEEE   ",
                " EEEEEEEEEEEE   ",
                " EEE            ",
                " EEE            ",
                " EEEEEEEEEEEE   "
        });
    	blocksMap.put('F', new String[] {
        	    " FFFFFFFFFF     ",
        	    " FFFFFFFFFF     ",
        	    " FFF            ",
        	    " FFF            ",
        	    " FFFFFFFFF      ",
        	    " FFFFFFFFF      ",
        	    " FFF            ",
        	    " FFF            ",
        	    " FFF            "
        });
    	blocksMap.put('G', new String[] {
        	    "   GGGGGGGGG    ",
        	    "  GGGGGGGGGGG   ",
        	    " GGG      GGG   ",
        	    " GGG            ",
        	    " GGG            ",
        	    " GGG     GGGGG  ",
        	    " GGG      GGGG  ",
        	    "  GGG      GGG  ",
        	    "   GGGGGGGGGG   ",
        	    "    GGGGGGGG    "
        });
        blocksMap.put('H', new String[] {
                " HH        HH   ",
                " HH        HH   ",
                " HH        HH   ",
                " HH        HH   ",
                " HHHHHHHHHHHH   ",
                " HHHHHHHHHHHH   ",
                " HH        HH   ",
                " HH        HH   ",
                " HH        HH   "
        });
    	blocksMap.put('I', new String[] {
        	    "   IIIIIIIII    ",
        	    "     IIIIII     ",
        	    "       III      ",
        	    "       III      ",
        	    "       III      ",
        	    "       III      ",
        	    "       III      ",
        	    "      IIIII     ",
        	    "   IIIIIIIII    "
        });
        blocksMap.put('J', new String[] {
                "JJJJJJJJJJJJJJJ ",
                "JJJJJJJJJJJJJJJ ",
                "        JJJJ    ",
                "        JJJJ    ",
                "        JJJJ    ",
                "JJJJJ   JJJJ    ",
                "JJ      JJJJ    ",
                " JJJJJJJJJJ     ",
                "  JJJJJJJJ      "
        });
    	blocksMap.put('K', new String[] {
        	    " KK       KK    ",
        	    " KK      KK     ",
        	    " KK     KK      ",
        	    " KK    KK       ",
        	    " KK  KK         ",
        	    " KKKK           ",
        	    " KK  KK         ",
        	    " KK   KK        ",
        	    " KK    KK       ",
        	    " KK     KK      "
        });
        blocksMap.put('L', new String[] {
                " LLLL           ",
                " LLLL           ",
                " LLLL           ",
                " LLLL           ",
                " LLLL           ",
                " LLLL           ",
                " LLLL           ",
                " LLLLLLLLLLLLLL ",
                " LLLLLLLLLLLLLL "
        });
        blocksMap.put('M', new String[] {
        	    " MM          MM ",
        	    " MMM        MMM ",
        	    " MMMM      MMMM ",
        	    " MMMMM    MMMMM ",
        	    " MMM MMMM MMMMM ",
        	    " MMM  MM  MM MM ",
        	    " MMM   M   MM   ",
        	    " MM          MM ",
        	    " MM          MM "
        });
        blocksMap.put('N', new String[] {
        	    " NN          NN ",
        	    " NNN         NN ",
        	    " NNNN        NN ",
        	    " NN NN       NN ",
        	    " NN  NN      NN ",
        	    " NN   NN     NN ",
        	    " NN    NN    NN ",
        	    " NN     NN   NN ",
        	    " NN      NN  NN "
        });
        blocksMap.put('O', new String[] {
                "   OOOOOOOOO    ",
                " OOOOOOOOOOOOO  ",
                "OOO        OOO  ",
                "OOO        OOO  ",
                "OOO        OOO  ",
                "OOO        OOO  ",
                "OOO        OOO  ",
                " OOOOOOOOOOOOO  ",
                "   OOOOOOOOO    "
        });
        blocksMap.put('P', new String[] {
                " PPPPPPPPPPPP   ",
                " PPPPPPPPPPPP   ",
                " PPP      PPP   ",
                " PPP      PPP   ",
                " PPPPPPPPPPPP   ",
                " PPPPPPPPPP     ",
                " PPP            ",
                " PPP            ",
                " PPP            "
        });
        blocksMap.put('Q', new String[] {
                "   QQQQQQQQ     ",
                " QQQQQQQQQQQQ   ",
                "QQQ        QQQ  ",
                "QQQ        QQQ  ",
                "QQQ        QQQ  ",
                "QQQ        QQQ  ",
                "QQQ   QQQQQQQQ  ",
                " QQQ      QQQ   ",
                "   QQQQQQQQ Q   "
        });
        blocksMap.put('R', new String[] {
                " RRRRRRRRRRRR   ",
                " RRRRRRRRRRRRR  ",
                " RRRR      RRR  ",
                " RRRR      RRR  ",
                " RRRRRRRRRRRRR  ",
                " RRRRRRRRRRR    ",
                " RRRR   RRRR    ",
                " RRRR    RRRR   ",
                " RRRR     RRRR  "
        });
    	blocksMap.put('S', new String[] {
        	    "    SSSSSSSSS   ",
        	    "  SSSSSSSSSSSS  ",
        	    " SSS        SS  ",
        	    " SSS            ",
        	    "  SSSSSSSSS     ",
        	    "   SSSSSSSSS    ",
        	    "          SSS   ",
        	    " SS        SSS  ",
        	    " SSSSSSSSSSSSS  ",
        	    "  SSSSSSSSSSS   "
        });
        blocksMap.put('T', new String[] {
                " TTTTTTTTTTTTT  ",
                " TTTTTTTTTTTTT  ",
                "     TTTT       ",
                "     TTTT       ",
                "     TTTT       ",
                "     TTTT       ",
                "     TTTT       ",
                "     TTTT       ",
                "     TTTT       "
        });
        blocksMap.put('U', new String[] {
                " UUU        UUU ",
                " UUU        UUU ",
                " UUU        UUU ",
                " UUU        UUU ",
                " UUU        UUU ",
                " UUU        UUU ",
                " UUU        UUU ",
                " UUUUUUUUUUUUUU ",
                "  UUUUUUUUUUUU  "
        });
    	blocksMap.put('V', new String[] {
        	    " VV          VV ",
        	    " VV          VV ",
        	    " VV          VV ",
        	    "  VV        VV  ",
        	    "  VV        VV  ",
        	    "   VV      VV   ",
        	    "   VV      VV   ",
        	    "    VV    VV    ",
        	    "    VV    VV    ",
        	    "     VVVVVV     "
        });
    	blocksMap.put('W', new String[] {
        	    " WW          WW ",
        	    " WW          WW ",
        	    " WW    WW    WW ",
        	    " WW    WW    WW ",
        	    " WW   WWWW   WW ",
        	    " WW  WW  WW  WW ",
        	    " WW WW    WW WW ",
        	    " WWW       WWW  ",
        	    " WW         WW  "
        });
    	blocksMap.put('X', new String[] {
    		    " XX          XX ",
    		    "  XX        XX  ",
    		    "   XX      XX   ",
    		    "    XX    XX    ",
    		    "     XX  XX     ",
    		    "      XXXX      ",
    		    "     XX  XX     ",
    		    "    XX    XX    ",
    		    "   XX      XX   ",
    		    " XX          XX "
    	});
    	blocksMap.put('Y', new String[] {
        	    " YY        YY   ",
        	    "  YY      YY    ",
        	    "   YY    YY     ",
        	    "    YY  YY      ",
        	    "     YYYYY      ",
        	    "     YYYYY      ",
        	    "     YYYYY      ",
        	    "     YYYYY      ",
        	    "     YYYYY      ",
        	    "     YYYYY      "
        });
    	blocksMap.put('Z', new String[] {
                "  ZZZZZZZZZZZZ  ",
                " ZZZZZZZZZZZZZ  ",
                "          ZZZ   ",
                "         ZZZ    ",
                "        ZZZ     ",
                "       ZZZ      ",
                "      ZZZ       ",
                "     ZZZ        ",
                "   ZZZZZZZZZZZ  ",
                "  ZZZZZZZZZZZZ  "
        });
        return blocksMap;
    }
}
