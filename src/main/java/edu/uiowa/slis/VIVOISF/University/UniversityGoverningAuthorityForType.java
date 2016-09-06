package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityGoverningAuthorityForIterator theUniversityGoverningAuthorityForIterator = (UniversityGoverningAuthorityForIterator)findAncestorWithClass(this, UniversityGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theUniversityGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

