package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameOfficialARIterator thePosition = (PositionNameOfficialARIterator)findAncestorWithClass(this, PositionNameOfficialARIterator.class);
			pageContext.getOut().print(thePosition.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

