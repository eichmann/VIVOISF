package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteRecipientInverseIterator theInstituteRecipientInverseIterator = (InstituteRecipientInverseIterator)findAncestorWithClass(this, InstituteRecipientInverseIterator.class);
			pageContext.getOut().print(theInstituteRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for recipient tag ");
		}
		return SKIP_BODY;
	}
}

