package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001GeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001GeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001GeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001GeographicFocusIterator theBFO_0000001GeographicFocusIterator = (BFO_0000001GeographicFocusIterator)findAncestorWithClass(this, BFO_0000001GeographicFocusIterator.class);
			pageContext.getOut().print(theBFO_0000001GeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

