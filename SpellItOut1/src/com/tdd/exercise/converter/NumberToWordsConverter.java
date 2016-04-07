package com.tdd.exercise.converter;

public abstract class  NumberToWordsConverter {
	String UNITS[] = new String[] { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
	String TENS[] = new String[] { "Twenty", "Thirty", "Forty", "Fifty",
			"Sixty", "Seventy", "Eighty", "Ninety" };
	String DENOMINATORS[]=new String[]{"Hundred","Thousand"};

	protected NumberToWordsConverter nextConverter=null;
	
	protected int divider;
	
	public String convert(Long number){
		String numberName="";
		if(isRightConverter(number)){
			numberName=getNumberName(number/divider)+" "+DENOMINATORS[0];
		}else{
			return nextConverter.convert(number%divider);
		}
		if(hasMoreDigits(number)){
			numberName=numberName+" "+nextConverter.convert(number%divider);
		}
		return numberName;
	}

	public String getUnitName(Long number) {
		return UNITS[number.intValue()];
	}

	public String getTenName(Long number) {
		return TENS[number.intValue() / 10 - 2];
	}
	
	public String getNumberName(Long number){
		if(number>=20){
			return getTenName(number)+(number%10==0?"":" "+getUnitName(number%10));
		}else{
			return getUnitName(number);
		}
	}
	
	protected boolean hasMoreDigits(Long number){
		return number%divider!=0;
	}

	protected boolean isRightConverter(Long number){
		return number>=divider;
	}
	protected NumberToWordsConverter getNextConverter() {
		return nextConverter;
	}
	
	

}
