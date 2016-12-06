package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeAGROVOCIterator thePosition = (PositionCodeAGROVOCIterator)findAncestorWithClass(this, PositionCodeAGROVOCIterator.class);
			pageContext.getOut().print(thePosition.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

