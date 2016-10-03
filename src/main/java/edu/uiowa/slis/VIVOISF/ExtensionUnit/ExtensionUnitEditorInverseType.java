package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitEditorInverseIterator theExtensionUnitEditorInverseIterator = (ExtensionUnitEditorInverseIterator)findAncestorWithClass(this, ExtensionUnitEditorInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for editor tag ");
		}
		return SKIP_BODY;
	}
}

