package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptSiciIterator theExcerpt = (ExcerptSiciIterator)findAncestorWithClass(this, ExcerptSiciIterator.class);
			pageContext.getOut().print(theExcerpt.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for sici tag ");
		}
		return SKIP_BODY;
	}
}

