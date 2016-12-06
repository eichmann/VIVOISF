package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(areaGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaGeographicFocusIterator theareaGeographicFocusIterator = (areaGeographicFocusIterator)findAncestorWithClass(this, areaGeographicFocusIterator.class);
			pageContext.getOut().print(theareaGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing area for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

