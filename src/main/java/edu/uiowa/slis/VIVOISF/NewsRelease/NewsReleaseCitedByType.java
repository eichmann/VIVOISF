package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseCitedByIterator theNewsReleaseCitedByIterator = (NewsReleaseCitedByIterator)findAncestorWithClass(this, NewsReleaseCitedByIterator.class);
			pageContext.getOut().print(theNewsReleaseCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

