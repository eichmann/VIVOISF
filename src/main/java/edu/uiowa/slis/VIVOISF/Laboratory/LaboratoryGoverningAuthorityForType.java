package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryGoverningAuthorityForIterator theLaboratoryGoverningAuthorityForIterator = (LaboratoryGoverningAuthorityForIterator)findAncestorWithClass(this, LaboratoryGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theLaboratoryGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

