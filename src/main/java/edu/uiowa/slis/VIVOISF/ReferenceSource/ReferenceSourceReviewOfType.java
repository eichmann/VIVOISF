package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceReviewOfIterator theReferenceSourceReviewOfIterator = (ReferenceSourceReviewOfIterator)findAncestorWithClass(this, ReferenceSourceReviewOfIterator.class);
			pageContext.getOut().print(theReferenceSourceReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

