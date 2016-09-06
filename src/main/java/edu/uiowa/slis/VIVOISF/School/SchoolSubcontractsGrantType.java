package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolSubcontractsGrantIterator theSchoolSubcontractsGrantIterator = (SchoolSubcontractsGrantIterator)findAncestorWithClass(this, SchoolSubcontractsGrantIterator.class);
			pageContext.getOut().print(theSchoolSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

