package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionRO_0000056Iterator thePrimaryPositionRO_0000056Iterator = (PrimaryPositionRO_0000056Iterator)findAncestorWithClass(this, PrimaryPositionRO_0000056Iterator.class);
			pageContext.getOut().print(thePrimaryPositionRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

