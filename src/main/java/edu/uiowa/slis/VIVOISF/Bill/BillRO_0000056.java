package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(BillRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillRO_0000056Iterator theBillRO_0000056Iterator = (BillRO_0000056Iterator)findAncestorWithClass(this, BillRO_0000056Iterator.class);
			pageContext.getOut().print(theBillRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

