package edu.uiowa.slis.VIVOISF.PopulatedPlace;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PopulatedPlaceValidInInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PopulatedPlaceValidInInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PopulatedPlaceValidInInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PopulatedPlaceValidInInverseIterator thePopulatedPlaceValidInInverseIterator = (PopulatedPlaceValidInInverseIterator)findAncestorWithClass(this, PopulatedPlaceValidInInverseIterator.class);
			pageContext.getOut().print(thePopulatedPlaceValidInInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for validIn tag ");
		}
		return SKIP_BODY;
	}
}

