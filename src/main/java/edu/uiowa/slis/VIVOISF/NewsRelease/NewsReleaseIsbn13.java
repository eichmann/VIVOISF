package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseIsbn13Iterator theNewsRelease = (NewsReleaseIsbn13Iterator)findAncestorWithClass(this, NewsReleaseIsbn13Iterator.class);
			pageContext.getOut().print(theNewsRelease.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

