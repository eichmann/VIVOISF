package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameOfficialITIterator thePrimaryPosition = (PrimaryPositionNameOfficialITIterator)findAncestorWithClass(this, PrimaryPositionNameOfficialITIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

