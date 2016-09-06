package edu.uiowa.slis.VIVOISF.Phase0ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase0ClinicalTrialSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase0ClinicalTrialSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase0ClinicalTrialSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase0ClinicalTrial thePhase0ClinicalTrial = (Phase0ClinicalTrial)findAncestorWithClass(this, Phase0ClinicalTrial.class);
			if (!thePhase0ClinicalTrial.commitNeeded) {
				pageContext.getOut().print(thePhase0ClinicalTrial.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase0ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase0ClinicalTrial for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase0ClinicalTrial thePhase0ClinicalTrial = (Phase0ClinicalTrial)findAncestorWithClass(this, Phase0ClinicalTrial.class);
			return thePhase0ClinicalTrial.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase0ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase0ClinicalTrial for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase0ClinicalTrial thePhase0ClinicalTrial = (Phase0ClinicalTrial)findAncestorWithClass(this, Phase0ClinicalTrial.class);
			thePhase0ClinicalTrial.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase0ClinicalTrial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase0ClinicalTrial for subjectURI tag ");
		}
	}
}

