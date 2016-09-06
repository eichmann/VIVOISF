package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryGoverningAuthorityForIterator theCoreLaboratoryGoverningAuthorityForIterator = (CoreLaboratoryGoverningAuthorityForIterator)findAncestorWithClass(this, CoreLaboratoryGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theCoreLaboratoryGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

