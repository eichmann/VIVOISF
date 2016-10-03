package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceReviewOfIterator theReferenceSourceReviewOfIterator = (ReferenceSourceReviewOfIterator)findAncestorWithClass(this, ReferenceSourceReviewOfIterator.class);
			pageContext.getOut().print(theReferenceSourceReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

