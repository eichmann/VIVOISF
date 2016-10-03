package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptIsbn13Iterator theExcerpt = (ExcerptIsbn13Iterator)findAncestorWithClass(this, ExcerptIsbn13Iterator.class);
			pageContext.getOut().print(theExcerpt.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

