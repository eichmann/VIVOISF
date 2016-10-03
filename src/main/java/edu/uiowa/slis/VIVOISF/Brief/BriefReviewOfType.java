package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefReviewOfIterator theBriefReviewOfIterator = (BriefReviewOfIterator)findAncestorWithClass(this, BriefReviewOfIterator.class);
			pageContext.getOut().print(theBriefReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

