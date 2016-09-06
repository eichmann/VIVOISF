package edu.uiowa.slis.VIVOISF.OBI_0100026;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0100026OBI_0000304Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0100026OBI_0000304Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0100026OBI_0000304Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0100026OBI_0000304Iterator theOBI_0100026OBI_0000304Iterator = (OBI_0100026OBI_0000304Iterator)findAncestorWithClass(this, OBI_0100026OBI_0000304Iterator.class);
			pageContext.getOut().print(theOBI_0100026OBI_0000304Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0100026 for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0100026 for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

