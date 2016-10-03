package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptContentIterator theExcerpt = (ExcerptContentIterator)findAncestorWithClass(this, ExcerptContentIterator.class);
			pageContext.getOut().print(theExcerpt.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for content tag ");
		}
		return SKIP_BODY;
	}
}

