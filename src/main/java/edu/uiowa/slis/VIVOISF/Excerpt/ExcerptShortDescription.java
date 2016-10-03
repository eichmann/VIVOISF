package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptShortDescriptionIterator theExcerpt = (ExcerptShortDescriptionIterator)findAncestorWithClass(this, ExcerptShortDescriptionIterator.class);
			pageContext.getOut().print(theExcerpt.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

