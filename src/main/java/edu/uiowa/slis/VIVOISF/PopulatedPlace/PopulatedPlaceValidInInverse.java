package edu.uiowa.slis.VIVOISF.PopulatedPlace;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PopulatedPlaceValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PopulatedPlaceValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PopulatedPlaceValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PopulatedPlaceValidInInverseIterator thePopulatedPlaceValidInInverseIterator = (PopulatedPlaceValidInInverseIterator)findAncestorWithClass(this, PopulatedPlaceValidInInverseIterator.class);
			pageContext.getOut().print(thePopulatedPlaceValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for validIn tag ");
		}
		return SKIP_BODY;
	}
}

