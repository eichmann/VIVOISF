package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(BillPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillPageEndIterator theBill = (BillPageEndIterator)findAncestorWithClass(this, BillPageEndIterator.class);
			pageContext.getOut().print(theBill.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

