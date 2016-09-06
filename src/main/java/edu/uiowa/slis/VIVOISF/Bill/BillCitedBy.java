package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BillCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillCitedByIterator theBillCitedByIterator = (BillCitedByIterator)findAncestorWithClass(this, BillCitedByIterator.class);
			pageContext.getOut().print(theBillCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

