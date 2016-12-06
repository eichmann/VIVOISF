package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameShortITIterator thePosition = (PositionNameShortITIterator)findAncestorWithClass(this, PositionNameShortITIterator.class);
			pageContext.getOut().print(thePosition.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

