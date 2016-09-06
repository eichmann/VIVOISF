package edu.uiowa.slis.VIVOISF.Building;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BuildingSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BuildingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BuildingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Building theBuilding = (Building)findAncestorWithClass(this, Building.class);
			if (!theBuilding.commitNeeded) {
				pageContext.getOut().print(theBuilding.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Building for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Building for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Building theBuilding = (Building)findAncestorWithClass(this, Building.class);
			return theBuilding.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Building for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Building for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Building theBuilding = (Building)findAncestorWithClass(this, Building.class);
			theBuilding.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Building for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Building for subjectURI tag ");
		}
	}
}

