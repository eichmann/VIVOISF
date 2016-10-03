package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplaySici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplaySici currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplaySici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplaySiciIterator theScreenplay = (ScreenplaySiciIterator)findAncestorWithClass(this, ScreenplaySiciIterator.class);
			pageContext.getOut().print(theScreenplay.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for sici tag ");
		}
		return SKIP_BODY;
	}
}

