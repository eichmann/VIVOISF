package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptGtin14Iterator theExcerpt = (ExcerptGtin14Iterator)findAncestorWithClass(this, ExcerptGtin14Iterator.class);
			pageContext.getOut().print(theExcerpt.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

