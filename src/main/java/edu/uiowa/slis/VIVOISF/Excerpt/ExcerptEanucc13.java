package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptEanucc13Iterator theExcerpt = (ExcerptEanucc13Iterator)findAncestorWithClass(this, ExcerptEanucc13Iterator.class);
			pageContext.getOut().print(theExcerpt.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

