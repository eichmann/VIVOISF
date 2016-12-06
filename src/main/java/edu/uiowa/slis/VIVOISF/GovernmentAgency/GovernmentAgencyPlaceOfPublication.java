package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			if (!theGovernmentAgency.commitNeeded) {
				pageContext.getOut().print(theGovernmentAgency.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			return theGovernmentAgency.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing GovernmentAgency for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			theGovernmentAgency.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for placeOfPublication tag ");
		}
	}
}

