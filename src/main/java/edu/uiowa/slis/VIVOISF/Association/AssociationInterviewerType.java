package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationInterviewerIterator theAssociationInterviewerIterator = (AssociationInterviewerIterator)findAncestorWithClass(this, AssociationInterviewerIterator.class);
			pageContext.getOut().print(theAssociationInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

