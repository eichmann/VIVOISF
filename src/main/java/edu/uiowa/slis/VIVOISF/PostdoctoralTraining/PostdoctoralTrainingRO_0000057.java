package edu.uiowa.slis.VIVOISF.PostdoctoralTraining;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdoctoralTrainingRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdoctoralTrainingRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdoctoralTrainingRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdoctoralTrainingRO_0000057Iterator thePostdoctoralTrainingRO_0000057Iterator = (PostdoctoralTrainingRO_0000057Iterator)findAncestorWithClass(this, PostdoctoralTrainingRO_0000057Iterator.class);
			pageContext.getOut().print(thePostdoctoralTrainingRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdoctoralTraining for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

