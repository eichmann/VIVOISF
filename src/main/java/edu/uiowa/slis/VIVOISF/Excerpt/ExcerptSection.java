package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptSectionIterator theExcerpt = (ExcerptSectionIterator)findAncestorWithClass(this, ExcerptSectionIterator.class);
			pageContext.getOut().print(theExcerpt.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for section tag ");
		}
		return SKIP_BODY;
	}
}

