package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationProducerInverseIterator theResearchOrganizationProducerInverseIterator = (ResearchOrganizationProducerInverseIterator)findAncestorWithClass(this, ResearchOrganizationProducerInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for producer tag ");
		}
		return SKIP_BODY;
	}
}

