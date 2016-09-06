package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptARG_0000001Iterator theExcerpt = (ExcerptARG_0000001Iterator)findAncestorWithClass(this, ExcerptARG_0000001Iterator.class);
			pageContext.getOut().print(theExcerpt.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

