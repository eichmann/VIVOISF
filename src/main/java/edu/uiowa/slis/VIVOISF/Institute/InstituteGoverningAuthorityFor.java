package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteGoverningAuthorityForIterator theInstituteGoverningAuthorityForIterator = (InstituteGoverningAuthorityForIterator)findAncestorWithClass(this, InstituteGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theInstituteGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

