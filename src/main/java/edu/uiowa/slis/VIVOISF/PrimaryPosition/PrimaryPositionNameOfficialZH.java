package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameOfficialZHIterator thePrimaryPosition = (PrimaryPositionNameOfficialZHIterator)findAncestorWithClass(this, PrimaryPositionNameOfficialZHIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

