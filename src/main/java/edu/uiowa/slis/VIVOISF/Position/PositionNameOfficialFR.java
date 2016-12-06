package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameOfficialFRIterator thePosition = (PositionNameOfficialFRIterator)findAncestorWithClass(this, PositionNameOfficialFRIterator.class);
			pageContext.getOut().print(thePosition.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

