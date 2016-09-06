package edu.uiowa.slis.VIVOISF.PopulatedPlace;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PopulatedPlaceRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PopulatedPlaceRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PopulatedPlaceRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PopulatedPlaceRO_0000056Iterator thePopulatedPlaceRO_0000056Iterator = (PopulatedPlaceRO_0000056Iterator)findAncestorWithClass(this, PopulatedPlaceRO_0000056Iterator.class);
			pageContext.getOut().print(thePopulatedPlaceRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

