package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeSubcontractsGrantIterator theCollegeSubcontractsGrantIterator = (CollegeSubcontractsGrantIterator)findAncestorWithClass(this, CollegeSubcontractsGrantIterator.class);
			pageContext.getOut().print(theCollegeSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing College for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

