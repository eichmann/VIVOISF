package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterLandAreaUnitIterator theConferencePoster = (ConferencePosterLandAreaUnitIterator)findAncestorWithClass(this, ConferencePosterLandAreaUnitIterator.class);
			pageContext.getOut().print(theConferencePoster.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

