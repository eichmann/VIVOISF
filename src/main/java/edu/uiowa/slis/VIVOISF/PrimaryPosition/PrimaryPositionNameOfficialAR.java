package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameOfficialARIterator thePrimaryPosition = (PrimaryPositionNameOfficialARIterator)findAncestorWithClass(this, PrimaryPositionNameOfficialARIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

