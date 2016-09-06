package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(otherRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherRO_0000053Iterator theotherRO_0000053Iterator = (otherRO_0000053Iterator)findAncestorWithClass(this, otherRO_0000053Iterator.class);
			pageContext.getOut().print(theotherRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing other for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

