package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteRecipientInverseIterator theInstituteRecipientInverseIterator = (InstituteRecipientInverseIterator)findAncestorWithClass(this, InstituteRecipientInverseIterator.class);
			pageContext.getOut().print(theInstituteRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for recipient tag ");
		}
		return SKIP_BODY;
	}
}

