package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			if (!theExtensionUnit.commitNeeded) {
				pageContext.getOut().print(theExtensionUnit.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			return theExtensionUnit.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing ExtensionUnit for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			theExtensionUnit.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for abbreviation tag ");
		}
	}
}

