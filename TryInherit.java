class Item //Base class or Super class or Parent class
{
private int item_no;
private String description;
private float rate;
private int qoh;
private int rol;
Item()
{
item_no=0;
description=null;
rate=0.0f;
qoh=0;
rol=0;
}
Item(int i_no, String desc, float rt, int qty, int reorder)
{
item_no=i_no;
description=desc;
rate=rt;
qoh=qty;
rol=reorder;
}
public void display()
{
System.out.print('\n');
System.out.println("Item Details");
System.out.println("------------");
System.out.println("Item Number: " + item_no);
System.out.println("Description: " + description);
System.out.println("Rate: " + rate);
System.out.println("Quantity on Hand: " + qoh);
System.out.println("Reorder Level: " + rol);
}
public void changeQOH(int qty, char status)
{
if (status=='A')
qoh=qoh+qty;
else
if (status=='S')
qoh=qoh-qty;
}
public void acceptDetails(int i_no, String desc, float rt, int qty, int reorder)
{
item_no=i_no;
description=desc;
rate=rt;
qoh=qty;
rol=reorder;
}
}
class Printer extends Item // Printer is a Derived class or Child of Item or Sub class of Item
{
String type;
int ppm;
Printer()
{
super();
type=null;
ppm=0;
}
Printer(int i_no, String desc, float rt, int qty, int reorder, String type, int ppm)
{
super(i_no,desc,rt,qty,reorder);
this.type=type;
this.ppm=ppm;
}
public void display()
{
super.display();
System.out.println("Type of printer: " + type);
System.out.println("Pages per minute: " + ppm);
}
}
class Scanner extends Item // Scanner is another Sub class of Item
{
String type;
int scanRate;
Scanner()
{
super();
type=null;
scanRate=0;
}
Scanner(int i_no, String desc, float rt, int qty, int reorder, String type, int sr)
{
super(i_no,desc,rt,qty,reorder);
this.type=type;
this.scanRate=sr;
}
public void display()
{
super.display();
System.out.println("Type of printer: " + type);
System.out.println("Scan rate: " + scanRate);
}
}
class TryInherit
{
public static void main(String arg[])
{
Item i1=new Item();
Item i2=new Item(1,"Hard Disk",4500.75f,75,25);
Printer p=new Printer(2,"Inkjet",10000.75f,200,35,"6P",6);
Scanner s=new Scanner();
p.changeQOH(50,'A');
i1.display();
i2.display();
p.display();
s.display();
}
}