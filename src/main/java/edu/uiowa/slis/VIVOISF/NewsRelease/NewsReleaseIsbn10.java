package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseIsbn10Iterator theNewsRelease = (NewsReleaseIsbn10Iterator)findAncestorWithClass(this, NewsReleaseIsbn10Iterator.class);
			pageContext.getOut().print(theNewsRelease.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

