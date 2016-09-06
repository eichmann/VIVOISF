package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceBFO_0000055Iterator theConferenceBFO_0000055Iterator = (ConferenceBFO_0000055Iterator)findAncestorWithClass(this, ConferenceBFO_0000055Iterator.class);
			pageContext.getOut().print(theConferenceBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

