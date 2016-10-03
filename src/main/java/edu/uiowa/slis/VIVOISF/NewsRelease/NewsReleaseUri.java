package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseUri currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseUriIterator theNewsRelease = (NewsReleaseUriIterator)findAncestorWithClass(this, NewsReleaseUriIterator.class);
			pageContext.getOut().print(theNewsRelease.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for uri tag ");
		}
		return SKIP_BODY;
	}
}

