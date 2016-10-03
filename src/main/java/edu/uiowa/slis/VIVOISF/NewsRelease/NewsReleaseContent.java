package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseContent currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseContentIterator theNewsRelease = (NewsReleaseContentIterator)findAncestorWithClass(this, NewsReleaseContentIterator.class);
			pageContext.getOut().print(theNewsRelease.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for content tag ");
		}
		return SKIP_BODY;
	}
}

