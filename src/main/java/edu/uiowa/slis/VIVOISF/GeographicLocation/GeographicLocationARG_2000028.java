package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationARG_2000028Iterator theGeographicLocationARG_2000028Iterator = (GeographicLocationARG_2000028Iterator)findAncestorWithClass(this, GeographicLocationARG_2000028Iterator.class);
			pageContext.getOut().print(theGeographicLocationARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

