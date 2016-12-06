package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameShortITIterator thePrimaryPosition = (PrimaryPositionNameShortITIterator)findAncestorWithClass(this, PrimaryPositionNameShortITIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

