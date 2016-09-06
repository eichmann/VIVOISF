package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolGoverningAuthorityForIterator theSchoolGoverningAuthorityForIterator = (SchoolGoverningAuthorityForIterator)findAncestorWithClass(this, SchoolGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theSchoolGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

