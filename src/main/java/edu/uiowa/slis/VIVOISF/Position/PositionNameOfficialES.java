package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameOfficialESIterator thePosition = (PositionNameOfficialESIterator)findAncestorWithClass(this, PositionNameOfficialESIterator.class);
			pageContext.getOut().print(thePosition.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

