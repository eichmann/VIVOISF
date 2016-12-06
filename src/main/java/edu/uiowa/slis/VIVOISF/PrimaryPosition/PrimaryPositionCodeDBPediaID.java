package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCodeDBPediaIDIterator thePrimaryPosition = (PrimaryPositionCodeDBPediaIDIterator)findAncestorWithClass(this, PrimaryPositionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

