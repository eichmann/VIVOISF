package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceAgriculturalAreaUnitIterator theConference = (ConferenceAgriculturalAreaUnitIterator)findAncestorWithClass(this, ConferenceAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theConference.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

