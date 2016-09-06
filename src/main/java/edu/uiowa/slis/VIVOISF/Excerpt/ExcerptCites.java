package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptCites currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptCitesIterator theExcerptCitesIterator = (ExcerptCitesIterator)findAncestorWithClass(this, ExcerptCitesIterator.class);
			pageContext.getOut().print(theExcerptCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for cites tag ");
		}
		return SKIP_BODY;
	}
}

