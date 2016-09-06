package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptPmidIterator theExcerpt = (ExcerptPmidIterator)findAncestorWithClass(this, ExcerptPmidIterator.class);
			pageContext.getOut().print(theExcerpt.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for pmid tag ");
		}
		return SKIP_BODY;
	}
}

