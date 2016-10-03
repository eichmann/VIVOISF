package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillCourt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillCourt currentInstance = null;
	private static final Log log = LogFactory.getLog(BillCourt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillCourtIterator theBillCourtIterator = (BillCourtIterator)findAncestorWithClass(this, BillCourtIterator.class);
			pageContext.getOut().print(theBillCourtIterator.getCourt());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for court tag ");
		}
		return SKIP_BODY;
	}
}

