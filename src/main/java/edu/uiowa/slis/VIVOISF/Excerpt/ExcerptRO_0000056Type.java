package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptRO_0000056Iterator theExcerptRO_0000056Iterator = (ExcerptRO_0000056Iterator)findAncestorWithClass(this, ExcerptRO_0000056Iterator.class);
			pageContext.getOut().print(theExcerptRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

