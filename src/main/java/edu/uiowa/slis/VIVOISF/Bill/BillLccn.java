package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(BillLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillLccnIterator theBill = (BillLccnIterator)findAncestorWithClass(this, BillLccnIterator.class);
			pageContext.getOut().print(theBill.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for lccn tag ");
		}
		return SKIP_BODY;
	}
}

