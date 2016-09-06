package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillDocumentationForIterator theBillDocumentationForIterator = (BillDocumentationForIterator)findAncestorWithClass(this, BillDocumentationForIterator.class);
			pageContext.getOut().print(theBillDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

