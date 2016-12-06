package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015GeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015GeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015GeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015GeographicFocusIterator theBFO_0000015GeographicFocusIterator = (BFO_0000015GeographicFocusIterator)findAncestorWithClass(this, BFO_0000015GeographicFocusIterator.class);
			pageContext.getOut().print(theBFO_0000015GeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

