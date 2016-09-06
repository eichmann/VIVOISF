package edu.uiowa.slis.VIVOISF.PostdoctoralTraining;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdoctoralTrainingBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdoctoralTrainingBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdoctoralTrainingBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdoctoralTrainingBFO_0000055Iterator thePostdoctoralTrainingBFO_0000055Iterator = (PostdoctoralTrainingBFO_0000055Iterator)findAncestorWithClass(this, PostdoctoralTrainingBFO_0000055Iterator.class);
			pageContext.getOut().print(thePostdoctoralTrainingBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdoctoralTraining for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

