package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryHasGeoType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryHasGeoType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryHasGeoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryHasGeoIterator theExplanatoryHasGeoIterator = (ExplanatoryHasGeoIterator)findAncestorWithClass(this, ExplanatoryHasGeoIterator.class);
			pageContext.getOut().print(theExplanatoryHasGeoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

