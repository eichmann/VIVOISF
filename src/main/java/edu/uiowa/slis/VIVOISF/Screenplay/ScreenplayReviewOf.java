package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayReviewOfIterator theScreenplayReviewOfIterator = (ScreenplayReviewOfIterator)findAncestorWithClass(this, ScreenplayReviewOfIterator.class);
			pageContext.getOut().print(theScreenplayReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

