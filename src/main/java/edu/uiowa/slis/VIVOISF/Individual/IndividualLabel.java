package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			if (!theIndividual.commitNeeded) {
				pageContext.getOut().print(theIndividual.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			return theIndividual.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Individual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			theIndividual.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for label tag ");
		}
	}
}

