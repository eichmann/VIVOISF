package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageReviewOfIterator theWebpageReviewOfIterator = (WebpageReviewOfIterator)findAncestorWithClass(this, WebpageReviewOfIterator.class);
			pageContext.getOut().print(theWebpageReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

