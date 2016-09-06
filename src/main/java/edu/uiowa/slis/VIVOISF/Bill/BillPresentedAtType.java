package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillPresentedAtIterator theBillPresentedAtIterator = (BillPresentedAtIterator)findAncestorWithClass(this, BillPresentedAtIterator.class);
			pageContext.getOut().print(theBillPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

