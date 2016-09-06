package edu.uiowa.slis.VIVOISF.Exhibit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExhibitSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExhibitSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ExhibitSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Exhibit theExhibit = (Exhibit)findAncestorWithClass(this, Exhibit.class);
			if (!theExhibit.commitNeeded) {
				pageContext.getOut().print(theExhibit.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Exhibit for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Exhibit theExhibit = (Exhibit)findAncestorWithClass(this, Exhibit.class);
			return theExhibit.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Exhibit for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Exhibit theExhibit = (Exhibit)findAncestorWithClass(this, Exhibit.class);
			theExhibit.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Exhibit for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for subjectURI tag ");
		}
	}
}

