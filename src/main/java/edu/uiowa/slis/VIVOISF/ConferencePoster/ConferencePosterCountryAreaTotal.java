package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCountryAreaTotalIterator theConferencePoster = (ConferencePosterCountryAreaTotalIterator)findAncestorWithClass(this, ConferencePosterCountryAreaTotalIterator.class);
			pageContext.getOut().print(theConferencePoster.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

