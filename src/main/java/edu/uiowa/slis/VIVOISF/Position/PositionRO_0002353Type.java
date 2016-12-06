package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionRO_0002353Iterator thePositionRO_0002353Iterator = (PositionRO_0002353Iterator)findAncestorWithClass(this, PositionRO_0002353Iterator.class);
			pageContext.getOut().print(thePositionRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

