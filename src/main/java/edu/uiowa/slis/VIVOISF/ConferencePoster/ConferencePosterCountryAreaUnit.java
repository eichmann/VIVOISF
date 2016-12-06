package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCountryAreaUnitIterator theConferencePoster = (ConferencePosterCountryAreaUnitIterator)findAncestorWithClass(this, ConferencePosterCountryAreaUnitIterator.class);
			pageContext.getOut().print(theConferencePoster.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

