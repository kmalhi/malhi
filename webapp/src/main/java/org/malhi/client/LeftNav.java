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
  @UiField
  UListElement ul;
  public LeftNav() {
    Widget widget = uiBinder.createAndBindUi(this);
    //initWidget(widget);
    for (int i = 0; i < 10; i++) {
      Element listItem = DOM.createElement("li");
      listItem.setInnerText("List Item" + i);
      listItem.addClassName("h4");
      ul.appendChild(listItem);
    }
    RootPanel.get("malhi_leftNav").add(widget);
  }
}
