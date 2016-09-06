package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityGoverningAuthorityForIterator theUniversityGoverningAuthorityForIterator = (UniversityGoverningAuthorityForIterator)findAncestorWithClass(this, UniversityGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theUniversityGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing University for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

