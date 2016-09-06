package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversitySubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversitySubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversitySubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversitySubcontractsGrantIterator theUniversitySubcontractsGrantIterator = (UniversitySubcontractsGrantIterator)findAncestorWithClass(this, UniversitySubcontractsGrantIterator.class);
			pageContext.getOut().print(theUniversitySubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

