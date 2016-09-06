package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayCitedByIterator theScreenplayCitedByIterator = (ScreenplayCitedByIterator)findAncestorWithClass(this, ScreenplayCitedByIterator.class);
			pageContext.getOut().print(theScreenplayCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

