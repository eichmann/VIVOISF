package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptIsbn10Iterator theExcerpt = (ExcerptIsbn10Iterator)findAncestorWithClass(this, ExcerptIsbn10Iterator.class);
			pageContext.getOut().print(theExcerpt.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

