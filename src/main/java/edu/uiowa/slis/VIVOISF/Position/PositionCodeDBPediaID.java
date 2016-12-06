package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeDBPediaIDIterator thePosition = (PositionCodeDBPediaIDIterator)findAncestorWithClass(this, PositionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thePosition.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

