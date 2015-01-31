package org.malhi.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class LeftNav extends Composite {
  private static TestUiBinder uiBinder = GWT.create(TestUiBinder.class);
  interface TestUiBinder extends UiBinder<Widget, LeftNav> {
  }
  public LeftNav() {
    Widget widget = uiBinder.createAndBindUi(this);
    RootPanel.get("malhi_leftNav").add(widget);
  }
}
