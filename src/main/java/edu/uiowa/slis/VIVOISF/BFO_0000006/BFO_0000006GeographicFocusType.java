package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006GeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006GeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006GeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006GeographicFocusIterator theBFO_0000006GeographicFocusIterator = (BFO_0000006GeographicFocusIterator)findAncestorWithClass(this, BFO_0000006GeographicFocusIterator.class);
			pageContext.getOut().print(theBFO_0000006GeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

