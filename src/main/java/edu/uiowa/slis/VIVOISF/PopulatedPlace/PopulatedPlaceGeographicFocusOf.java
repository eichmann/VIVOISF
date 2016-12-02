package edu.uiowa.slis.VIVOISF.PopulatedPlace;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PopulatedPlaceGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PopulatedPlaceGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PopulatedPlaceGeographicFocusOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PopulatedPlaceGeographicFocusOfIterator thePopulatedPlace = (PopulatedPlaceGeographicFocusOfIterator)findAncestorWithClass(this, PopulatedPlaceGeographicFocusOfIterator.class);
			pageContext.getOut().print(thePopulatedPlace.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

