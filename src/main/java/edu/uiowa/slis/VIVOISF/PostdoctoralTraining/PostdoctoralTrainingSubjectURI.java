package edu.uiowa.slis.VIVOISF.PostdoctoralTraining;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdoctoralTrainingSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdoctoralTrainingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdoctoralTrainingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdoctoralTraining thePostdoctoralTraining = (PostdoctoralTraining)findAncestorWithClass(this, PostdoctoralTraining.class);
			if (!thePostdoctoralTraining.commitNeeded) {
				pageContext.getOut().print(thePostdoctoralTraining.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdoctoralTraining for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PostdoctoralTraining thePostdoctoralTraining = (PostdoctoralTraining)findAncestorWithClass(this, PostdoctoralTraining.class);
			return thePostdoctoralTraining.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdoctoralTraining for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PostdoctoralTraining thePostdoctoralTraining = (PostdoctoralTraining)findAncestorWithClass(this, PostdoctoralTraining.class);
			thePostdoctoralTraining.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdoctoralTraining for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for subjectURI tag ");
		}
	}
}

