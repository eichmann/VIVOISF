package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasMaxLatitudeIterator theConferencePaper = (ConferencePaperHasMaxLatitudeIterator)findAncestorWithClass(this, ConferencePaperHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theConferencePaper.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

