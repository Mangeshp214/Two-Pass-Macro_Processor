
public class Pass2 extends MacroProcessor {
	
	private String newFileContent = "";
	
	public void start() {
		
		updateFileContent();
		System.out.println(newFileContent);
		
	}

	private void updateFileContent() {
		
		String[] temp = getFileContent().split("\\n");
		int i = 0;
		while(!temp[i].contains("START")) 
			i++;
		
		for(;i<temp.length;i++) {
			
			newFileContent = newFileContent + temp[i];
			
		}
		
	}

}
