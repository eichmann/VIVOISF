package edu.uiowa.slis.VIVOISF.Geographical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicalSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicalSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicalSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Geographical theGeographical = (Geographical)findAncestorWithClass(this, Geographical.class);
			if (!theGeographical.commitNeeded) {
				pageContext.getOut().print(theGeographical.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Geographical theGeographical = (Geographical)findAncestorWithClass(this, Geographical.class);
			return theGeographical.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Geographical for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Geographical theGeographical = (Geographical)findAncestorWithClass(this, Geographical.class);
			theGeographical.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for subjectURI tag ");
		}
	}
}

