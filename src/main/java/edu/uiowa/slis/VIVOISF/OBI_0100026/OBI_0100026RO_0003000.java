package edu.uiowa.slis.VIVOISF.OBI_0100026;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0100026RO_0003000 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0100026RO_0003000 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0100026RO_0003000.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0100026RO_0003000Iterator theOBI_0100026RO_0003000Iterator = (OBI_0100026RO_0003000Iterator)findAncestorWithClass(this, OBI_0100026RO_0003000Iterator.class);
			pageContext.getOut().print(theOBI_0100026RO_0003000Iterator.getRO_0003000());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0100026 for RO_0003000 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0100026 for RO_0003000 tag ");
		}
		return SKIP_BODY;
	}
}

