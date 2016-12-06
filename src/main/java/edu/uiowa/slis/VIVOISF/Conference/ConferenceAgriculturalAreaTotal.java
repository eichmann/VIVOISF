package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceAgriculturalAreaTotalIterator theConference = (ConferenceAgriculturalAreaTotalIterator)findAncestorWithClass(this, ConferenceAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theConference.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

