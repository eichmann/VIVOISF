package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(BillEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillEditionIterator theBill = (BillEditionIterator)findAncestorWithClass(this, BillEditionIterator.class);
			pageContext.getOut().print(theBill.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for edition tag ");
		}
		return SKIP_BODY;
	}
}

