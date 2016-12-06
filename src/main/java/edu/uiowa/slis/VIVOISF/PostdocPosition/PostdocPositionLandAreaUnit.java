package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionLandAreaUnitIterator thePostdocPosition = (PostdocPositionLandAreaUnitIterator)findAncestorWithClass(this, PostdocPositionLandAreaUnitIterator.class);
			pageContext.getOut().print(thePostdocPosition.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

