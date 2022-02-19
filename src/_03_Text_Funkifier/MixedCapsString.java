package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append(unfunkifiedText);
		
		for(int i = 1; i<unfunkifiedText.length(); i+=2) {
		builder.setCharAt(i, unfunkifiedText.substring(i,i+2).toUpperCase().charAt(0));
		}
		return null;
	}

}
