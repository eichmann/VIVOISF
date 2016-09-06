package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayCites currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayCitesIterator theScreenplayCitesIterator = (ScreenplayCitesIterator)findAncestorWithClass(this, ScreenplayCitesIterator.class);
			pageContext.getOut().print(theScreenplayCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for cites tag ");
		}
		return SKIP_BODY;
	}
}

