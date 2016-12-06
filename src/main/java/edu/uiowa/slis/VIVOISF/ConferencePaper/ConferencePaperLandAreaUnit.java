package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperLandAreaUnitIterator theConferencePaper = (ConferencePaperLandAreaUnitIterator)findAncestorWithClass(this, ConferencePaperLandAreaUnitIterator.class);
			pageContext.getOut().print(theConferencePaper.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

