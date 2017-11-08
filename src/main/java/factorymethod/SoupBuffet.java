package factorymethod;

class SoupBuffet {
	String soupBuffetName;

	ChickenSoup chickenSoup;
	ClamChowder clamChowder;
	FishChowder fishChowder;
	Minnestrone minnestrone;
	PastaFazul pastaFazul;
	TofuSoup tofuSoup;
	VegetableSoup vegetableSoup;

	public String getSoupBuffetName() {
		return soupBuffetName;
	}

	public void setSoupBuffetName(String soupBuffetNameIn) {
		soupBuffetName = soupBuffetNameIn;
	}

	public void setChickenSoup(ChickenSoup chickenSoupIn) {
		chickenSoup = chickenSoupIn;
	}

	public void setClamChowder(ClamChowder clamChowderIn) {
		clamChowder = clamChowderIn;
	}

	public void setFishChowder(FishChowder fishChowderIn) {
		fishChowder = fishChowderIn;
	}

	public void setMinnestrone(Minnestrone minnestroneIn) {
		minnestrone = minnestroneIn;
	}

	public void setPastaFazul(PastaFazul pastaFazulIn) {
		pastaFazul = pastaFazulIn;
	}

	public void setTofuSoup(TofuSoup tofuSoupIn) {
		tofuSoup = tofuSoupIn;
	}

	public void setVegetableSoup(VegetableSoup vegetableSoupIn) {
		vegetableSoup = vegetableSoupIn;
	}

	public String getTodaysSoups() {
		StringBuffer stringOfSoups = new StringBuffer();
		stringOfSoups.append(" Today's Soups!  ");
		stringOfSoups.append("\n Chicken Soup: ");
		stringOfSoups.append(this.chickenSoup.getSoupName());
		stringOfSoups.append("\n Clam Chowder: ");
		stringOfSoups.append(this.clamChowder.getSoupName());
		stringOfSoups.append("\n Fish Chowder: ");
		stringOfSoups.append(this.fishChowder.getSoupName());
		stringOfSoups.append("\n Minnestrone: ");
		stringOfSoups.append(this.minnestrone.getSoupName());
		stringOfSoups.append("\n Pasta Fazul: ");
		stringOfSoups.append(this.pastaFazul.getSoupName());
		stringOfSoups.append("\n Tofu Soup: ");
		stringOfSoups.append(this.tofuSoup.getSoupName());
		stringOfSoups.append("\n Vegetable Soup: ");
		stringOfSoups.append(this.vegetableSoup.getSoupName());
		return stringOfSoups.toString();
	}
}