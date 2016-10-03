package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(BillOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillOwnerIterator theBillOwnerIterator = (BillOwnerIterator)findAncestorWithClass(this, BillOwnerIterator.class);
			pageContext.getOut().print(theBillOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for owner tag ");
		}
		return SKIP_BODY;
	}
}
