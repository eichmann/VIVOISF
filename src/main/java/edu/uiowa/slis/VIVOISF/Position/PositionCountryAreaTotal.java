package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCountryAreaTotalIterator thePosition = (PositionCountryAreaTotalIterator)findAncestorWithClass(this, PositionCountryAreaTotalIterator.class);
			pageContext.getOut().print(thePosition.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

