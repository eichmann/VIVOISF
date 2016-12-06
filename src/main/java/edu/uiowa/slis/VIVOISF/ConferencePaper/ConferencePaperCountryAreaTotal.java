package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCountryAreaTotalIterator theConferencePaper = (ConferencePaperCountryAreaTotalIterator)findAncestorWithClass(this, ConferencePaperCountryAreaTotalIterator.class);
			pageContext.getOut().print(theConferencePaper.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

