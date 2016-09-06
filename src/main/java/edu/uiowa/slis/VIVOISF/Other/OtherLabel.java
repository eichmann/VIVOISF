package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(otherLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			other theother = (other)findAncestorWithClass(this, other.class);
			if (!theother.commitNeeded) {
				pageContext.getOut().print(theother.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing other for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			other theother = (other)findAncestorWithClass(this, other.class);
			return theother.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing other for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			other theother = (other)findAncestorWithClass(this, other.class);
			theother.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing other for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for label tag ");
		}
	}
}

