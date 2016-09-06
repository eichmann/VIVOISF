package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptStatusIterator theExcerptStatusIterator = (ExcerptStatusIterator)findAncestorWithClass(this, ExcerptStatusIterator.class);
			pageContext.getOut().print(theExcerptStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for status tag ");
		}
		return SKIP_BODY;
	}
}

