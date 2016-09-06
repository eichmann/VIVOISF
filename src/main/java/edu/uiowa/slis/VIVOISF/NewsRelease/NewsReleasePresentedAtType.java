package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleasePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleasePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleasePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleasePresentedAtIterator theNewsReleasePresentedAtIterator = (NewsReleasePresentedAtIterator)findAncestorWithClass(this, NewsReleasePresentedAtIterator.class);
			pageContext.getOut().print(theNewsReleasePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

