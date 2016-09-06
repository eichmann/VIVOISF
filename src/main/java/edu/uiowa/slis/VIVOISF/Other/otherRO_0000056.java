package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(otherRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherRO_0000056Iterator theotherRO_0000056Iterator = (otherRO_0000056Iterator)findAncestorWithClass(this, otherRO_0000056Iterator.class);
			pageContext.getOut().print(theotherRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing other for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

