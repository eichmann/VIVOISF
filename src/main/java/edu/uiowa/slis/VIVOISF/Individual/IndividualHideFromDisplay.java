package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			if (!theIndividual.commitNeeded) {
				pageContext.getOut().print(theIndividual.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			return theIndividual.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Individual for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			theIndividual.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hideFromDisplay tag ");
		}
	}
}

