package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BillAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillAuthorListIterator theBillAuthorListIterator = (BillAuthorListIterator)findAncestorWithClass(this, BillAuthorListIterator.class);
			pageContext.getOut().print(theBillAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for authorList tag ");
		}
		return SKIP_BODY;
	}
}

