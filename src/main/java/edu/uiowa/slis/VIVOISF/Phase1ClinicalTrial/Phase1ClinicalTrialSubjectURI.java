package edu.uiowa.slis.VIVOISF.Phase1ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase1ClinicalTrialSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase1ClinicalTrialSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase1ClinicalTrialSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase1ClinicalTrial thePhase1ClinicalTrial = (Phase1ClinicalTrial)findAncestorWithClass(this, Phase1ClinicalTrial.class);
			if (!thePhase1ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase1ClinicalTrial.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase1ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase1ClinicalTrial for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase1ClinicalTrial thePhase1ClinicalTrial = (Phase1ClinicalTrial)findAncestorWithClass(this, Phase1ClinicalTrial.class);
			return thePhase1ClinicalTrial.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase1ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase1ClinicalTrial for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase1ClinicalTrial thePhase1ClinicalTrial = (Phase1ClinicalTrial)findAncestorWithClass(this, Phase1ClinicalTrial.class);
			thePhase1ClinicalTrial.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase1ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase1ClinicalTrial for subjectURI tag ");
		}
	}
}

