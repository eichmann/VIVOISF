package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptIAO_0000136Iterator theExcerptIAO_0000136Iterator = (ExcerptIAO_0000136Iterator)findAncestorWithClass(this, ExcerptIAO_0000136Iterator.class);
			pageContext.getOut().print(theExcerptIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

