package edu.uiowa.slis.VIVOISF.OBI_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000017BFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000017BFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000017BFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000017BFO_0000054Iterator theOBI_0000017BFO_0000054Iterator = (OBI_0000017BFO_0000054Iterator)findAncestorWithClass(this, OBI_0000017BFO_0000054Iterator.class);
			pageContext.getOut().print(theOBI_0000017BFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000017 for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000017 for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

