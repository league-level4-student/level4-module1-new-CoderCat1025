package _03_Text_Funkifier;

public class AllDashString implements TextFunkifier {

    private String unfunkifiedText;

    public AllDashString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	StringBuilder build = new StringBuilder(unfunkifiedText);
    	for (int i = 0; i < build.length()-1; i++) {
    		build.replace(i, i+1, "-");
    	}
    	build.setCharAt(build.length()-1, '-');
    	
        return build.toString();

    }
}