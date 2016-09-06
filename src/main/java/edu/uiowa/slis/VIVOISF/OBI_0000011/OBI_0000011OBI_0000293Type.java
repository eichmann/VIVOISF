package edu.uiowa.slis.VIVOISF.OBI_0000011;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000011OBI_0000293Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000011OBI_0000293Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000011OBI_0000293Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000011OBI_0000293Iterator theOBI_0000011OBI_0000293Iterator = (OBI_0000011OBI_0000293Iterator)findAncestorWithClass(this, OBI_0000011OBI_0000293Iterator.class);
			pageContext.getOut().print(theOBI_0000011OBI_0000293Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000011 for OBI_0000293 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000011 for OBI_0000293 tag ");
		}
		return SKIP_BODY;
	}
}

