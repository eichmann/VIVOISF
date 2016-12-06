package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterGeographicFocusIterator theConferencePosterGeographicFocusIterator = (ConferencePosterGeographicFocusIterator)findAncestorWithClass(this, ConferencePosterGeographicFocusIterator.class);
			pageContext.getOut().print(theConferencePosterGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

