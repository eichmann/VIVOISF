package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionRO_0002353Iterator thePrimaryPositionRO_0002353Iterator = (PrimaryPositionRO_0002353Iterator)findAncestorWithClass(this, PrimaryPositionRO_0002353Iterator.class);
			pageContext.getOut().print(thePrimaryPositionRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

