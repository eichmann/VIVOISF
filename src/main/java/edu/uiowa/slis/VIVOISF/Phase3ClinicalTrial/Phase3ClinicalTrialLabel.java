package edu.uiowa.slis.VIVOISF.Phase3ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase3ClinicalTrialLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase3ClinicalTrialLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase3ClinicalTrialLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase3ClinicalTrial thePhase3ClinicalTrial = (Phase3ClinicalTrial)findAncestorWithClass(this, Phase3ClinicalTrial.class);
			if (!thePhase3ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase3ClinicalTrial.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase3ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase3ClinicalTrial for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase3ClinicalTrial thePhase3ClinicalTrial = (Phase3ClinicalTrial)findAncestorWithClass(this, Phase3ClinicalTrial.class);
			return thePhase3ClinicalTrial.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase3ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase3ClinicalTrial for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase3ClinicalTrial thePhase3ClinicalTrial = (Phase3ClinicalTrial)findAncestorWithClass(this, Phase3ClinicalTrial.class);
			thePhase3ClinicalTrial.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase3ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase3ClinicalTrial for label tag ");
		}
	}
}

