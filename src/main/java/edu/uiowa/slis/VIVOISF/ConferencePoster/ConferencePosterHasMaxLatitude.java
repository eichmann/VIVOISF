package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasMaxLatitudeIterator theConferencePoster = (ConferencePosterHasMaxLatitudeIterator)findAncestorWithClass(this, ConferencePosterHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theConferencePoster.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

