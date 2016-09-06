package edu.uiowa.slis.VIVOISF.OBI_0000011;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000011BFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000011BFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000011BFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000011BFO_0000055Iterator theOBI_0000011BFO_0000055Iterator = (OBI_0000011BFO_0000055Iterator)findAncestorWithClass(this, OBI_0000011BFO_0000055Iterator.class);
			pageContext.getOut().print(theOBI_0000011BFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000011 for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000011 for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

