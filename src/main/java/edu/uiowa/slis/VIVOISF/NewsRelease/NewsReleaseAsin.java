package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseAsinIterator theNewsRelease = (NewsReleaseAsinIterator)findAncestorWithClass(this, NewsReleaseAsinIterator.class);
			pageContext.getOut().print(theNewsRelease.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for asin tag ");
		}
		return SKIP_BODY;
	}
}

