package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseReviewOfIterator theNewsReleaseReviewOfIterator = (NewsReleaseReviewOfIterator)findAncestorWithClass(this, NewsReleaseReviewOfIterator.class);
			pageContext.getOut().print(theNewsReleaseReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

