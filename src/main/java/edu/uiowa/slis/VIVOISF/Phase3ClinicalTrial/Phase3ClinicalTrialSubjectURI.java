package edu.uiowa.slis.VIVOISF.Phase3ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase3ClinicalTrialSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase3ClinicalTrialSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase3ClinicalTrialSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase3ClinicalTrial thePhase3ClinicalTrial = (Phase3ClinicalTrial)findAncestorWithClass(this, Phase3ClinicalTrial.class);
			if (!thePhase3ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase3ClinicalTrial.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase3ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase3ClinicalTrial for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase3ClinicalTrial thePhase3ClinicalTrial = (Phase3ClinicalTrial)findAncestorWithClass(this, Phase3ClinicalTrial.class);
			return thePhase3ClinicalTrial.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase3ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase3ClinicalTrial for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase3ClinicalTrial thePhase3ClinicalTrial = (Phase3ClinicalTrial)findAncestorWithClass(this, Phase3ClinicalTrial.class);
			thePhase3ClinicalTrial.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase3ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase3ClinicalTrial for subjectURI tag ");
		}
	}
}

