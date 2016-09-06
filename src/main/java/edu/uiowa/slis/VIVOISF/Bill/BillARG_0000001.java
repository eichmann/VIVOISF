package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(BillARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillARG_0000001Iterator theBill = (BillARG_0000001Iterator)findAncestorWithClass(this, BillARG_0000001Iterator.class);
			pageContext.getOut().print(theBill.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

