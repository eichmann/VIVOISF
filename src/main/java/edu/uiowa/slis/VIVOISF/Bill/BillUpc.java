package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(BillUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillUpcIterator theBill = (BillUpcIterator)findAncestorWithClass(this, BillUpcIterator.class);
			pageContext.getOut().print(theBill.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for upc tag ");
		}
		return SKIP_BODY;
	}
}

