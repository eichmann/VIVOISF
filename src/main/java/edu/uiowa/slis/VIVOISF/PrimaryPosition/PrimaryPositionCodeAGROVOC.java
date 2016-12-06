package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCodeAGROVOCIterator thePrimaryPosition = (PrimaryPositionCodeAGROVOCIterator)findAncestorWithClass(this, PrimaryPositionCodeAGROVOCIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

