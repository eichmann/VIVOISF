package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			if (!theSchool.commitNeeded) {
				pageContext.getOut().print(theSchool.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing School for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			return theSchool.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing School for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			theSchool.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing School for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for label tag ");
		}
	}
}

