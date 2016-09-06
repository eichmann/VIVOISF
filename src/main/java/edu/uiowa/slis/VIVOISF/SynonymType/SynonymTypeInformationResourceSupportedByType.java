package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymTypeInformationResourceSupportedByIterator theSynonymTypeInformationResourceSupportedByIterator = (SynonymTypeInformationResourceSupportedByIterator)findAncestorWithClass(this, SynonymTypeInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theSynonymTypeInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

