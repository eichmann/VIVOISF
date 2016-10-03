package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(BillPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillPageStartIterator theBill = (BillPageStartIterator)findAncestorWithClass(this, BillPageStartIterator.class);
			pageContext.getOut().print(theBill.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

