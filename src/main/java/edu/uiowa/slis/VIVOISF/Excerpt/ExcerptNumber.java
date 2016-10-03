package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptNumberIterator theExcerpt = (ExcerptNumberIterator)findAncestorWithClass(this, ExcerptNumberIterator.class);
			pageContext.getOut().print(theExcerpt.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for number tag ");
		}
		return SKIP_BODY;
	}
}

