package edu.uiowa.slis.VIVOISF.Building;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BuildingRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BuildingRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BuildingRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BuildingRO_0000053Iterator theBuildingRO_0000053Iterator = (BuildingRO_0000053Iterator)findAncestorWithClass(this, BuildingRO_0000053Iterator.class);
			pageContext.getOut().print(theBuildingRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Building for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Building for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

