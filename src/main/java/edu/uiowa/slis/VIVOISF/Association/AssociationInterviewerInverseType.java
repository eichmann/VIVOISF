package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationInterviewerInverseIterator theAssociationInterviewerInverseIterator = (AssociationInterviewerInverseIterator)findAncestorWithClass(this, AssociationInterviewerInverseIterator.class);
			pageContext.getOut().print(theAssociationInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

