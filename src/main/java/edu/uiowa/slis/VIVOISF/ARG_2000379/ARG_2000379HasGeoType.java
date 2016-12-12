package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasGeoType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasGeoType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasGeoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasGeoIterator theARG_2000379HasGeoIterator = (ARG_2000379HasGeoIterator)findAncestorWithClass(this, ARG_2000379HasGeoIterator.class);
			pageContext.getOut().print(theARG_2000379HasGeoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

