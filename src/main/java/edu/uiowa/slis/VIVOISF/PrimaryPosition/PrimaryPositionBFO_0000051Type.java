package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionBFO_0000051Iterator thePrimaryPositionBFO_0000051Iterator = (PrimaryPositionBFO_0000051Iterator)findAncestorWithClass(this, PrimaryPositionBFO_0000051Iterator.class);
			pageContext.getOut().print(thePrimaryPositionBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

