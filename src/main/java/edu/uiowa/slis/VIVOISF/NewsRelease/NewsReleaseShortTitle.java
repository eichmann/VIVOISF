package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseShortTitleIterator theNewsRelease = (NewsReleaseShortTitleIterator)findAncestorWithClass(this, NewsReleaseShortTitleIterator.class);
			pageContext.getOut().print(theNewsRelease.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

