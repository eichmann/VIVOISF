package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(BillOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillOclcnumIterator theBill = (BillOclcnumIterator)findAncestorWithClass(this, BillOclcnumIterator.class);
			pageContext.getOut().print(theBill.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

