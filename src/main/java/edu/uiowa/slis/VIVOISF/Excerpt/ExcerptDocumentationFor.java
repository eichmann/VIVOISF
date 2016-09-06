package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptDocumentationForIterator theExcerptDocumentationForIterator = (ExcerptDocumentationForIterator)findAncestorWithClass(this, ExcerptDocumentationForIterator.class);
			pageContext.getOut().print(theExcerptDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

