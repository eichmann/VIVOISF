package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000003GeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003GeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003GeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000003GeographicFocusIterator theBFO_0000003GeographicFocusIterator = (BFO_0000003GeographicFocusIterator)findAncestorWithClass(this, BFO_0000003GeographicFocusIterator.class);
			pageContext.getOut().print(theBFO_0000003GeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000003 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000003 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

