package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillSection currentInstance = null;
	private static final Log log = LogFactory.getLog(BillSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillSectionIterator theBill = (BillSectionIterator)findAncestorWithClass(this, BillSectionIterator.class);
			pageContext.getOut().print(theBill.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for section tag ");
		}
		return SKIP_BODY;
	}
}

