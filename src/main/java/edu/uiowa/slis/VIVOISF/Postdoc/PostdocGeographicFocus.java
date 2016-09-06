package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocGeographicFocusIterator thePostdocGeographicFocusIterator = (PostdocGeographicFocusIterator)findAncestorWithClass(this, PostdocGeographicFocusIterator.class);
			pageContext.getOut().print(thePostdocGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

