package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			if (!theGeographicLocation.commitNeeded) {
				pageContext.getOut().print(theGeographicLocation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			return theGeographicLocation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicLocation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GeographicLocation theGeographicLocation = (GeographicLocation)findAncestorWithClass(this, GeographicLocation.class);
			theGeographicLocation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for subjectURI tag ");
		}
	}
}

