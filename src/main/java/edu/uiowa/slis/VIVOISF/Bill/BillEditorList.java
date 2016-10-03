package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BillEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillEditorListIterator theBillEditorListIterator = (BillEditorListIterator)findAncestorWithClass(this, BillEditorListIterator.class);
			pageContext.getOut().print(theBillEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for editorList tag ");
		}
		return SKIP_BODY;
	}
}

