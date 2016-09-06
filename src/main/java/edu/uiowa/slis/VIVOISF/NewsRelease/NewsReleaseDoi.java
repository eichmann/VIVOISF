package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseDoiIterator theNewsRelease = (NewsReleaseDoiIterator)findAncestorWithClass(this, NewsReleaseDoiIterator.class);
			pageContext.getOut().print(theNewsRelease.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for doi tag ");
		}
		return SKIP_BODY;
	}
}

