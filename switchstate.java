class switchstate{
public static void main(String args[]){
String day = "Monday";
String result = "";

result = switch(day)
{
case "Monday" : yield "6am";
case "Sunday" : yield "10am";
default : yield "7am";
};
System.out.println(result);
}
}