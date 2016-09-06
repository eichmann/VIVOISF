package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseTheAbstractIterator theNewsRelease = (NewsReleaseTheAbstractIterator)findAncestorWithClass(this, NewsReleaseTheAbstractIterator.class);
			pageContext.getOut().print(theNewsRelease.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

