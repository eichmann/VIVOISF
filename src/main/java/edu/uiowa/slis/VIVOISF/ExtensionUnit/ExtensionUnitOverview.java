package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			if (!theExtensionUnit.commitNeeded) {
				pageContext.getOut().print(theExtensionUnit.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			return theExtensionUnit.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing ExtensionUnit for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			theExtensionUnit.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for overview tag ");
		}
	}
}

