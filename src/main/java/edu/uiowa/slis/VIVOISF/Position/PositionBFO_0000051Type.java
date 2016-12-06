package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionBFO_0000051Iterator thePositionBFO_0000051Iterator = (PositionBFO_0000051Iterator)findAncestorWithClass(this, PositionBFO_0000051Iterator.class);
			pageContext.getOut().print(thePositionBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

