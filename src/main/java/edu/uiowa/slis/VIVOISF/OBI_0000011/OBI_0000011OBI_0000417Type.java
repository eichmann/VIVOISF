package edu.uiowa.slis.VIVOISF.OBI_0000011;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000011OBI_0000417Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000011OBI_0000417Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000011OBI_0000417Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000011OBI_0000417Iterator theOBI_0000011OBI_0000417Iterator = (OBI_0000011OBI_0000417Iterator)findAncestorWithClass(this, OBI_0000011OBI_0000417Iterator.class);
			pageContext.getOut().print(theOBI_0000011OBI_0000417Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000011 for OBI_0000417 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000011 for OBI_0000417 tag ");
		}
		return SKIP_BODY;
	}
}

