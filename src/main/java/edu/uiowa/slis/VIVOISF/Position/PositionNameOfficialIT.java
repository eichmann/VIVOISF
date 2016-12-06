package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameOfficialITIterator thePosition = (PositionNameOfficialITIterator)findAncestorWithClass(this, PositionNameOfficialITIterator.class);
			pageContext.getOut().print(thePosition.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

