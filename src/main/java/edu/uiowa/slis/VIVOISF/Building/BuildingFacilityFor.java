package edu.uiowa.slis.VIVOISF.Building;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BuildingFacilityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BuildingFacilityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(BuildingFacilityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BuildingFacilityForIterator theBuildingFacilityForIterator = (BuildingFacilityForIterator)findAncestorWithClass(this, BuildingFacilityForIterator.class);
			pageContext.getOut().print(theBuildingFacilityForIterator.getFacilityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Building for facilityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Building for facilityFor tag ");
		}
		return SKIP_BODY;
	}
}

