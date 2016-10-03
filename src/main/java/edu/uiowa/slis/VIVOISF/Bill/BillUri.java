package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillUri currentInstance = null;
	private static final Log log = LogFactory.getLog(BillUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillUriIterator theBill = (BillUriIterator)findAncestorWithClass(this, BillUriIterator.class);
			pageContext.getOut().print(theBill.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for uri tag ");
		}
		return SKIP_BODY;
	}
}

