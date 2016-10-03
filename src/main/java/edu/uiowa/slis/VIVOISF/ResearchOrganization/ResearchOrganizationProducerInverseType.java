package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationProducerInverseIterator theResearchOrganizationProducerInverseIterator = (ResearchOrganizationProducerInverseIterator)findAncestorWithClass(this, ResearchOrganizationProducerInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for producer tag ");
		}
		return SKIP_BODY;
	}
}

