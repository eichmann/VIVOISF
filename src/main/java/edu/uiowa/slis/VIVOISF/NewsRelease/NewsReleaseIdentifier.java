package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseIdentifierIterator theNewsRelease = (NewsReleaseIdentifierIterator)findAncestorWithClass(this, NewsReleaseIdentifierIterator.class);
			pageContext.getOut().print(theNewsRelease.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for identifier tag ");
		}
		return SKIP_BODY;
	}
}

