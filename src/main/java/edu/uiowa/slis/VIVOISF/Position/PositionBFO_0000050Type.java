package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionBFO_0000050Iterator thePositionBFO_0000050Iterator = (PositionBFO_0000050Iterator)findAncestorWithClass(this, PositionBFO_0000050Iterator.class);
			pageContext.getOut().print(thePositionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

