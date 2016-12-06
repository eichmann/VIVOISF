package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasMinLongitudeIterator theConferencePoster = (ConferencePosterHasMinLongitudeIterator)findAncestorWithClass(this, ConferencePosterHasMinLongitudeIterator.class);
			pageContext.getOut().print(theConferencePoster.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

