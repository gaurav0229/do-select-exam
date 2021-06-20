package com.cg.demo.select;

class Email{
// Implement Email Class according to the specifiaction.
	Header header;
	String body;
	String greetings;

	public Email(){
		//Default
	}

	Email(Header header, String body, String greetings){		
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
}

class Header{
// Implemet the Header Class according to the specifiaction.
	String from;
	String to;

	public Header(String from, String to){
		this.to = to;
		this.from = from;
	}
}


 class EmailOperations{
 // Implemet the Three methods specified in the specified.
	public int emailVerify (Email e){
		String regex = "^[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+$";
		int res = 0;
		if(((e.header.to).matches(regex)) && ((e.header.from).matches(regex))){
			res = 2;
		} else if(((e.header.to).matches(regex)) || ((e.header.from).matches(regex))){
			res = 1;
		} else {
			res = 0;
		}
		return res;
 	}	

	public String bodyEncryption (Email e){
    String encrypted = null;
    char ch[] = e.body.toCharArray();
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < ch.length; i++) {
        if(ch[i] == 'X' || ch[i] == 'x' ||ch[i] == 'Y'||ch[i] == 'y'||ch[i] == 'Z'|| ch[i]== 'z'){
            ch[i] = (char)(ch[i]-23);
        }else if(ch[i]==' '){
            
        }else {
            ch[i] = (char) (ch[i]+3);
        }
        result.append(ch[i]);
    }
    encrypted = result.toString();
	return encrypted; 
	}

	public String greetingMessage(Email e){
    String message = null;
    String greet = e.greetings;
    StringBuffer sender = new StringBuffer();
    char ch[] = e.header.from.toCharArray();
    for (int i = 0; i < ch.length; i++) {
       if(ch[i] == '@'){
             break;
         }else{
             sender.append(ch[i]);
         }
    }
    String res = sender.toString();
    message = greet+" "+res;
    return message;
	}
}


public class EmailOperation {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
    // You can Implement your main() to check your Program.
	Header h = new Header("gaurav0229@gmail.com", "_gaurav@gmail.com");
	Email e = new Email(h,"Hi Gaurav", "Thanks & Regards");
	EmailOperations eo = new EmailOperations();
	System.out.println(eo.emailVerify(e));
	System.out.println(eo.bodyEncryption(e));
	System.out.println(eo.greetingMessage(e));
	}
}