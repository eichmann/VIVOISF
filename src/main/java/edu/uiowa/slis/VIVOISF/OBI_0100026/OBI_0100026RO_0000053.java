package edu.uiowa.slis.VIVOISF.OBI_0100026;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0100026RO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0100026RO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0100026RO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0100026RO_0000053Iterator theOBI_0100026RO_0000053Iterator = (OBI_0100026RO_0000053Iterator)findAncestorWithClass(this, OBI_0100026RO_0000053Iterator.class);
			pageContext.getOut().print(theOBI_0100026RO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0100026 for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0100026 for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

