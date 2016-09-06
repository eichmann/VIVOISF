package edu.uiowa.slis.VIVOISF.PostdoctoralTraining;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdoctoralTrainingLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdoctoralTrainingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdoctoralTrainingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdoctoralTraining thePostdoctoralTraining = (PostdoctoralTraining)findAncestorWithClass(this, PostdoctoralTraining.class);
			if (!thePostdoctoralTraining.commitNeeded) {
				pageContext.getOut().print(thePostdoctoralTraining.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdoctoralTraining for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PostdoctoralTraining thePostdoctoralTraining = (PostdoctoralTraining)findAncestorWithClass(this, PostdoctoralTraining.class);
			return thePostdoctoralTraining.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdoctoralTraining for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PostdoctoralTraining thePostdoctoralTraining = (PostdoctoralTraining)findAncestorWithClass(this, PostdoctoralTraining.class);
			thePostdoctoralTraining.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdoctoralTraining for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for label tag ");
		}
	}
}

