package com.edu;

public class TextEditor {
	//Spelling checking by using Annotation byName
	/*private SpellChecker spellobj;

	
	public SpellChecker getSpellobj() {
		return spellobj;
	}


	public void setSpellobj(SpellChecker spellobj) {
		this.spellobj = spellobj;
	}


	public void textFunction()
	{
		if(spellobj!=null)
		{
			spellobj.spellchkFunc();
		}
		else
		{
			System.out.println("Spell Checker is Disabled");
		}
	}
	*/
	//Spelling checker by using Annotation byType
	/*private SpellChecker spell;

	public SpellChecker getSpell() {
		return spell;
	}

	public void setSpell(SpellChecker spell) {
		this.spell = spell;
	}
	public void textFunction()
	{
		if(spell!=null)
		{
			spell.spellingchkFunction();
		}
		else
		{
			System.out.println("Spelling Checker is not Enabled");
		}
	}
	*/
	//by constructor
	/*public  SpellChecker spellChk;

	public TextEditor(SpellChecker spellChk) {
		super();
		this.spellChk = spellChk;
	}
	public void TextFun()
	{
		if(spellChk!=null)
		{
			spellChk.SpellCheckerFunction();
		}
		else
		{
			System.out.println("Spell Checker is not Enabled");
		}
	}
	*/
	//by referencing
	private TextEditor spelling;

	public TextEditor getSpelling() {
		return spelling;
	}

	public void setSpelling(TextEditor spelling) {
		this.spelling = spelling;
	}
	public void textFun()
	{
		if(spelling!=null)
		{
			spelling.textFun();
		}
		else
		{
			System.out.println("Spelling checker is disabled");
		}
	}
	
	
	
	
	

}
