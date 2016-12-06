package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameShortARIterator thePosition = (PositionNameShortARIterator)findAncestorWithClass(this, PositionNameShortARIterator.class);
			pageContext.getOut().print(thePosition.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

