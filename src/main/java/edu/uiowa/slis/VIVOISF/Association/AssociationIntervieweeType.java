package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationIntervieweeIterator theAssociationIntervieweeIterator = (AssociationIntervieweeIterator)findAncestorWithClass(this, AssociationIntervieweeIterator.class);
			pageContext.getOut().print(theAssociationIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

