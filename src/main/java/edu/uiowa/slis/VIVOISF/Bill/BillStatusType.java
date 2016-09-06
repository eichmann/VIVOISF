package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillStatusIterator theBillStatusIterator = (BillStatusIterator)findAncestorWithClass(this, BillStatusIterator.class);
			pageContext.getOut().print(theBillStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for status tag ");
		}
		return SKIP_BODY;
	}
}

