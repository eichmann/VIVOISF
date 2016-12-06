package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009GeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009GeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009GeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009GeographicFocusIterator theIAO_0000009GeographicFocusIterator = (IAO_0000009GeographicFocusIterator)findAncestorWithClass(this, IAO_0000009GeographicFocusIterator.class);
			pageContext.getOut().print(theIAO_0000009GeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

