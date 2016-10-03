package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(BillAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillAsinIterator theBill = (BillAsinIterator)findAncestorWithClass(this, BillAsinIterator.class);
			pageContext.getOut().print(theBill.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for asin tag ");
		}
		return SKIP_BODY;
	}
}

