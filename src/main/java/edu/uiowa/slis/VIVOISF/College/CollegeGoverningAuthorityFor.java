package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeGoverningAuthorityForIterator theCollegeGoverningAuthorityForIterator = (CollegeGoverningAuthorityForIterator)findAncestorWithClass(this, CollegeGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theCollegeGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing College for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

