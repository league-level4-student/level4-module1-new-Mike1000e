package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
     StringBuilder builder = new StringBuilder(); 
     builder.append(unfunkifiedText);
     builder.reverse();
     
        return builder.toString();

    }
}
