package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentReviewOfIterator thePatentReviewOfIterator = (PatentReviewOfIterator)findAncestorWithClass(this, PatentReviewOfIterator.class);
			pageContext.getOut().print(thePatentReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

