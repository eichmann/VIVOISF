package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptCitedByIterator theExcerptCitedByIterator = (ExcerptCitedByIterator)findAncestorWithClass(this, ExcerptCitedByIterator.class);
			pageContext.getOut().print(theExcerptCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

