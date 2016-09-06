package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeGoverningAuthorityForIterator theCollegeGoverningAuthorityForIterator = (CollegeGoverningAuthorityForIterator)findAncestorWithClass(this, CollegeGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theCollegeGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

