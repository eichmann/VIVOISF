package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillSici currentInstance = null;
	private static final Log log = LogFactory.getLog(BillSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillSiciIterator theBill = (BillSiciIterator)findAncestorWithClass(this, BillSiciIterator.class);
			pageContext.getOut().print(theBill.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for sici tag ");
		}
		return SKIP_BODY;
	}
}

