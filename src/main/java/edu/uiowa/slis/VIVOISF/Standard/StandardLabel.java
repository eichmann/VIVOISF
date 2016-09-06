package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Standard theStandard = (Standard)findAncestorWithClass(this, Standard.class);
			if (!theStandard.commitNeeded) {
				pageContext.getOut().print(theStandard.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Standard theStandard = (Standard)findAncestorWithClass(this, Standard.class);
			return theStandard.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Standard for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Standard theStandard = (Standard)findAncestorWithClass(this, Standard.class);
			theStandard.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for label tag ");
		}
	}
}

