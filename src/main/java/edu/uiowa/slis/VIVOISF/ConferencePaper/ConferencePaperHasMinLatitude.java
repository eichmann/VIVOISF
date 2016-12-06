package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasMinLatitudeIterator theConferencePaper = (ConferencePaperHasMinLatitudeIterator)findAncestorWithClass(this, ConferencePaperHasMinLatitudeIterator.class);
			pageContext.getOut().print(theConferencePaper.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

