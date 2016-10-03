package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseSection currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseSectionIterator theNewsRelease = (NewsReleaseSectionIterator)findAncestorWithClass(this, NewsReleaseSectionIterator.class);
			pageContext.getOut().print(theNewsRelease.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for section tag ");
		}
		return SKIP_BODY;
	}
}

