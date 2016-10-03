package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseUpcIterator theNewsRelease = (NewsReleaseUpcIterator)findAncestorWithClass(this, NewsReleaseUpcIterator.class);
			pageContext.getOut().print(theNewsRelease.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for upc tag ");
		}
		return SKIP_BODY;
	}
}

