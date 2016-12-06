package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003GeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003GeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003GeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003GeographicFocusIterator theIAO_0000003GeographicFocusIterator = (IAO_0000003GeographicFocusIterator)findAncestorWithClass(this, IAO_0000003GeographicFocusIterator.class);
			pageContext.getOut().print(theIAO_0000003GeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

