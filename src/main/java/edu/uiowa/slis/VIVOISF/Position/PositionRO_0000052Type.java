package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionRO_0000052Iterator thePositionRO_0000052Iterator = (PositionRO_0000052Iterator)findAncestorWithClass(this, PositionRO_0000052Iterator.class);
			pageContext.getOut().print(thePositionRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

