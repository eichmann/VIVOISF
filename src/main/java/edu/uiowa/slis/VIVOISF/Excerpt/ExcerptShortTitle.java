package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptShortTitleIterator theExcerpt = (ExcerptShortTitleIterator)findAncestorWithClass(this, ExcerptShortTitleIterator.class);
			pageContext.getOut().print(theExcerpt.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

