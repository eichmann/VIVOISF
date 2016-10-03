package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseShortDescriptionIterator theNewsRelease = (NewsReleaseShortDescriptionIterator)findAncestorWithClass(this, NewsReleaseShortDescriptionIterator.class);
			pageContext.getOut().print(theNewsRelease.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

