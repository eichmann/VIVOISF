package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationIntervieweeInverseIterator theAssociationIntervieweeInverseIterator = (AssociationIntervieweeInverseIterator)findAncestorWithClass(this, AssociationIntervieweeInverseIterator.class);
			pageContext.getOut().print(theAssociationIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

