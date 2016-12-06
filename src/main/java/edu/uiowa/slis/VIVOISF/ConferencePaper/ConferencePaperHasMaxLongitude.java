package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasMaxLongitudeIterator theConferencePaper = (ConferencePaperHasMaxLongitudeIterator)findAncestorWithClass(this, ConferencePaperHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theConferencePaper.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

