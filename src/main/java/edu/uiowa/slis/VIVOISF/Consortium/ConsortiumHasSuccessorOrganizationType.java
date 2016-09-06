package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumHasSuccessorOrganizationIterator theConsortiumHasSuccessorOrganizationIterator = (ConsortiumHasSuccessorOrganizationIterator)findAncestorWithClass(this, ConsortiumHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theConsortiumHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

