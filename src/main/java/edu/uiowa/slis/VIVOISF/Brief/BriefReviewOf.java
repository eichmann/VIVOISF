package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefReviewOfIterator theBriefReviewOfIterator = (BriefReviewOfIterator)findAncestorWithClass(this, BriefReviewOfIterator.class);
			pageContext.getOut().print(theBriefReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

