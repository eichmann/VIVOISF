package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			if (!theIndividual.commitNeeded) {
				pageContext.getOut().print(theIndividual.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			return theIndividual.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Individual for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			theIndividual.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for abbreviation tag ");
		}
	}
}

