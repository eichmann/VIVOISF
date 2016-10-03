package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptPagesIterator theExcerpt = (ExcerptPagesIterator)findAncestorWithClass(this, ExcerptPagesIterator.class);
			pageContext.getOut().print(theExcerpt.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for pages tag ");
		}
		return SKIP_BODY;
	}
}

