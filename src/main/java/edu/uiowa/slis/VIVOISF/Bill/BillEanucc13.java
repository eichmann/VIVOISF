package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BillEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillEanucc13Iterator theBill = (BillEanucc13Iterator)findAncestorWithClass(this, BillEanucc13Iterator.class);
			pageContext.getOut().print(theBill.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

