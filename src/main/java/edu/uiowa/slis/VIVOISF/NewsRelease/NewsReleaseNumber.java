package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseNumberIterator theNewsRelease = (NewsReleaseNumberIterator)findAncestorWithClass(this, NewsReleaseNumberIterator.class);
			pageContext.getOut().print(theNewsRelease.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for number tag ");
		}
		return SKIP_BODY;
	}
}

