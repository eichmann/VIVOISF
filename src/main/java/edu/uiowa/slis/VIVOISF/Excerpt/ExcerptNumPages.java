package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptNumPagesIterator theExcerpt = (ExcerptNumPagesIterator)findAncestorWithClass(this, ExcerptNumPagesIterator.class);
			pageContext.getOut().print(theExcerpt.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for numPages tag ");
		}
		return SKIP_BODY;
	}
}

