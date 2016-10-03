package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptUriIterator theExcerpt = (ExcerptUriIterator)findAncestorWithClass(this, ExcerptUriIterator.class);
			pageContext.getOut().print(theExcerpt.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for uri tag ");
		}
		return SKIP_BODY;
	}
}

