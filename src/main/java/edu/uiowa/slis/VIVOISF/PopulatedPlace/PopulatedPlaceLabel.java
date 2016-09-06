package edu.uiowa.slis.VIVOISF.PopulatedPlace;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PopulatedPlaceLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PopulatedPlaceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PopulatedPlaceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PopulatedPlace thePopulatedPlace = (PopulatedPlace)findAncestorWithClass(this, PopulatedPlace.class);
			if (!thePopulatedPlace.commitNeeded) {
				pageContext.getOut().print(thePopulatedPlace.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PopulatedPlace thePopulatedPlace = (PopulatedPlace)findAncestorWithClass(this, PopulatedPlace.class);
			return thePopulatedPlace.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PopulatedPlace for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PopulatedPlace thePopulatedPlace = (PopulatedPlace)findAncestorWithClass(this, PopulatedPlace.class);
			thePopulatedPlace.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for label tag ");
		}
	}
}

