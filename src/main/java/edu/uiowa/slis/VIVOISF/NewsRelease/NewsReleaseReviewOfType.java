package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseReviewOfIterator theNewsReleaseReviewOfIterator = (NewsReleaseReviewOfIterator)findAncestorWithClass(this, NewsReleaseReviewOfIterator.class);
			pageContext.getOut().print(theNewsReleaseReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

