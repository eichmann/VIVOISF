package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			if (!theExtensionUnit.commitNeeded) {
				pageContext.getOut().print(theExtensionUnit.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			return theExtensionUnit.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ExtensionUnit for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			theExtensionUnit.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for label tag ");
		}
	}
}

