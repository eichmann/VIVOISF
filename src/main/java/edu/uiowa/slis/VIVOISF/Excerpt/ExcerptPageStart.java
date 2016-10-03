package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptPageStartIterator theExcerpt = (ExcerptPageStartIterator)findAncestorWithClass(this, ExcerptPageStartIterator.class);
			pageContext.getOut().print(theExcerpt.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

