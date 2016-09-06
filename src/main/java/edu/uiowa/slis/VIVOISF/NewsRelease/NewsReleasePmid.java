package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleasePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleasePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleasePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleasePmidIterator theNewsRelease = (NewsReleasePmidIterator)findAncestorWithClass(this, NewsReleasePmidIterator.class);
			pageContext.getOut().print(theNewsRelease.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for pmid tag ");
		}
		return SKIP_BODY;
	}
}

