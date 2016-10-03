package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseCodenIterator theNewsRelease = (NewsReleaseCodenIterator)findAncestorWithClass(this, NewsReleaseCodenIterator.class);
			pageContext.getOut().print(theNewsRelease.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for coden tag ");
		}
		return SKIP_BODY;
	}
}

