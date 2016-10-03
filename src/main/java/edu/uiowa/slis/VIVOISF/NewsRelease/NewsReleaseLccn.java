package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseLccnIterator theNewsRelease = (NewsReleaseLccnIterator)findAncestorWithClass(this, NewsReleaseLccnIterator.class);
			pageContext.getOut().print(theNewsRelease.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for lccn tag ");
		}
		return SKIP_BODY;
	}
}

