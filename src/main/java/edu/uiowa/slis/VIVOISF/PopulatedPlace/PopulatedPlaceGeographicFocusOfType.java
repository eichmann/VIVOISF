package edu.uiowa.slis.VIVOISF.PopulatedPlace;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PopulatedPlaceGeographicFocusOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PopulatedPlaceGeographicFocusOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PopulatedPlaceGeographicFocusOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PopulatedPlaceGeographicFocusOfIterator thePopulatedPlaceGeographicFocusOfIterator = (PopulatedPlaceGeographicFocusOfIterator)findAncestorWithClass(this, PopulatedPlaceGeographicFocusOfIterator.class);
			pageContext.getOut().print(thePopulatedPlaceGeographicFocusOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

