package edu.uiowa.slis.VIVOISF.Phase2ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase2ClinicalTrialSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase2ClinicalTrialSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase2ClinicalTrialSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase2ClinicalTrial thePhase2ClinicalTrial = (Phase2ClinicalTrial)findAncestorWithClass(this, Phase2ClinicalTrial.class);
			if (!thePhase2ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase2ClinicalTrial.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase2ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase2ClinicalTrial for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase2ClinicalTrial thePhase2ClinicalTrial = (Phase2ClinicalTrial)findAncestorWithClass(this, Phase2ClinicalTrial.class);
			return thePhase2ClinicalTrial.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase2ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase2ClinicalTrial for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase2ClinicalTrial thePhase2ClinicalTrial = (Phase2ClinicalTrial)findAncestorWithClass(this, Phase2ClinicalTrial.class);
			thePhase2ClinicalTrial.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase2ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase2ClinicalTrial for subjectURI tag ");
		}
	}
}

