package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationAssigneeForIterator theAssociationAssigneeForIterator = (AssociationAssigneeForIterator)findAncestorWithClass(this, AssociationAssigneeForIterator.class);
			pageContext.getOut().print(theAssociationAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

