package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038GeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038GeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038GeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038GeographicFocusIterator theBFO_0000038GeographicFocusIterator = (BFO_0000038GeographicFocusIterator)findAncestorWithClass(this, BFO_0000038GeographicFocusIterator.class);
			pageContext.getOut().print(theBFO_0000038GeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

