package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleasePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleasePages currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleasePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleasePagesIterator theNewsRelease = (NewsReleasePagesIterator)findAncestorWithClass(this, NewsReleasePagesIterator.class);
			pageContext.getOut().print(theNewsRelease.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for pages tag ");
		}
		return SKIP_BODY;
	}
}

