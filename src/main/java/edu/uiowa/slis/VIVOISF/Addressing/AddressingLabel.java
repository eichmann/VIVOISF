package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Addressing theAddressing = (Addressing)findAncestorWithClass(this, Addressing.class);
			if (!theAddressing.commitNeeded) {
				pageContext.getOut().print(theAddressing.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Addressing theAddressing = (Addressing)findAncestorWithClass(this, Addressing.class);
			return theAddressing.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Addressing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Addressing theAddressing = (Addressing)findAncestorWithClass(this, Addressing.class);
			theAddressing.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for label tag ");
		}
	}
}

