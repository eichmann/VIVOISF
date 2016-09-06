package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayCitesIterator theScreenplayCitesIterator = (ScreenplayCitesIterator)findAncestorWithClass(this, ScreenplayCitesIterator.class);
			pageContext.getOut().print(theScreenplayCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for cites tag ");
		}
		return SKIP_BODY;
	}
}

