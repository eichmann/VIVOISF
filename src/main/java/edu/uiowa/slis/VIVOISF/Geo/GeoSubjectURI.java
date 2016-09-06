package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeoSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeoSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GeoSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Geo theGeo = (Geo)findAncestorWithClass(this, Geo.class);
			if (!theGeo.commitNeeded) {
				pageContext.getOut().print(theGeo.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Geo theGeo = (Geo)findAncestorWithClass(this, Geo.class);
			return theGeo.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Geo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Geo theGeo = (Geo)findAncestorWithClass(this, Geo.class);
			theGeo.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for subjectURI tag ");
		}
	}
}

