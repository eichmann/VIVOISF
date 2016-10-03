package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualReviewOfIterator theManualReviewOfIterator = (ManualReviewOfIterator)findAncestorWithClass(this, ManualReviewOfIterator.class);
			pageContext.getOut().print(theManualReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

