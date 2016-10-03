package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillReviewOfIterator theBillReviewOfIterator = (BillReviewOfIterator)findAncestorWithClass(this, BillReviewOfIterator.class);
			pageContext.getOut().print(theBillReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

