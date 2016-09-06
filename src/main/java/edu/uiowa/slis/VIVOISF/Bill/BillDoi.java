package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(BillDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillDoiIterator theBill = (BillDoiIterator)findAncestorWithClass(this, BillDoiIterator.class);
			pageContext.getOut().print(theBill.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for doi tag ");
		}
		return SKIP_BODY;
	}
}

