package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptAsinIterator theExcerpt = (ExcerptAsinIterator)findAncestorWithClass(this, ExcerptAsinIterator.class);
			pageContext.getOut().print(theExcerpt.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for asin tag ");
		}
		return SKIP_BODY;
	}
}

