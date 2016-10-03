package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptReviewOfIterator theManuscriptReviewOfIterator = (ManuscriptReviewOfIterator)findAncestorWithClass(this, ManuscriptReviewOfIterator.class);
			pageContext.getOut().print(theManuscriptReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

