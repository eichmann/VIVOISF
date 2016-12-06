package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeDBPediaIDIterator theGeographicLocation = (GeographicLocationCodeDBPediaIDIterator)findAncestorWithClass(this, GeographicLocationCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

