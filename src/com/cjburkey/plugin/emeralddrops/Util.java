package com.cjburkey.plugin.emeralddrops;

import java.util.concurrent.ThreadLocalRandom;

public class Util {
	
	public static final int randonRangeInc(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
}