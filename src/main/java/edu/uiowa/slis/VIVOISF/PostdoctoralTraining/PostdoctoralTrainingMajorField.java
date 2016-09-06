package edu.uiowa.slis.VIVOISF.PostdoctoralTraining;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdoctoralTrainingMajorField extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdoctoralTrainingMajorField currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdoctoralTrainingMajorField.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdoctoralTrainingMajorFieldIterator thePostdoctoralTraining = (PostdoctoralTrainingMajorFieldIterator)findAncestorWithClass(this, PostdoctoralTrainingMajorFieldIterator.class);
			pageContext.getOut().print(thePostdoctoralTraining.getMajorField());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdoctoralTraining for majorField tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for majorField tag ");
		}
		return SKIP_BODY;
	}
}

