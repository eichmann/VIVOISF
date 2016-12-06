package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceBFO_0000051Iterator theConferenceBFO_0000051Iterator = (ConferenceBFO_0000051Iterator)findAncestorWithClass(this, ConferenceBFO_0000051Iterator.class);
			pageContext.getOut().print(theConferenceBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

