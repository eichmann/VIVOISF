package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptIdentifierIterator theExcerpt = (ExcerptIdentifierIterator)findAncestorWithClass(this, ExcerptIdentifierIterator.class);
			pageContext.getOut().print(theExcerpt.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for identifier tag ");
		}
		return SKIP_BODY;
	}
}

