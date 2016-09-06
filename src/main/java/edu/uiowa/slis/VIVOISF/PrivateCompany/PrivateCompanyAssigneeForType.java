package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyAssigneeForIterator thePrivateCompanyAssigneeForIterator = (PrivateCompanyAssigneeForIterator)findAncestorWithClass(this, PrivateCompanyAssigneeForIterator.class);
			pageContext.getOut().print(thePrivateCompanyAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

