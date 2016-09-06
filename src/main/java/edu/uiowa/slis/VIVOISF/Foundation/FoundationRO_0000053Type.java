package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationRO_0000053Iterator theFoundationRO_0000053Iterator = (FoundationRO_0000053Iterator)findAncestorWithClass(this, FoundationRO_0000053Iterator.class);
			pageContext.getOut().print(theFoundationRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

