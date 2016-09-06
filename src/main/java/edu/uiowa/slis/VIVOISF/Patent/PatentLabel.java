package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			if (!thePatent.commitNeeded) {
				pageContext.getOut().print(thePatent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			return thePatent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Patent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			thePatent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for label tag ");
		}
	}
}

