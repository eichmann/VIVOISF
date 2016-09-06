package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillCitesIterator theBillCitesIterator = (BillCitesIterator)findAncestorWithClass(this, BillCitesIterator.class);
			pageContext.getOut().print(theBillCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for cites tag ");
		}
		return SKIP_BODY;
	}
}

