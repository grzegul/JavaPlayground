package rozdzial18;

import java.io.*;
public class Cw16 {
	static String file = "Cw16text.txt";
	static void display() throws IOException {
		RandomAccessFile rf = new RandomAccessFile(file, "r");
		System.out.println(rf.read());
		System.out.println(rf.readBoolean());
		System.out.println(rf.readByte());
		System.out.println(rf.readByte());
		System.out.println(rf.readByte());
		System.out.println(rf.readChar());
		System.out.println(rf.readChar());
		System.out.println(rf.readDouble());
		System.out.println(rf.readFloat());
		System.out.println(rf.readInt());
		System.out.println(rf.readLong());
		System.out.println(rf.readShort());
		System.out.println(rf.readUTF());
		rf.close();
	}
	public static void main(String[] args)	throws IOException {
		RandomAccessFile rf = new RandomAccessFile(file, "rw");
		
	 	rf.write(20);	 	//Writes the specified byte to this file.
	 	rf.writeBoolean(true);	 	//Writes a boolean to the file as a one-byte value.
	 	rf.writeByte(1);	 	//Writes a byte to the file as a one-byte value.
	 	rf.writeBytes("22");	 	//Writes the string to the file as a sequence of bytes.
	 	rf.writeChar(110);	 	//Writes a char to the file as a two-byte value, high byte first.
	 	rf.writeChars("Z");	 	//Writes a string to the file as a sequence of characters.
	 	rf.writeDouble(90);	 	//Converts the double argument to a long using the doubleToLongBits method in class Double, and then writes that long value to the file as an eight-byte quantity, high byte first.
	 	rf.writeFloat(8);	 	//Converts the float argument to an int using the floatToIntBits method in class Float, and then writes that int value to the file as a four-byte quantity, high byte first.
	 	rf.writeInt(9);	 	//Writes an int to the file as four bytes, high byte first.
	 	rf.writeLong(10);	 	//Writes a long to the file as eight bytes, high byte first.
	 	rf.writeShort(11);	 	//Writes a short to the file as two bytes, high byte first.
	 	rf.writeUTF("Last");	 	//Writes a string to the file using modified UTF-8 encoding in a machine-independent manner.

		rf.close();
		display();
	}
}