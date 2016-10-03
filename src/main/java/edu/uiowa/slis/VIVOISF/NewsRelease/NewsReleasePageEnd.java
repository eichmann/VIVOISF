package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleasePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleasePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleasePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleasePageEndIterator theNewsRelease = (NewsReleasePageEndIterator)findAncestorWithClass(this, NewsReleasePageEndIterator.class);
			pageContext.getOut().print(theNewsRelease.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

