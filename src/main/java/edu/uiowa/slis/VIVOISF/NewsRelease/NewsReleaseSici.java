package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseSici currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseSiciIterator theNewsRelease = (NewsReleaseSiciIterator)findAncestorWithClass(this, NewsReleaseSiciIterator.class);
			pageContext.getOut().print(theNewsRelease.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for sici tag ");
		}
		return SKIP_BODY;
	}
}
