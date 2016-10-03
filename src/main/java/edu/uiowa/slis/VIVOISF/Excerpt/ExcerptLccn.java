package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptLccnIterator theExcerpt = (ExcerptLccnIterator)findAncestorWithClass(this, ExcerptLccnIterator.class);
			pageContext.getOut().print(theExcerpt.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for lccn tag ");
		}
		return SKIP_BODY;
	}
}

