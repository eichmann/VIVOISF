package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryHasGeoIterator theExplanatoryHasGeoIterator = (ExplanatoryHasGeoIterator)findAncestorWithClass(this, ExplanatoryHasGeoIterator.class);
			pageContext.getOut().print(theExplanatoryHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

