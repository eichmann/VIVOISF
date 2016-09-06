package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			if (!theExtensionUnit.commitNeeded) {
				pageContext.getOut().print(theExtensionUnit.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			return theExtensionUnit.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ExtensionUnit for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ExtensionUnit theExtensionUnit = (ExtensionUnit)findAncestorWithClass(this, ExtensionUnit.class);
			theExtensionUnit.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for subjectURI tag ");
		}
	}
}

