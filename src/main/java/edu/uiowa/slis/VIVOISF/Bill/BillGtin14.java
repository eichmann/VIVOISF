package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(BillGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillGtin14Iterator theBill = (BillGtin14Iterator)findAncestorWithClass(this, BillGtin14Iterator.class);
			pageContext.getOut().print(theBill.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

