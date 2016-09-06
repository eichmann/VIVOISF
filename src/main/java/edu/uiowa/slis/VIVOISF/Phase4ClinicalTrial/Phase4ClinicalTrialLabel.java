package edu.uiowa.slis.VIVOISF.Phase4ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase4ClinicalTrialLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase4ClinicalTrialLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase4ClinicalTrialLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase4ClinicalTrial thePhase4ClinicalTrial = (Phase4ClinicalTrial)findAncestorWithClass(this, Phase4ClinicalTrial.class);
			if (!thePhase4ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase4ClinicalTrial.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase4ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase4ClinicalTrial for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase4ClinicalTrial thePhase4ClinicalTrial = (Phase4ClinicalTrial)findAncestorWithClass(this, Phase4ClinicalTrial.class);
			return thePhase4ClinicalTrial.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase4ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase4ClinicalTrial for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase4ClinicalTrial thePhase4ClinicalTrial = (Phase4ClinicalTrial)findAncestorWithClass(this, Phase4ClinicalTrial.class);
			thePhase4ClinicalTrial.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase4ClinicalTrial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase4ClinicalTrial for label tag ");
		}
	}
}

