package org.malhi.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Main extends Composite implements EntryPoint {
	interface MyUiBinder extends UiBinder<Widget, Main> {
	}

	private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);
	@Override
	public void onModuleLoad() {
		RootPanel.get().add(myUiBinder.createAndBindUi(this));
	}
}
