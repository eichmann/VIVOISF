package edu.uiowa.slis.VIVOISF.Phase0ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase0ClinicalTrialLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase0ClinicalTrialLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase0ClinicalTrialLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase0ClinicalTrial thePhase0ClinicalTrial = (Phase0ClinicalTrial)findAncestorWithClass(this, Phase0ClinicalTrial.class);
			if (!thePhase0ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase0ClinicalTrial.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase0ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase0ClinicalTrial for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase0ClinicalTrial thePhase0ClinicalTrial = (Phase0ClinicalTrial)findAncestorWithClass(this, Phase0ClinicalTrial.class);
			return thePhase0ClinicalTrial.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase0ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase0ClinicalTrial for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase0ClinicalTrial thePhase0ClinicalTrial = (Phase0ClinicalTrial)findAncestorWithClass(this, Phase0ClinicalTrial.class);
			thePhase0ClinicalTrial.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase0ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase0ClinicalTrial for label tag ");
		}
	}
}

