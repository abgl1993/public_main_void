package mainpack;

class HR {
	public Employee recruit(String empType) {

		try {
			if (empType.equals("I")) {
				return new Intern();
			} else if (empType.equals("C")) {
				return new ConfirmedEmployee();
			} 
			else if (empType.equals("T")) {
				return new Contract();
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}