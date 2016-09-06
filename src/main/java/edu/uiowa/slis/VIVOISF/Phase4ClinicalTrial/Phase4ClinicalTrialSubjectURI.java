package edu.uiowa.slis.VIVOISF.Phase4ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase4ClinicalTrialSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase4ClinicalTrialSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase4ClinicalTrialSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase4ClinicalTrial thePhase4ClinicalTrial = (Phase4ClinicalTrial)findAncestorWithClass(this, Phase4ClinicalTrial.class);
			if (!thePhase4ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase4ClinicalTrial.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase4ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase4ClinicalTrial for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase4ClinicalTrial thePhase4ClinicalTrial = (Phase4ClinicalTrial)findAncestorWithClass(this, Phase4ClinicalTrial.class);
			return thePhase4ClinicalTrial.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase4ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase4ClinicalTrial for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase4ClinicalTrial thePhase4ClinicalTrial = (Phase4ClinicalTrial)findAncestorWithClass(this, Phase4ClinicalTrial.class);
			thePhase4ClinicalTrial.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase4ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase4ClinicalTrial for subjectURI tag ");
		}
	}
}

