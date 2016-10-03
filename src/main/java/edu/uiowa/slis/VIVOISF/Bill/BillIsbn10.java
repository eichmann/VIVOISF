package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(BillIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillIsbn10Iterator theBill = (BillIsbn10Iterator)findAncestorWithClass(this, BillIsbn10Iterator.class);
			pageContext.getOut().print(theBill.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

