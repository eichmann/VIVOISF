package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationProducerInverseIterator theOrganizationProducerInverseIterator = (OrganizationProducerInverseIterator)findAncestorWithClass(this, OrganizationProducerInverseIterator.class);
			pageContext.getOut().print(theOrganizationProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for producer tag ");
		}
		return SKIP_BODY;
	}
}

