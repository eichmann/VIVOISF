package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceLandAreaUnitIterator theConference = (ConferenceLandAreaUnitIterator)findAncestorWithClass(this, ConferenceLandAreaUnitIterator.class);
			pageContext.getOut().print(theConference.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

