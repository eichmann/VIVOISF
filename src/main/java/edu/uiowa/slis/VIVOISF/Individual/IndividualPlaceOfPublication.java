package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			if (!theIndividual.commitNeeded) {
				pageContext.getOut().print(theIndividual.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			return theIndividual.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Individual for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			theIndividual.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for placeOfPublication tag ");
		}
	}
}

