package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseLocatorIterator theNewsRelease = (NewsReleaseLocatorIterator)findAncestorWithClass(this, NewsReleaseLocatorIterator.class);
			pageContext.getOut().print(theNewsRelease.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for locator tag ");
		}
		return SKIP_BODY;
	}
}

