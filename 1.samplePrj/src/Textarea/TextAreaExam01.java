package Textarea;

import java.awt.*;
import java.io.*;

class TextAreaExam01
{
	public static void main(String[] args) throws IOException
	{
		Frame f = new Frame("�ؽ�Ʈ ����");
		TextArea ta = new TextArea(20,50);
		String str;
		BufferedReader br = new BufferedReader(new FileReader("TextAreaExam01.java"));
		while((str=br.readLine())!=null)
			ta.append(str+"\n");
		br.close();
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
}
