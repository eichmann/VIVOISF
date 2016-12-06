package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379GeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379GeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379GeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379GeographicFocusIterator theARG_2000379GeographicFocusIterator = (ARG_2000379GeographicFocusIterator)findAncestorWithClass(this, ARG_2000379GeographicFocusIterator.class);
			pageContext.getOut().print(theARG_2000379GeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

