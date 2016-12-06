package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasMinLongitudeIterator theConferencePaper = (ConferencePaperHasMinLongitudeIterator)findAncestorWithClass(this, ConferencePaperHasMinLongitudeIterator.class);
			pageContext.getOut().print(theConferencePaper.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

