package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisReviewOfIterator theThesisReviewOfIterator = (ThesisReviewOfIterator)findAncestorWithClass(this, ThesisReviewOfIterator.class);
			pageContext.getOut().print(theThesisReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

