package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillContent currentInstance = null;
	private static final Log log = LogFactory.getLog(BillContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillContentIterator theBill = (BillContentIterator)findAncestorWithClass(this, BillContentIterator.class);
			pageContext.getOut().print(theBill.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for content tag ");
		}
		return SKIP_BODY;
	}
}

