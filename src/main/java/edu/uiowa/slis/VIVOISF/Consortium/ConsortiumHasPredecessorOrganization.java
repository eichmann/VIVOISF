package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumHasPredecessorOrganizationIterator theConsortiumHasPredecessorOrganizationIterator = (ConsortiumHasPredecessorOrganizationIterator)findAncestorWithClass(this, ConsortiumHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theConsortiumHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

