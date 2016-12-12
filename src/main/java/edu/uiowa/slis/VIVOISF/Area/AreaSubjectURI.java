package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Area theArea = (Area)findAncestorWithClass(this, Area.class);
			if (!theArea.commitNeeded) {
				pageContext.getOut().print(theArea.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Area for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Area theArea = (Area)findAncestorWithClass(this, Area.class);
			return theArea.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Area for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Area theArea = (Area)findAncestorWithClass(this, Area.class);
			theArea.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Area for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for subjectURI tag ");
		}
	}
}

