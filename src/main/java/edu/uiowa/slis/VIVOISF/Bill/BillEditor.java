package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(BillEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillEditorIterator theBillEditorIterator = (BillEditorIterator)findAncestorWithClass(this, BillEditorIterator.class);
			pageContext.getOut().print(theBillEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for editor tag ");
		}
		return SKIP_BODY;
	}
}

