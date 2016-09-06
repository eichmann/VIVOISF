package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(BillPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillPmidIterator theBill = (BillPmidIterator)findAncestorWithClass(this, BillPmidIterator.class);
			pageContext.getOut().print(theBill.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for pmid tag ");
		}
		return SKIP_BODY;
	}
}

