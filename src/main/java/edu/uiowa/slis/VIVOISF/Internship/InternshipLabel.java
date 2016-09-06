package edu.uiowa.slis.VIVOISF.Internship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InternshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InternshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InternshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Internship theInternship = (Internship)findAncestorWithClass(this, Internship.class);
			if (!theInternship.commitNeeded) {
				pageContext.getOut().print(theInternship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Internship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Internship theInternship = (Internship)findAncestorWithClass(this, Internship.class);
			return theInternship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Internship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Internship theInternship = (Internship)findAncestorWithClass(this, Internship.class);
			theInternship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Internship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for label tag ");
		}
	}
}

