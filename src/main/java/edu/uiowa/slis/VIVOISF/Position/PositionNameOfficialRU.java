package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameOfficialRUIterator thePosition = (PositionNameOfficialRUIterator)findAncestorWithClass(this, PositionNameOfficialRUIterator.class);
			pageContext.getOut().print(thePosition.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

