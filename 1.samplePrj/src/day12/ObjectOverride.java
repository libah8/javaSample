package day12;

public class ObjectOverride extends Object{
	private String name;
	private int age;
	private int id;
	
	public ObjectOverride() {
		super();
	}
	public ObjectOverride(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	@Override
	public String toString() {
		//return "Student["+name+","+age+","+id+"]";
		StringBuilder sb = new StringBuilder();
		sb.append("Student[");
		sb.append(name);
		sb.append(",");
		sb.append(age);
		sb.append(",");
		sb.append(id);
		sb.append("]");
		return sb.toString();
	}
	
	
	public boolean equals(Object obj){
		if(!(obj instanceof ObjectOverride))	return false;
		ObjectOverride data = (ObjectOverride)obj;
		if(id==data.id&&age==data.age&&name.equals(data.name)){
			return true;
		}
		return false;
	}
	
	
	/*public boolean equals(Object student){
		if(student!=null&&(student instanceof EqualsOverride)&&this.toString().equals(student.toString())){
				return true;
			}else{
				return false;
			}
	
	}
	-->이러한 경우에는 다른 클래스와 섞일경우 핸들링하기가 힘들다. toString으로는 비교하지 말자.
*/
	/*@Override
	public boolean equals(Object obj){
		if((obj instanceof ObjectOverride) && obj!=null){
			if(this.name.equals(((ObjectOverride)obj).name)){
				return true;
			}else if(this.age == ((ObjectOverride)obj).age){
				return true;
			}else if(this.id == ((ObjectOverride)obj).id){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
			}*/
	
	
	/*public boolean equals(Object obj){
		boolean r1;
		boolean r2;
		boolean r3;
		boolean result=false;
		if((obj instanceof Student)&&obj!=null){
			
			r1=this.name.equals(((Student)obj).name);
			r2=this.age == ((Student)obj).age;
			r3=this.id == ((Student)obj).id;
			result= r1&&r2&&r3;
			return result;
		}else{
			return false;
			}
	 	}
	 */ 
	}



	
