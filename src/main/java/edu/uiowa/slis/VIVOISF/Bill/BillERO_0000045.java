package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(BillERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillERO_0000045Iterator theBill = (BillERO_0000045Iterator)findAncestorWithClass(this, BillERO_0000045Iterator.class);
			pageContext.getOut().print(theBill.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

