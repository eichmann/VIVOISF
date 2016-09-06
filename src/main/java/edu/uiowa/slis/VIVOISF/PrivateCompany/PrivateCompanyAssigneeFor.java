package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyAssigneeForIterator thePrivateCompanyAssigneeForIterator = (PrivateCompanyAssigneeForIterator)findAncestorWithClass(this, PrivateCompanyAssigneeForIterator.class);
			pageContext.getOut().print(thePrivateCompanyAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

