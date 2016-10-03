package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteOwnerInverseIterator theInstituteOwnerInverseIterator = (InstituteOwnerInverseIterator)findAncestorWithClass(this, InstituteOwnerInverseIterator.class);
			pageContext.getOut().print(theInstituteOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for owner tag ");
		}
		return SKIP_BODY;
	}
}

