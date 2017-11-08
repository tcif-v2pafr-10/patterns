package flyweight;

class Factory {
	private Gazillion[] pool;

	public Factory(int maxRows) {
		pool = new Gazillion[maxRows];
	}

	public Gazillion getFlyweight(int theRow) {
		if (pool[theRow] == null)
			pool[theRow] = new Gazillion(theRow);
		return pool[theRow];
	}
}

/*
 * Pseudocode if (flyweightCache[parameters] exists) return existing flyweight
 * else new flyweight(parameters) add flyweight to cache return flyweight
 */