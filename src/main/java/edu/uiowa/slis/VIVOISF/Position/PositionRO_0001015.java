package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionRO_0001015Iterator thePositionRO_0001015Iterator = (PositionRO_0001015Iterator)findAncestorWithClass(this, PositionRO_0001015Iterator.class);
			pageContext.getOut().print(thePositionRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

