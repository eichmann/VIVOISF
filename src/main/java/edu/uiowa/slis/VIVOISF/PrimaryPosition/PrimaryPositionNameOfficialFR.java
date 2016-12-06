package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameOfficialFRIterator thePrimaryPosition = (PrimaryPositionNameOfficialFRIterator)findAncestorWithClass(this, PrimaryPositionNameOfficialFRIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

