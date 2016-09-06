package edu.uiowa.slis.VIVOISF.Phase2ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase2ClinicalTrialLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase2ClinicalTrialLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase2ClinicalTrialLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase2ClinicalTrial thePhase2ClinicalTrial = (Phase2ClinicalTrial)findAncestorWithClass(this, Phase2ClinicalTrial.class);
			if (!thePhase2ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase2ClinicalTrial.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase2ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase2ClinicalTrial for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase2ClinicalTrial thePhase2ClinicalTrial = (Phase2ClinicalTrial)findAncestorWithClass(this, Phase2ClinicalTrial.class);
			return thePhase2ClinicalTrial.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase2ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase2ClinicalTrial for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase2ClinicalTrial thePhase2ClinicalTrial = (Phase2ClinicalTrial)findAncestorWithClass(this, Phase2ClinicalTrial.class);
			thePhase2ClinicalTrial.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase2ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase2ClinicalTrial for label tag ");
		}
	}
}

