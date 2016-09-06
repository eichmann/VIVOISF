package edu.uiowa.slis.VIVOISF.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DateSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Date theDate = (Date)findAncestorWithClass(this, Date.class);
			if (!theDate.commitNeeded) {
				pageContext.getOut().print(theDate.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Date for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Date for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Date theDate = (Date)findAncestorWithClass(this, Date.class);
			return theDate.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Date for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Date for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Date theDate = (Date)findAncestorWithClass(this, Date.class);
			theDate.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Date for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Date for subjectURI tag ");
		}
	}
}

