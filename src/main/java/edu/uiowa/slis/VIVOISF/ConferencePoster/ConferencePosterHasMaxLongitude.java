package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasMaxLongitudeIterator theConferencePoster = (ConferencePosterHasMaxLongitudeIterator)findAncestorWithClass(this, ConferencePosterHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theConferencePoster.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

