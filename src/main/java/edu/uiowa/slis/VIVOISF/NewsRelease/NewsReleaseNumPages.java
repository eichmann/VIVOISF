package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseNumPagesIterator theNewsRelease = (NewsReleaseNumPagesIterator)findAncestorWithClass(this, NewsReleaseNumPagesIterator.class);
			pageContext.getOut().print(theNewsRelease.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for numPages tag ");
		}
		return SKIP_BODY;
	}
}

