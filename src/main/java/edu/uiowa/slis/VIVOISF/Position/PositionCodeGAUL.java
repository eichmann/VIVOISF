package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeGAULIterator thePosition = (PositionCodeGAULIterator)findAncestorWithClass(this, PositionCodeGAULIterator.class);
			pageContext.getOut().print(thePosition.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

