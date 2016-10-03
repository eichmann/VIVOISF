package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptCodenIterator theExcerpt = (ExcerptCodenIterator)findAncestorWithClass(this, ExcerptCodenIterator.class);
			pageContext.getOut().print(theExcerpt.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for coden tag ");
		}
		return SKIP_BODY;
	}
}

