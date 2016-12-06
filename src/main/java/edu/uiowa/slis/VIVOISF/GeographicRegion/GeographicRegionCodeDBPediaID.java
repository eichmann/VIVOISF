package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeDBPediaIDIterator theGeographicRegion = (GeographicRegionCodeDBPediaIDIterator)findAncestorWithClass(this, GeographicRegionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

