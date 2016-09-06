package edu.uiowa.slis.VIVOISF.OBI_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000017RO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000017RO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000017RO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000017RO_0000052Iterator theOBI_0000017RO_0000052Iterator = (OBI_0000017RO_0000052Iterator)findAncestorWithClass(this, OBI_0000017RO_0000052Iterator.class);
			pageContext.getOut().print(theOBI_0000017RO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000017 for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000017 for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

