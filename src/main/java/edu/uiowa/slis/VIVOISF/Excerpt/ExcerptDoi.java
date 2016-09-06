package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptDoiIterator theExcerpt = (ExcerptDoiIterator)findAncestorWithClass(this, ExcerptDoiIterator.class);
			pageContext.getOut().print(theExcerpt.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for doi tag ");
		}
		return SKIP_BODY;
	}
}

