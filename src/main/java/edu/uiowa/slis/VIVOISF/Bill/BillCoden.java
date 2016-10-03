package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(BillCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillCodenIterator theBill = (BillCodenIterator)findAncestorWithClass(this, BillCodenIterator.class);
			pageContext.getOut().print(theBill.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for coden tag ");
		}
		return SKIP_BODY;
	}
}

