package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Identification theIdentification = (Identification)findAncestorWithClass(this, Identification.class);
			if (!theIdentification.commitNeeded) {
				pageContext.getOut().print(theIdentification.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Identification theIdentification = (Identification)findAncestorWithClass(this, Identification.class);
			return theIdentification.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Identification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Identification theIdentification = (Identification)findAncestorWithClass(this, Identification.class);
			theIdentification.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for label tag ");
		}
	}
}

