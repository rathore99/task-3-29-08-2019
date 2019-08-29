package com.ssi.task3.stringclass;

public class Question1 {
	private int cntGmail;
	private int cntYahoo;
	private int cntOutlook;
	private int cntOther;

	public Question1(int cntGmail, int cntYahoo, int cntOutlook, int cntOther) {

		this.cntGmail = cntGmail;
		this.cntYahoo = cntYahoo;
		this.cntOutlook = cntOutlook;
		this.cntOther = cntOther;
	}

	public Question1() {

	}

	public int getCntGmail() {
		return cntGmail;
	}

	public void setCntGmail(int cntGmail) {
		this.cntGmail = cntGmail;
	}

	public int getCntYahoo() {
		return cntYahoo;
	}

	public void setCntYahoo(int cntYahoo) {
		this.cntYahoo = cntYahoo;
	}

	public int getCntOutlook() {
		return cntOutlook;
	}

	public void setCntOutlook(int cntOutlook) {
		this.cntOutlook = cntOutlook;
	}

	public int getCntOther() {
		return cntOther;
	}

	public void setCntOther(int cntOther) {
		this.cntOther = cntOther;
	}

	public void generateEmailNames() {
		System.out.println("generating");
	}

	public void countDomain(String emails[]) {

		for (String email : emails) {
			int indexOfAt = email.lastIndexOf('@');
			//int indexOfDot = email.lastIndexOf('.');
			String domain = email.substring(indexOfAt + 1);
			// System.out.println(domain);
			if (domain.equals("gmail.com")) {
				int cntVal = this.getCntGmail() + 1;
				this.setCntGmail(cntVal);
				// System.out.println(cntVal);
			} else if (domain.equals("yahoo.com")) {
				int cntVal = this.getCntYahoo() + 1;
				this.setCntYahoo(cntVal);
				// System.out.println(domain);
			} else if (domain.equals("outlook.com")) {
				int cntVal = this.getCntOutlook() + 1;
				this.setCntOutlook(cntVal);
				// System.out.println(domain);
			} else {
				int cntVal = this.getCntOther() + 1;
				this.setCntOther(cntVal);
				// System.out.println(domain);
			}
		}

	}

	public void showResult() {
		System.out.println("Domain Name\t Count\n");
		System.out.println("Gmail      \t" + this.getCntGmail());
		System.out.println("Yahoo      \t" + this.getCntYahoo());
		System.out.println("Outlook    \t" + this.getCntOutlook());
		System.out.println("Other      \t" + this.getCntOther());
	}

	public static void main(String[] args) {
		Question1 domaincntr = new Question1();
		domaincntr.generateEmailNames();
		String emails[] = { "ab@gmail.com", "xyz@yahoo.com", "ram@gmail.com", "karan@yahoo.com" };
		domaincntr.countDomain(emails);
		domaincntr.showResult();
	}

}
