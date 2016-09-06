package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			if (!theGeographicRegion.commitNeeded) {
				pageContext.getOut().print(theGeographicRegion.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			return theGeographicRegion.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeographicRegion for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GeographicRegion theGeographicRegion = (GeographicRegion)findAncestorWithClass(this, GeographicRegion.class);
			theGeographicRegion.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for subjectURI tag ");
		}
	}
}

