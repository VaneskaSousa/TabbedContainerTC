package tabbedContainerTC;

import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.TabbedContainer;
import totalcross.ui.font.Font;
import totalcross.ui.image.Image;

public class TabbedContainerTCSample extends Container{
	private TabbedContainer tb;
	private Label lb;
	
	public TabbedContainerTCSample(){
		setBackColor(0xFFFFFF);
	}
	
	public void initUI(){
		try{
			lb = new Label("TabbedContainer with text only and \npositioned undernearth");
			Font ft = Font.getFont(true, Font.NORMAL_SIZE+2);
			lb.setFont(ft);
			add(lb,LEFT+10,TOP+10,PREFERRED,PREFERRED+10);
			
			String[] telas = {"Face","Twiter","Whats"};
			
			tb = new TabbedContainer(telas);
			tb.allSameWidth = true;
			tb.setType(TabbedContainer.TABS_BOTTOM);
			add(tb,CENTER,AFTER,PARENTSIZE+90,PARENTSIZE+15);
			
			tb.getContainer(0).setBackColor(0x2196F3);
			tb.getContainer(1).setBackColor(0x2196F3);
			tb.getContainer(2).setBackColor(0x00E676);
			
			tb.setBackColor(0x212121);
			
			lb = new Label("Facebook");
			Font ft2 = Font.getFont(true, Font.NORMAL_SIZE).asBold();
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(0).add(lb,CENTER,CENTER);
			
			lb = new Label("Twiter");
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(1).add(lb,CENTER,CENTER);
			
			lb = new Label("Whatsapp");
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(2).add(lb,CENTER,CENTER);
			
			
			lb = new Label("TabbedContainer only with image \nand positioned on top");
			lb.setFont(ft);
			add(lb,LEFT+10,AFTER+10,PREFERRED,PREFERRED+10);
			
			Image[] img = {new Image("img/icon1.1.png").getSmoothScaledInstance(fmH+15,fmH+15),
					new Image("img/icon2.png").getSmoothScaledInstance(fmH+15,fmH+15),
					new Image("img/icon3.png").getSmoothScaledInstance(fmH+15,fmH+15)};
			
			tb = new TabbedContainer(img);
			tb.allSameWidth = true;
			add(tb,CENTER,AFTER+10,PARENTSIZE+90,PARENTSIZE+15);
			
			tb.getContainer(0).setBackColor(0x2196F3);
			tb.getContainer(1).setBackColor(0x2196F3);
			tb.getContainer(2).setBackColor(0x00E676);
			
			tb.setBackColor(0x212121);
			
			lb = new Label("Facebook");
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(0).add(lb,CENTER,CENTER);
			
			lb = new Label("Twiter");
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(1).add(lb,CENTER,CENTER);
			
			lb = new Label("Whatsapp");
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(2).add(lb,CENTER,CENTER);
			
			lb = new Label("TabbedContainer with text and image \npositioned on top");
			lb.setFont(ft);
			add(lb,LEFT+10,AFTER+10,PREFERRED,PREFERRED+10);
			
			tb = new TabbedContainer(telas);
			tb.setIcons(img);
			tb.extraTabHeight = fmH*2;
			tb.allSameWidth = true;
			add(tb,CENTER,AFTER+10,PARENTSIZE+90,PARENTSIZE+23);
			
			tb.getContainer(0).setBackColor(0x2196F3);
			tb.getContainer(1).setBackColor(0x2196F3);
			tb.getContainer(2).setBackColor(0x00E676);
			
			tb.setBackColor(0x212121);
			
			lb = new Label("Facebook");
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(0).add(lb,CENTER,CENTER);
			
			lb = new Label("Twiter");
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(1).add(lb,CENTER,CENTER);
			
			lb = new Label("Whatsapp");
			lb.setFont(ft2);
			lb.setForeColor(0xFFFFFF);
			tb.getContainer(2).add(lb,CENTER,CENTER);
			
			
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
	}
}
