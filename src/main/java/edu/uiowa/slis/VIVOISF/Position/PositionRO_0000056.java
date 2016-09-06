package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionRO_0000056Iterator thePositionRO_0000056Iterator = (PositionRO_0000056Iterator)findAncestorWithClass(this, PositionRO_0000056Iterator.class);
			pageContext.getOut().print(thePositionRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

