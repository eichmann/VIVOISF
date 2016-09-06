package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DefinitionInformationResourceSupportedByIterator theDefinitionInformationResourceSupportedByIterator = (DefinitionInformationResourceSupportedByIterator)findAncestorWithClass(this, DefinitionInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theDefinitionInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

