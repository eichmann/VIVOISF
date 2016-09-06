package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			if (!theInstitute.commitNeeded) {
				pageContext.getOut().print(theInstitute.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			return theInstitute.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Institute for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			theInstitute.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for label tag ");
		}
	}
}

