package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(BillLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillLocatorIterator theBill = (BillLocatorIterator)findAncestorWithClass(this, BillLocatorIterator.class);
			pageContext.getOut().print(theBill.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for locator tag ");
		}
		return SKIP_BODY;
	}
}

