package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillArgued extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillArgued currentInstance = null;
	private static final Log log = LogFactory.getLog(BillArgued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillArguedIterator theBill = (BillArguedIterator)findAncestorWithClass(this, BillArguedIterator.class);
			pageContext.getOut().print(theBill.getArgued());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for argued tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for argued tag ");
		}
		return SKIP_BODY;
	}
}

