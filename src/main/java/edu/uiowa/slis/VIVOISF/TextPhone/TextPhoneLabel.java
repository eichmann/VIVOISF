package edu.uiowa.slis.VIVOISF.TextPhone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextPhoneLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TextPhoneLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TextPhoneLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TextPhone theTextPhone = (TextPhone)findAncestorWithClass(this, TextPhone.class);
			if (!theTextPhone.commitNeeded) {
				pageContext.getOut().print(theTextPhone.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TextPhone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TextPhone for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TextPhone theTextPhone = (TextPhone)findAncestorWithClass(this, TextPhone.class);
			return theTextPhone.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TextPhone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TextPhone for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TextPhone theTextPhone = (TextPhone)findAncestorWithClass(this, TextPhone.class);
			theTextPhone.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TextPhone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TextPhone for label tag ");
		}
	}
}

