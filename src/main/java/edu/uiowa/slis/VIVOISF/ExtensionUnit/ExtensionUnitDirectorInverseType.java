package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitDirectorInverseIterator theExtensionUnitDirectorInverseIterator = (ExtensionUnitDirectorInverseIterator)findAncestorWithClass(this, ExtensionUnitDirectorInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for director tag ");
		}
		return SKIP_BODY;
	}
}

