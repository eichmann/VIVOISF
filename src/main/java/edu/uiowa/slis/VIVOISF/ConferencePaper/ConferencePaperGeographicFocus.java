package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperGeographicFocusIterator theConferencePaperGeographicFocusIterator = (ConferencePaperGeographicFocusIterator)findAncestorWithClass(this, ConferencePaperGeographicFocusIterator.class);
			pageContext.getOut().print(theConferencePaperGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

