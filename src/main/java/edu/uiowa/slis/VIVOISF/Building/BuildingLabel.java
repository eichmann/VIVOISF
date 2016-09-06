package edu.uiowa.slis.VIVOISF.Building;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BuildingLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BuildingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BuildingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Building theBuilding = (Building)findAncestorWithClass(this, Building.class);
			if (!theBuilding.commitNeeded) {
				pageContext.getOut().print(theBuilding.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Building for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Building for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Building theBuilding = (Building)findAncestorWithClass(this, Building.class);
			return theBuilding.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Building for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Building for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Building theBuilding = (Building)findAncestorWithClass(this, Building.class);
			theBuilding.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Building for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Building for label tag ");
		}
	}
}

