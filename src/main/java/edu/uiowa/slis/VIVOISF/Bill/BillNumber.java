package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(BillNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillNumberIterator theBill = (BillNumberIterator)findAncestorWithClass(this, BillNumberIterator.class);
			pageContext.getOut().print(theBill.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for number tag ");
		}
		return SKIP_BODY;
	}
}

