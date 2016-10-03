package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptUpcIterator theExcerpt = (ExcerptUpcIterator)findAncestorWithClass(this, ExcerptUpcIterator.class);
			pageContext.getOut().print(theExcerpt.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for upc tag ");
		}
		return SKIP_BODY;
	}
}

