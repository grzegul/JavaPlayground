package rozdzial22;

import uzytki.*;
import org.eclipse.swt.*;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.*;
import java.util.*;
public class SWTMenus implements SWTApplication {
	private static Shell shell;
	private static Label label;
	public void createContents(Composite parent) {
		shell = parent.getShell();
		
		Menu bar = new Menu(shell, SWT.BAR);
		shell.setMenuBar(bar);
		Set<String> words = new TreeSet<String>(new TextFile("SWTMenus.java", "\\W+"));
		Iterator<String> it = words.iterator();
		while(it.next().matches("[0-9]+")); // Move past the numbers.
		MenuItem[] mItem = new MenuItem[7];
		for(int i = 0; i < mItem.length; i++) {
			mItem[i] = new MenuItem(bar, SWT.CASCADE);
			mItem[i].setText(it.next());
			Menu submenu = new Menu(shell, SWT.DROP_DOWN);
			mItem[i].setMenu(submenu);
		}
		int i = 0;
		while(it.hasNext()) {
			addItem(bar, it, mItem[i]);
			i = (i + 1) % mItem.length;
		}
		shell.setLayout(new FillLayout());
		label = new Label(shell, SWT.CENTER);
	}
	static Listener listener = new Listener() {
		public void handleEvent(Event e) {
			System.out.println(e.toString());
			label.setText(e.toString());
		}
	};
	void addItem(Menu bar, Iterator<String> it, MenuItem mItem) {
		MenuItem item = new MenuItem(mItem.getMenu(),SWT.PUSH);
		item.addListener(SWT.Selection, listener);
		item.setText(it.next());
	}
	public static void main(String[] args) {
		SWTConsole.run(new SWTMenus(), 600, 200);
	}
}