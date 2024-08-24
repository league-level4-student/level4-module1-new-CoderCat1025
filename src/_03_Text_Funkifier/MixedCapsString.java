package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		StringBuilder build = new StringBuilder(unfunkifiedText);
		
		for (int i = 0; i < build.length()-1; i++) {
			if (i%2==0) {
				unfunkifiedText = unfunkifiedText.toLowerCase();
			build.replace(i, i+1, unfunkifiedText.substring(i, i+1));
			} else {
				unfunkifiedText = unfunkifiedText.toUpperCase();
			build.replace(i, i+1, unfunkifiedText.substring(i, i+1));
			}
		}
		
		
		return build.toString();
	}

}
