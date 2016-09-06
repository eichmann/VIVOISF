package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(BillTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillTheAbstractIterator theBill = (BillTheAbstractIterator)findAncestorWithClass(this, BillTheAbstractIterator.class);
			pageContext.getOut().print(theBill.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

