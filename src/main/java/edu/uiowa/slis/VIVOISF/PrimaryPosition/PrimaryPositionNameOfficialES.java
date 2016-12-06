package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameOfficialESIterator thePrimaryPosition = (PrimaryPositionNameOfficialESIterator)findAncestorWithClass(this, PrimaryPositionNameOfficialESIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

