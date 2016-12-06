package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionRO_0001025Iterator thePositionRO_0001025Iterator = (PositionRO_0001025Iterator)findAncestorWithClass(this, PositionRO_0001025Iterator.class);
			pageContext.getOut().print(thePositionRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

