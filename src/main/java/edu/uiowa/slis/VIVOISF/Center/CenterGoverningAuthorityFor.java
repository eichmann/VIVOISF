package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterGoverningAuthorityForIterator theCenterGoverningAuthorityForIterator = (CenterGoverningAuthorityForIterator)findAncestorWithClass(this, CenterGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theCenterGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

