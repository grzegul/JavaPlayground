package rozdzial18;

import java.io.*;
public class Cw15 {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Cw15.txt")));
		
		out.writeBoolean(false);
		out.writeByte(114);
		out.writeBytes("ee");
		out.writeChar(101);
		out.writeChars("Xx");
		out.writeDouble(1.41413);
		out.writeFloat(15);
		out.writeInt(15);
		out.writeLong(15000);
		out.writeShort(15);
		out.writeUTF("Koniec pliku");
		
		out.close();
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Cw15.txt")));
		System.out.println(in.readBoolean());
		System.out.println(in.readByte());
		System.out.println(in.readByte());
		System.out.println(in.readByte());
		System.out.println(in.readChar());
		System.out.println(in.readChar());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		System.out.println(in.readFloat());
		System.out.println(in.readInt());
		System.out.println(in.readLong());
		System.out.println(in.readShort());
		System.out.println(in.readUTF());
	}
}