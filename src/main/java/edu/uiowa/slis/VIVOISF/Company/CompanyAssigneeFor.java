package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyAssigneeForIterator theCompanyAssigneeForIterator = (CompanyAssigneeForIterator)findAncestorWithClass(this, CompanyAssigneeForIterator.class);
			pageContext.getOut().print(theCompanyAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

