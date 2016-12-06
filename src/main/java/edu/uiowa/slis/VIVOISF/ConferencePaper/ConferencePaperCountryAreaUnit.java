package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCountryAreaUnitIterator theConferencePaper = (ConferencePaperCountryAreaUnitIterator)findAncestorWithClass(this, ConferencePaperCountryAreaUnitIterator.class);
			pageContext.getOut().print(theConferencePaper.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

