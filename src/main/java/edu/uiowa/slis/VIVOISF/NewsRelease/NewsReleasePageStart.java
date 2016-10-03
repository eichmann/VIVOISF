package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleasePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleasePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleasePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleasePageStartIterator theNewsRelease = (NewsReleasePageStartIterator)findAncestorWithClass(this, NewsReleasePageStartIterator.class);
			pageContext.getOut().print(theNewsRelease.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

