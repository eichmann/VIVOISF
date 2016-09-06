package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptTheAbstractIterator theExcerpt = (ExcerptTheAbstractIterator)findAncestorWithClass(this, ExcerptTheAbstractIterator.class);
			pageContext.getOut().print(theExcerpt.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

