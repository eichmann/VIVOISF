package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptEditionIterator theExcerpt = (ExcerptEditionIterator)findAncestorWithClass(this, ExcerptEditionIterator.class);
			pageContext.getOut().print(theExcerpt.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for edition tag ");
		}
		return SKIP_BODY;
	}
}

