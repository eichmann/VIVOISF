package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionGeographicFocusIterator thePostdocPositionGeographicFocusIterator = (PostdocPositionGeographicFocusIterator)findAncestorWithClass(this, PostdocPositionGeographicFocusIterator.class);
			pageContext.getOut().print(thePostdocPositionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}
