package edu.uiowa.slis.VIVOISF.Workshop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Workshop theWorkshop = (Workshop)findAncestorWithClass(this, Workshop.class);
			if (!theWorkshop.commitNeeded) {
				pageContext.getOut().print(theWorkshop.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Workshop for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Workshop theWorkshop = (Workshop)findAncestorWithClass(this, Workshop.class);
			return theWorkshop.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Workshop for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Workshop theWorkshop = (Workshop)findAncestorWithClass(this, Workshop.class);
			theWorkshop.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Workshop for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for subjectURI tag ");
		}
	}
}

