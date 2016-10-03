package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptPageEndIterator theExcerpt = (ExcerptPageEndIterator)findAncestorWithClass(this, ExcerptPageEndIterator.class);
			pageContext.getOut().print(theExcerpt.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

