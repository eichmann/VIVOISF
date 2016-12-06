package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperLandAreaTotalIterator theConferencePaper = (ConferencePaperLandAreaTotalIterator)findAncestorWithClass(this, ConferencePaperLandAreaTotalIterator.class);
			pageContext.getOut().print(theConferencePaper.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

