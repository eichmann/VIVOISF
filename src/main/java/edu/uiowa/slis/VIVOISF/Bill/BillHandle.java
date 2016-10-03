package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(BillHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillHandleIterator theBill = (BillHandleIterator)findAncestorWithClass(this, BillHandleIterator.class);
			pageContext.getOut().print(theBill.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for handle tag ");
		}
		return SKIP_BODY;
	}
}

