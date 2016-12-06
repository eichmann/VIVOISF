package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionGeographicFocusIterator theeconomic_regionGeographicFocusIterator = (economic_regionGeographicFocusIterator)findAncestorWithClass(this, economic_regionGeographicFocusIterator.class);
			pageContext.getOut().print(theeconomic_regionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

