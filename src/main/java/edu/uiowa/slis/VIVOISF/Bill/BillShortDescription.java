package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(BillShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillShortDescriptionIterator theBill = (BillShortDescriptionIterator)findAncestorWithClass(this, BillShortDescriptionIterator.class);
			pageContext.getOut().print(theBill.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

